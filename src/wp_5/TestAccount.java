package wp_5;

public class TestAccount {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount();
        SavingAccount sa = new SavingAccount();

        sa.setMaintenanceFee(10);
        ca.setSaldo(1666);
        sa.setSaldo(1666);

        System.out.println(ca.getFinalBalance());
        System.out.println(sa.getFinalBalance());



    }
}
