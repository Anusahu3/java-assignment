//how to create a class, object, method, and its signatures.

//to create a class, 'class' keyword is used
public class Q1
{
    
//to create a method
    static void myMethod()
    {
        System.out.println("This is a Method");
        
    }
//to create an object of class, class name should be specified, followed by the object name and 'new' keyword is used

    public static void main(String[] args)
    {
       Q1 Obj = new Q1();
    
    //calling the method
        Obj.myMethod();
    }
}

//