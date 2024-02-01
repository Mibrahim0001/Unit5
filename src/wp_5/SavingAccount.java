package wp_5;

public class SavingAccount extends  Account{
    private double maintenanceFee;

    public SavingAccount() {
        super();
    }

    public SavingAccount(String nombre, String nc, double saldo, double tasay, double maintenanceFee) {
        super(nombre, nc, saldo, tasay);
        this.maintenanceFee = maintenanceFee;
    }

    @Override
    public double calculateInterests() {
        return super.getSaldo() * super.getTasay();
    }

    @Override
    public double getFinalBalance() {
        return super.getSaldo()-calculateInterests();
    }
}
