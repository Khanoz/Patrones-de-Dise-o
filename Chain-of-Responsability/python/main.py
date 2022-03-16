from abc import ABC, abstractmethod

class IHandler(ABC):
    @abstractmethod
    def handle(self, request):
        pass
    @abstractmethod
    def setNext(self, next):
        pass

class BaseHandler(IHandler):

    def __init__(self, max):
        super().__init__()
        self.maxRequest = max
        self.next = None
    
    def setNext(self, next):
        self.next = next

    def handle(self, request):
        if(self.canHandle(request)):
            print("Se entregan: "+str(request))
        elif(self.next != None):
            print("Se pasa al siguiente en la cadena: "+str(self.next))
            self.next.handle(request)
        else:
            print("Lo sentimos pero excedio el limite de retiro")
    
    def canHandle(self, request):
        return request <= self.maxRequest

class CajeroAutomatico(BaseHandler):
    def __init__(self):
        super().__init__(9000)

    def __str__(self):
        return "Cajero automatico"

class Sucursal(BaseHandler):
    def __init__(self):
        super().__init__(50000)
    
    def __str__(self):
        return "Sucursal"
    
class AsesorFinanciero(BaseHandler):
    def __init__(self):
        super().__init__(250000)
    
    def __str__(self):
        return "Asesor Financiero"
    

def main():
    cajero = CajeroAutomatico()
    sucursal = Sucursal()
    asesor = AsesorFinanciero()
    cajero.setNext(sucursal)
    sucursal.setNext(asesor)

    cajero.handle(900)
    cajero.handle(45000)
    cajero.handle(100000)
    cajero.handle(9999999999)

if __name__ == "__main__":
    main()