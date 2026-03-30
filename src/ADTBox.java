public class ADTBox {
    private int top;
    private int left;
    private int right;
    private int bottom;
    private byte color;
    private boolean rounded;

    public void setColor(byte color) {
        this.color = color;
    }

    public void setRounded(boolean rounded) {
        this.rounded = rounded;
    }

    public void setTopLeft(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void setBottomRight(int bottom, int right) {
        if (bottom < this.top) {
            System.out.println("Error message \"Bottom < Top\"");
            return;
        }

        if (right < this.left) {
            System.out.println("Error message \"Bottom < Top\"");
            return;
        }
        this.right = right;
        this.bottom = bottom;
    }

    public void show() {
        System.out.println("Box");
        System.out.println("Top = " + this.top);
        System.out.println("Left = " + this.left);
        System.out.println("Bottom = " + this.bottom);
        System.out.println("Right = " + this.right);
        System.out.println("Color = " + this.color);
        System.out.println("Rounded = " + this.rounded);
    }
}