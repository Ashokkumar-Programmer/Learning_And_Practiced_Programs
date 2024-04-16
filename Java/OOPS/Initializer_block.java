class Test{
    Test(){
        System.out.println("Test Constructor");
    }
}


public class Initializer_block extends Test{
    /*
        Initializer block is used to initiaize the instance data member, it run each time when instance of class is created.

        When super() is call then execute the super() first after the initializer block is executed.
        When creating object, the initializer block is executed first then constructor is executed.
        The instance initializer block is created when instance of class is created.
    */

    Initializer_block(){
        super();
        System.out.println("Initializer_block Constructor");
    }

    /* Initializer Block */
    {System.out.println("Initializer block");}

    public static void main(String[] args) {
        Initializer_block i = new Initializer_block();
    }
}
