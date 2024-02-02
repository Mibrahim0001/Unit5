package wp_7;

public class Circle extends Shape{
    private double radius;

    /**
     * Constructor por defecto
     */
    public Circle() {
        super();
    }

    /**
     * Constructor solo con la variables por
     * parametro del la subclase
     * @param radius
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Constructor con todos los parametros
     * tanto de la subclase como de la super
     * clase.
     *
     * @param color
     * @param filled
     * @param radius
     */
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Metodos Setter y Getters


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Metodos de la superclase
     * @return La area del circulo
     */
    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    /**
     * Metodo de la superclase
     * @return El perimetro del circulo.
     */
    @Override
    public double getPerimeter() {
        return Math.PI*2*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
