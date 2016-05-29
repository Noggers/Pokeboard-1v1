import os

from my.pokeboard.utils.Enum import Enum
from my.pokeboard.utils.Switch import Switch

"""
Possible commands:
EXIT: will cause the console to exit the program

CLEAR: will clear the console, for readability purposes. does not change object states

DRAW (DECK | PRIZES) [n]: will draw n cards from the deck or prizes into the hand,
                          or one of them if a count is not specified

PLAY id: will play the card which matches the id given from the hand onto the board

DISCARD (BOARD | HAND) id ... : will discard cards by id from the board or hand

RETURN (BOARD | HAND | DISCARD) id ... : will return cards by id from the board, hand or discard to the deck which
                                           has matching clue-text

SHOW (BOARD | HAND | (PRIZES [n]) | (DECK [n]) | (DISCARD [n])): shows the first n elements of the given collection,
                                                   or all of them if a count is not specified

SHUFFLE: will shuffle the deck

RESET: will reset the state of the deck manager by moving all cards to the deck, shuffling, and drawing out 6 prizes
"""

Commands = Enum(["EXIT", "CLEAR", "DRAW", "PLAY", "DISCARD", "RETURN", "SHOW", "SHUFFLE", "RESET"])


def safe_clear():
    os.system('cls' if os.name == "nt" else "clear")


def run_console(deck_manager):
    exit_now = False
    while not exit_now:
        args = raw_input("Command: ").upper().split()
        if len(args) == 0:
            args = [""]
        command = args[0]
        for case in Switch(command):
            if case(Commands.EXIT):
                exit_now = True
                break
            if case(Commands.CLEAR):
                safe_clear()
                break
            if case(Commands.DRAW):
                break
            if case(Commands.PLAY):
                break
            if case(Commands.DISCARD):
                break
            if case(Commands.RETURN):
                break
            if case(Commands.SHOW):
                break
            if case(Commands.SHUFFLE):
                break
            if case(Commands.RETURN):
                break
            if case():
                break
    print "Exiting Deck Manager"
