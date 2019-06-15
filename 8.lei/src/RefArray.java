public class RefArray {
    public static void main(String[] args) {

        Merchandise[] Merchandises = new Merchandise[9];
        Merchandises[0] = new Merchandise();
        Merchandises[1] = new Merchandise();
        Merchandises[0].name = "notebook";

        System.out.println(Merchandises[0].name);

        System.out.println(Merchandises[2]);
    }
}
