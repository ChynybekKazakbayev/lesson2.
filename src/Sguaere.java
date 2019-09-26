public class Sguaere extends Figure implements Drawable{

    private double side;

    public Sguaere( double side) {
        setName("Kvadrat:");
        this.side = side;
    }

    @Override
    public void calculetePerimetr() {
        System.out.println(getName()+ side*4);
    }


    @Override
    public void Drawable() {
        System.out.println("◼");
    }
}
