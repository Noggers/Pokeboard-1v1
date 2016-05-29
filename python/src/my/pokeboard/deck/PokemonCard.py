class PokemonCard(object):
    id = 0
    card_text = ""
    clue_text = ""

    def __init__(self, id, card_text, clue_text=""):
        self.id = id
        self.card_text = card_text

    def __str__(self):
        return "{" + str(self.id) + ", " + self.card_text + "}"

    def __repr__(self):
        return self.__str__()
