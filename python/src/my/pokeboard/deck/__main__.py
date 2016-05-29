from DeckConsoleInterface import run_console
from PokemonCard import PokemonCard
from DeckManager import DeckManager

"""
Launches deck manager by asking the user for a file path to the saved deck build

Then, we want to constitute that into a list of cards, and feed it to a DeckManager
From there on out, we want the console to constantly sit and wait for messages from the user
"""


def read_card_file(file_path):
    deck_file = open(file_path, 'r')
    cards = {}
    for line in deck_file:
        parts = line.split(',')
        if len(parts) < 2:
            raise IndexError("Invalid line in file.")
        card = PokemonCard(int(parts[0]), parts[1].rstrip('\n'))
        cards[card.id] = card
    return cards

print "Loading Deck Manager..."
deck_path = raw_input("Please enter path to deck file (empty: default): ")
if deck_path == "":
    deck_path = "/Users/michaelj/Documents/Pokeboard/default.dk"
print "Loading deck file from " + deck_path
deck_build = read_card_file(deck_path)
print "Deck loaded. Showing:"
print deck_build
print "Creating deck manager..."
deck_manager = DeckManager(deck_build.values())
print "Starting deck console..."
run_console(deck_manager)
