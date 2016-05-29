from random import shuffle

from my.pokeboard.utils.Switch import Switch
from my.pokeboard.utils.Enum import Enum

_deck_size = 60
_prize_count = 6
Regions = Enum(["DECK", "BOARD", "HAND", "PRIZES", "DISCARD"])


class DeckManager(object):
    prizes = []
    deck = []
    hand = []
    discard = []
    board = []

    def __init__(self, deck_build):
        if len(deck_build) < _deck_size:
            raise "Decks are limited to exactly 60 cards"
        self.deck = deck_build
        self.__shuffle_and_deal_prizes__()

    def draw_cards(self, region=Regions.DECK, count=1):
        for case in Switch(region):
            if case(Regions.DECK):
                draw_region = self.deck
                break
            if case(Regions.PRIZES):
                draw_region = self.prizes
                break
            if case():
                raise AttributeError("Invalid region")
        self.hand.extend(draw_region[:count])
        for i in range(count):
            draw_region.pop(0)

    def play_card(self, card_ids):
        """
        moves a card from the hand onto the board
        """
        cards = [card for card in self.hand if card.id in card_ids]
        self.board.extend(cards)
        for card in cards:
            self.hand.remove(card)

    def discard_cards(self, region=Regions.HAND, card_ids=[]):
        """
        moves cards from the hand into the discard
        """
        for case in Switch(region):
            if case(Regions.BOARD):
                discard_region = self.board
                break
            if case(Regions.HAND):
                discard_region = self.hand
                break
            if case():
                raise AttributeError("Invalid region")
        cards = [card for card in discard_region if card.id in card_ids]
        self.discard.extend(cards)
        for card in cards:
            discard_region.remove(card)

    def return_cards(self, region=Regions.HAND, card_ids=[], shuffle_deck=True):
        """
        moves cards to the top of the deck, optionally shuffling afterwards
        """
        for case in Switch(region):
            if case(Regions.HAND):
                return_region = self.hand
                break
            if case(Regions.DISCARD):
                return_region = self.discard
                break
            if case():
                raise AttributeError("Invalid region")
        cards = [card for card in return_region if card.id in card_ids]
        self.deck = cards + self.deck
        for card in cards:
            return_region.remove(card)
        if shuffle_deck:
            self.shuffle_deck()

    def show_cards(self, region=Regions.HAND, count=_deck_size):
        for case in Switch(region):
            if case(Regions.HAND):
                shown_cards = self.hand
                break
            if case(Regions.DECK):
                shown_cards = self.deck[:count]
                break
            if case(Regions.BOARD):
                shown_cards = self.board
                break
            if case(Regions.DISCARD):
                shown_cards = self.discard[:count]
                break
            if case(Regions.PRIZES):
                shown_cards = self.prizes[:count]
                break
            if case():
                raise AttributeError("Invalid region")
        return shown_cards

    def shuffle_deck(self):
        """
        shuffles the current deck
        """
        shuffle(self.deck)

    def reset(self):
        """
        resets the state of the manager by moving everything to the deck and shuffling
        """
        self.deck.extend(self.hand + self.board + self.discard + self.prizes)
        self.hand = []
        self.board = []
        self.discard = []
        self.prizes = []
        self.__shuffle_and_deal_prizes__()

    def __shuffle_and_deal_prizes__(self):
        self.shuffle_deck()
        self.prizes = self.deck[:_prize_count]
        self.deck = self.deck[_prize_count:]
