import abc
def DecoratorBase(abc.ABC):
    @abc.abstractmethod
    def mensaje():
        pass

def SMSDecorator(DecoratorBase):
    def mensaje(s):
        print("SMS: "+s)

def WhatsAppDecorator(DecoratorBase):
    def mensaje(s):
        print("WhatsApp: "+s)

def main():
    m1 = SMSDecorator()
    m1.mensaje("hola")
    m1 = WhatsAppDecorator()
    m1.mensaje("adios")
    
main()