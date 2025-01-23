package inheritance;

import javax.swing.*;

public class BoxParent {

    int l;
    int h;
    int b;

    BoxParent(){

    }

    static void printing(){
        System.out.println("printing....static");
    }

    BoxParent(int l, int h, int b){
        this.l = l;
        this.h = h;
        this.b = b;
    }


}
