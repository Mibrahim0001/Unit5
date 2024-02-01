package wp_8;

public abstract class Reloj {

}

class Cucu extends Reloj implements Parlanchin{

    @Override
    public void habla() {
        System.out.println("¡Cucu, cucu, ...!");
    }
}
