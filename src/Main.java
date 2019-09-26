public class Main {

    public static void main(String[] args) {


        Sguaere s = new Sguaere(4.4) ;
        Rectangle r = new Rectangle(3.3, 2.2);
        s.calculetePerimetr();
        r.calculetePerimetr();
        Figure[] f={s,r,s,r,s,r};
        for (Figure figure:f) {
            figure.calculetePerimetr();
            ((Drawable)figure).Drawable();
        }
    }
}
