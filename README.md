# quiz-4-corrections

Question 2:  Consider the following method definition. public long multiply(int a, int b, int c) {

} Modify the following method definition so that it accepts three integers in the form of parameters, computes their product, and prints it to the console. The method should not return a value.:

Correct Answer: public void multiply(int a, int b, int c) { System.out.println(a * b * c); } because it accepts the 3 integers and does not need to return anything. The other answers are wrong because the method either isn’t void, meaning that it must return a value, or doesn’t print out the answer.


Question 3: Consider the following code snippet. String str = "Hello, there. My name is Joseph. What's yours?"; char c = str.charAt(7); What is the value of c after running this code?:

Correct Answer:'t'. The reason it is ‘t’ is because char c = str.charAt(7); is a character data type. A character data type will be store with ‘’ and since the 7th index in String str = "Hello, there. My name is Joseph. What's yours?" is t, that is what you get.

Question 6: When writing a method, you must always include a(n) SELECT , a(n) SELECT , and the method name (in that order). Together, this is known as the method's method identifier .

Correct Answer: access modifier and return type and method signature

It's correct because when writing a method you must always include a acess modifer and a return type. When these things are together it is known as a method signature.

Question 9: What are the values of sub1 and sub2 after running this code?
String s = "abcdefg"; String sub1 = s.substring(s.indexOf("c")); String sub2 = s.substring(s.indexOf("e"), s.indexOf("g"));

Correct Answer: cdefg and ef

It's correct because the first substring chooses a starting value at c, but not specifies an ending value so it would take c and everything after it. While for the second substring it takes characters between e and g. This is why the correct answer is cdefg and ef.

Question 10: Consider the following requirements for a method I need to write.

Accepts a single parameter If that parameter is a whole number, return the parameter unchanged. If that parameter contains a fractional component, return the next largest whole number. Here's my method definition.

public double mystery(double x) {

}

Correct Answer: return Math.ceil(x);

It's Correct beause the Math.ceil() function returns the smallest integer greater than or equal to a given number.  Ceil() is a static method of Math, you always use it as Math.ceil(), rather than as a method of a Math object you created (Math is not a constructor).

Question 11: Match the access modifier with its visibility.

Correct answer: public being visible in all packages, private being visible only in the class in which its defined, default being visible within the class in which it's defined, as well as by classes within the same package, and protected being visible within the class in which it's defined, by classes within the same package, and by subclasses of the class in which it's defined. 

This is correct because if you search up the definition of each class, it describes what the purposes are for the access modifiers . Default and protected classes are both “package-level access” classes, meaning that only classes in the same package can access it.

Question 12: Let's assume I've got my Scanner object setup as shown below.
import java.util.Scanner;
public class Example {
    public void getInput() {
        Scanner s = new Scanner(System.in);
        // read user input (first and last name, then age)
        // TODO
        // print user input to the console
        System.out.println("Hello, " + name ". You're " + age + " years old.");
        s.close();
    }
}
Given the text printed to the console and the implied data types, which methods of the Scanner class should I use and how do I use them?

Correct Answer: ( String name = s.nextLine(); int age = s.nextInt(); ) because the string is set equal to getSTring, this stores the user input and returns it as a string using s.nextInt().

Question 13: Consider the following method definition. public double randomNumber(int seed) { if (seed > 1000) { return Math.random() * seed; } else if (seed > 500) { return Math.random() * seed * -1; } } I keep getting an error message telling me that my method must return a value of type double. What's wrong with my code?:

Correct Answer: For seed values less than or equal to 500, the method does not return a value. This is because the if statements both have conditions where seed is more than 500, but there is no condition if that is not true. The other statements are not right about the code.

