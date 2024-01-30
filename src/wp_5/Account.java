package wp_5;

public abstract class Account {
    private String nombre;
    private String nc;
    private double saldo;
    private double tasay;

    public Account() {
    }

    public Account(String nombre, String nc, double saldo, double tasay) {
        this.nombre = nombre;
        this.nc = nc;
        this.saldo = saldo;
        this.tasay = tasay;
    }

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasay() {
        return tasay;
    }

    public void setTasay(double tasay) {
        this.tasay = tasay;
    }


    // Otros metodos

    public abstract double calculateInterests();
    public abstract double getFinalBalance();
}
