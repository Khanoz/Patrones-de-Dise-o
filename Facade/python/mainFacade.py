

class Gato():

    def  __init__(self):
        pass

    def crearGato(self):
        print("Gato")

class Perro():

    def __init__(self):
        pass

    def crearPerro(self):
        print("Perro")

class Facade():

    def __init__(self):
        self.perro = Perro()
        self.gato = Gato()
    
    def crear(self):
        print(self.gato)
        self.gato.crearGato()
        self.perro.crearPerro()

def main():
    animal = Facade()
    animal.crear()

main()