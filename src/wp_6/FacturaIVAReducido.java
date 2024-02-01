package wp_6;

public class FacturaIVAReducido extends Factura{

    @Override
    public double getImporteIVA() {
        return 0;
    }
}
