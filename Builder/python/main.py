from Botellas import *
from Sprite import *
from CocaCola import *


botellaDirector = BotellaDirector().setTipoDeBotella(CocaCola())
BotellaDeCoca = botellaDirector.buildBotella()
BotellaDeCoca.printBotella()

botellaDirector.setTipoDeBotella(Sprite())
BotellaDeSprite = botellaDirector.buildBotella()
BotellaDeSprite.printBotella()