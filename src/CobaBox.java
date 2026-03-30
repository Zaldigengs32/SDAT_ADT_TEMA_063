public class CobaBox {
    public static void main(String[] args) {
        ADTBox box1 = new ADTBox();
        box1.setTopLeft(10, 10);
        box1.setBottomRight(20, 20);
        box1.setColor((byte) 0);
        box1.setRounded(true);
        box1.show();
    }
}