package wp_5;

public class CurrentAccount extends Account{
    private int transacciones;
    private double precioT;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String nombre, String nc, double saldo, double tasay, int transacciones, double precioT) {
        super(nombre, nc, saldo, tasay);
        this.transacciones = transacciones;
        this.precioT = precioT;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public double transactionReceipt(){
        return transacciones*precioT;
    }

    @Override
    public double calculateInterests() {
        if(super.getSaldo() >= 1500) return 0.05;
        return 0.01;
    }

    @Override
    public double getFinalBalance() {
        return super.getSaldo()-(precioT*calculateInterests());
    }
}
