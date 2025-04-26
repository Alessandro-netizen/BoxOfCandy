public class Main {
    public static void main(String[] args) {
        Candy[][] initialBox = new Candy[4][3];
        initialBox[0][1] = new Candy("lime");
        initialBox[1][1] = new Candy("orange");
        initialBox[2][2] = new Candy("cherry");
        initialBox[3][1] = new Candy("lemon");
        initialBox[3][2] = new Candy("grape");
        BoxOfCandy initialBoxOfCandy = new BoxOfCandy(initialBox);
        System.out.println(initialBoxOfCandy);
        initialBoxOfCandy.moveCandyToFirstRow(0);
        initialBoxOfCandy.moveCandyToFirstRow(1);
        initialBoxOfCandy.moveCandyToFirstRow(2);
        System.out.println(initialBoxOfCandy);

        Candy[][] box2D = new Candy[3][5];
        box2D[0][0] = new Candy("lime");
        box2D[0][1] = new Candy("lime");
        box2D[0][3] = new Candy("lemon");
        box2D[2][4] = new Candy("orange");
        box2D[1][0] = new Candy("orange");
        box2D[1][3] = new Candy("lime");
        box2D[1][4] = new Candy("lime");
        box2D[2][0] = new Candy("cherry");
        box2D[2][2] = new Candy("lemon");
        BoxOfCandy b = new BoxOfCandy(box2D);
        System.out.println(b);
        System.out.println(b.removeNextByFlavor("cherry"));
        System.out.println(b);
    }
}
