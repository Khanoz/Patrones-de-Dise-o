public class mainTest{
    public static void main(String args[])
    {
        PhoneBuilder phoneBuilder = new PhoneBuilder("Samsung").setOS("Android").setMemoria("4096");
        Phone phone = phoneBuilder.buildPhone();
        System.out.println(phone.getPhoneInfo());
    }
}