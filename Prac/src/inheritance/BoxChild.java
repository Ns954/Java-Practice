package inheritance;

public class BoxChild extends  BoxParent{

    int w;

    public BoxChild(int l, int h, int b, int w) {
        super(l, h, b);
        this.w = w;
    }

    @Override
    public String toString() {
        return "BoxChild{" +
                "l=" + l +
                ", h=" + h +
                ", b=" + b +
                ", w=" + w +
                '}';
    }
}
