
import java.util.*;

class Smiley {

    void show() {
        System.out.println("From super class");
    }
}

class Happy extends Smiley {

    //@Override
    void show() {
        System.out.println("From Sub class");
    }
}

class Emotions {

    public static void main(String[] args) {
        Happy h = new Happy();
        Smiley s = new Smiley();
        s.show();
        h.show();
    }
}
