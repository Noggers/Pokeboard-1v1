import os

from my.pokeboard.utils.Enum import Enum
from my.pokeboard.utils.Switch import Switch

"""
Possible commands:
EXIT: will cause the console to exit the program

CLEAR: will clear the console, for readability purposes. does not change object states

DRAW (DECK | PRIZES) [n]: will draw n cards from the deck or prizes into the hand,
                          or one of them if a count is not specified

PLAY id .. : will play the card which matches the id given from the hand onto the board

DISCARD (BOARD | HAND) id ... : will discard cards by id from the board or hand

RETURN (BOARD | HAND | DISCARD) id ... : will return cards by id from the board, hand or discard to the deck which
                                           has matching clue-text

SHOW (BOARD | HAND | PRIZES | DECK | DISCARD) [n]: shows the first n elements of the given collection,
                                                   or all of them if a count is not specified

SHUFFLE: will shuffle the deck

RESET: will reset the state of the deck manager by moving all cards to the deck, shuffling, and drawing out 6 prizes
"""

Commands = Enum(["EXIT", "CLEAR", "DRAW", "PLAY", "DISCARD", "RETURN", "SHOW", "SHUFFLE", "RESET"])

_clear_text = '\n' * 1000
_argument_error_message = "Please enter the correct number of arguments."
_deck_shuffled_message = "Deck shuffled"
_cards_drawn_message = "Cards drawn"
_reset_message = "Deck manager has been reset"
_played_card_message = "Played a card from hand"
_discarded_cards_message = "Discarded cards"


def safe_clear():
    os.system('clear')  # 'cls')  # if os.name == "nt" else "clear")


def run_console(deck_manager):
    exit_now = False
    while not exit_now:
        args = raw_input("Command: ").upper().split()
        if len(args) == 0:
            args = [""]
        command = args[0]
        args = args[1:]
        for case in Switch(command):
            if case(Commands.EXIT):
                exit_now = True
                break
            if case(Commands.CLEAR):
                # safe_clear()
                # print _clear_text
                break
            if case(Commands.DRAW):
                if len(args) < 1:
                    print _argument_error_message
                if len(args) < 2:
                    deck_manager.draw_cards(args[0])
                else:
                    deck_manager.draw_cards(args[0], int(args[1]))
                print _cards_drawn_message
                print deck_manager.show_cards()
                break
            if case(Commands.PLAY):
                if len(args) < 1:
                    print _argument_error_message
                deck_manager.play_card(map(int, args))
                print _played_card_message
                print deck_manager.show_cards("BOARD")
                break
            if case(Commands.DISCARD):
                if len(args) < 2:
                    print _argument_error_message
                deck_manager.discard_cards(args[0], map(int, args[1:]))
                print _discarded_cards_message
                print deck_manager.show_cards("DISCARD")
                break
            if case(Commands.RETURN):
                if len(args) < 2:
                    print _argument_error_message
                deck_manager.return_cards(args[0], map(int, args[1:]))
                break
            if case(Commands.SHOW):
                if len(args) < 1:
                    print _argument_error_message
                    break
                if len(args) < 2:
                    shown = deck_manager.show_cards(args[0])
                else:
                    shown = deck_manager.show_cards(args[0], int(args[1]))
                print shown
                break
            if case(Commands.SHUFFLE):
                deck_manager.shuffle_deck()
                print _deck_shuffled_message
                break
            if case(Commands.RESET):
                deck_manager.reset()
                print _reset_message
                break
            if case():
                break
    print "Exiting Deck Manager"
