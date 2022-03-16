

class Botella:
    nombre : str
    contenido : str

    def __init__(self, nom, cont):
        self.nombre = nom
        self.contenido = cont

    def printBotella(self):
        print("Nombre: "+self.nombre + "\nContenido: "+self.contenido)


class BotellaBuilder:
    def getNombre(self): pass
    def getContenido(self): pass


class BotellaDirector:
    tipoBotella : BotellaBuilder

    def __init__(self):
        pass

    def setTipoDeBotella(self, tipo):
        self.tipoBotella = tipo
        return self

    def buildBotella(self):
        return Botella(self.tipoBotella.getNombre(), self.tipoBotella.getContenido())


        