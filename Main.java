//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ring Ball_1 = new Ring("Круг 1",25, 14);
        Ball_1.get_values();

        System.out.println(" ");

        Ball_1.setName("Круг 2");
        System.out.println(Ball_1.getName());

        System.out.println(" ");

        System.out.println(Ball_1.get_values());
        Ball_1.color();

        System.out.println(" ");

        Ring Ball_2 = new Ring("Круг 3", 30);
        Ball_2.get_values();

        System.out.println(" ");

        Paralelipiped Square_1 = new Paralelipiped("Паралллепипед 1", 30, 14);
        Square_1.get_values();

        System.out.println(" ");

        Cilinder Cilinder_1 = new Cilinder("Цилиндр 1", 24, 12);
        Cilinder_1.get_values();

        System.out.println(" ");

        System.out.println("Колличество объектов: " + Geometrical_Figure.get_Counter());
        }
}
