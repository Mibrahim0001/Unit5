package wp_7;

public class Rectangle extends Shape{
    private double width;
    private double length;

    /**
     * Constructor por defecto
     */
    public Rectangle() {
    }

    /**
     * Constructor con los paramentros
     * de la subclase
     * @param width
     * @param length
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor con los parametros de la superclase
     * y de la subclase.
     * @param color
     * @param filled
     * @param width
     * @param length
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Metodos Setter y Getters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    /**
     * Metodos de la superclase
     * @return La area del rectangulo
     */
    @Override
    public double getArea() {
        return this.width*this.length;
    }

    /**
     * Metodo de la superclase
     * @return El perimetro del rectangulo.
     */
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
