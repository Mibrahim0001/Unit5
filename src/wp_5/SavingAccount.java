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

    public double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    @Override
    public double calculateInterests() {
        return super.getSaldo() * (super.getTasay()/100);
    }

    @Override
    public double getFinalBalance() {
        // Calculamos los intereses
        double intereses = calculateInterests();
        return super.getSaldo() - (maintenanceFee+intereses);
    }
}
