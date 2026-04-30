// Interface
interface Mango {
    void taste();
    void season();
}

// Class Winter implementing Mango
class Winter implements Mango {

    public void taste() {
        System.out.println("Winter Mango Taste: Slightly sweet");
    }

    public void season() {
        System.out.println("Available in: Winter season (rare variety)");
    }
}

// Class Summer implementing Mango
class Summer implements Mango {

    public void taste() {
        System.out.println("Summer Mango Taste: Very sweet and juicy");
    }

    public void season() {
        System.out.println("Available in: Summer season (main mango season)");
    }
}

// Main Class
public class MangoInterface{
    public static void main(String[] args) {

        Mango m;

        // Winter Mango
        m = new Winter();
        System.out.println("---- Winter Mango ----");
        m.taste();
        m.season();

        // Summer Mango
        m = new Summer();
        System.out.println("\n---- Summer Mango ----");
        m.taste();
        m.season();
    }
}
