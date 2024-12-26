public class Cilinder extends Geometrical_Figure{
    public Cilinder(String name, int perimetr, int square) {
        super(name, perimetr, square);
        System.out.println(get_values());
    }

    public Cilinder(String name, int perimetr) {
        super(name, perimetr);
        System.out.println(get_values());
    }
}
