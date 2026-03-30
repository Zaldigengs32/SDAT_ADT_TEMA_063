public class TestADTBox {
    public static void main(String[] args) {
        System.out.println("=== TEST CASE 1 ===");
        System.out.println("Input topleft (10,10)");
        System.out.println("Input bottomRight(20,20)");
        System.out.println("Input color(0)");
        System.out.println("Input rounded(true)");
        System.out.println();
        
        ADTBox box1 = new ADTBox();
        box1.setTopLeft(10, 10);
        box1.setBottomRight(20, 20);
        box1.setColor((byte) 0);
        box1.setRounded(true);
        box1.show();
        
        System.out.println("\n=== TEST CASE 2 ===");
        System.out.println("Input topleft (10,10)");
        System.out.println("Input bottomRight(-20,20)");
        System.out.println();
        
        ADTBox box2 = new ADTBox();
        box2.setTopLeft(10, 10);
        box2.setBottomRight(-20, 20);
        
        System.out.println("\n=== TEST CASE 3 ===");
        System.out.println("Input topleft (10,10)");
        System.out.println("Input bottomRight(20,-24)");
        System.out.println();
        
        ADTBox box3 = new ADTBox();
        box3.setTopLeft(10, 10);
        box3.setBottomRight(20, -24);
    }
}