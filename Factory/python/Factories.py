from Items import *


class ItemFactory:
    def CreateItem(self):
        pass


class PanFactory(ItemFactory):
    def CreateItem(self):
        return Pan()


class PiedraFactory(ItemFactory):
    def CreateItem(self):
        return Piedra()