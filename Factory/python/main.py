from Factories import *


def main():
    panFact = PanFactory()
    piedraFact = PiedraFactory()

    panFact.CreateItem().Place()
    piedraFact.CreateItem().Place()

if __name__ == '__main__':
    main()