class Test{
    String name = "Ashok";
    String result(){
        return "Welcome";
    }
    Test(){
        System.out.println("Test Contructor");
    }
}

public class super_keyword extends Test{
    /*
        Super Keyword:
        It is used to refer immediate parent class object.
        It is used to refer parent class variable.
        It is used to invoke the parent class method and constructor.
        But the class must be in IS-A relation or HAS-A relation.
    */

    /* super keyword to invoke the parent class contructor. It super class constructor should be claa within the current class constructor only */
    super_keyword(){
        super();
    }
    
    String name = "Hari";
    String result(){
        /* super keyword is used to refer immediate parent class instance variable */
        String result = super.name;

        /* super keyword to invoke parent class method */
        System.out.println(super.result());

        return result;
    }
    
    public static void main(String[] args) {
        
        super_keyword s = new super_keyword();
        System.out.println(s.result());
    }
}
