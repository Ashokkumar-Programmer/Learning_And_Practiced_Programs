public class Object_Class {
    String name;
    int id;
    public static void main(String[] args) {
        //Objects

        /*
            An entity that state and behaviour is known as object.
            It has three characteristics,
            (i) State - It represents the data(value) of an object.
            (ii) Behaviour - It represent functionality of an object.
            (iii) Identity - It is implemented via unique ID. It is used by JVM to identity each objects uniquely.
        */

        //Class

        /*
            A class is group of objects which have common properties.
            It is template or behaviour from which object is created.
            A class contains fields, methods, constructor, interface, nested class, blocks.
        */
        
        //Here Object_Class is class and we declare variable like name, id.
        Object_Class o = new Object_Class(); //here we create object for Object_Class
        System.out.println(o.name); //Here we access the name variable using object
        System.out.println(o.id); //Here we access the id variable using object

        //In memory, every object have separate memory space. When we create object for class then only memory will be allocated to the class with new instance.


        OuterClass outer = new OuterClass(); //here we create object for outside the class OuterClass
        outer.id = 1; // Here we initialize the value of variable using object
        outer.name = "Ashok"; // Here we initialize the value of variable using object
        System.out.println(o.name); //Here we access the name variable using object
        System.out.println(o.id); //Here we access the id variable using object
        outer.print(); // Here we access the method of a class using object
        outer.initializeValue(2, "Hari");

        //Different way to create object

        //1. by new keyword

        OuterClass outer1 = new OuterClass();
        outer1.print();

        //Anonymous object - Here we don't need to create object name, we can directly access the class
        new OuterClass().print();

        // creating multiple objects

        OuterClass outer2 = new OuterClass(), outer3 = new OuterClass();

        //2. by newInstance - If you know the classname and its public then use Class.forName() to create object and use the name as object name

        Class cls = Class.forName(Object_Class);

        Object_Class obj = (Object_Class)cls.newInstance();

        obj.id = 1;
        
        //clone one object to another object

        Object_Class obj1 = (Object_Class)obj.clone();

        obj1.name = "hari";
    }

    public class OuterClass {
        int id;
        String name;
        void print(){
            System.out.println("Welcome");
        }
        void initializeValue(int pass_id, String pass_name){
            id = pass_id; //Initialize the variable through method
            name = pass_name; //Initialize the variable through method
            System.out.println(id+"  "+name);
        }
    }
}
