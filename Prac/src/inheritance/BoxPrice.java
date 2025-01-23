package inheritance;

public class BoxPrice extends BoxChild{
    int p;

    public BoxPrice(int l, int h, int b, int w , int p) {
        super(l, h, b, w);
        this.p = p;
    }

}
