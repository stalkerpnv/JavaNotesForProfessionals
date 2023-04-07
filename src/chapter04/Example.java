package chapter04;
/*Dereferencing happens with the . operator:
 Dereferencing follows the memory address stored in a reference, to the place in memory where the actual object
 resides. When an object has been found, the requested method is called (toString in this case).
 When a reference has the value null, dereferencing results in a NullPointerException:
*/
public class Example {
    public static void main(String[] args) {
        Object objOne = new Object();
        String text = objOne.toString();
        System.out.println(text);

        // Throws a NullpointerException when this statement is executed.
        Object objTwo = null;
        String textTwo = objTwo.toString();
        System.out.println(textTwo);

/*        Where:
             Object is a reference type.
             obj is the variable in which to store the new reference.
             Object() is the call to a constructor of Object.
        What happens:
             Space in memory is allocated for the object.
             The constructor Object() is called to initialize that memory space.
             The memory address is stored in obj, so that it references the newly created object*/
    }
}
