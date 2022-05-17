public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account();
        System.out.println(testAccount.getCustomerName());
        System.out.println(testAccount.getBalance());

        Account vytautasAccount = new Account(100, 1000, "Vardenis Pavardenis", "vardenispavardenis@gmail.com", 0037062611111);
//        vytautasAccount.setCustomerName("Vardenis Pavardenis");
//        vytautasAccount.setCustomerEmail("vardenispavardenis@gmail.com");
//        vytautasAccount.setCustomerPhoneNumber("0037062611111");
//        vytautasAccount.setNumber(123456);
        vytautasAccount.deposit(300);
        vytautasAccount.deposit(300);
        vytautasAccount.withdrawal(568.98);

        VipAccount testVipAccount = new VipAccount();
        System.out.println(testVipAccount.getBalance());

    }
}