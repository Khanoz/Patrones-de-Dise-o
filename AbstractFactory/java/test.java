package java;

public class test{
    public static void main(String args[])
    {
        abstractFactPC pcFactory = Factories.getFactory("good");
        PC goodPC = pcFactory.createPC();
        pcFactory = Factories.getFactory("bad");
        PC badPC = pcFactory.createPC();
        System.out.println(goodPC.toString());
        System.out.println(badPC.toString());
    }
}