// reference is from generative AI on google when searching for multilevel inheritance with visibility java example
// Driver method
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 63, "Golden Retriever");
        dog.eat(); // Inherited from Animal
        dog.bark();
        dog.displayInfo(); 
    }
}

/* Compile this file last and then run this file after compiling to get the result.
 * Command prompt for the program to compile.
 * Once in location of file.
 * \> cd ResubmitTweedieEricMod3Proj3
 * \>ResubmitTweedieEricMod3Proj3> cd src
 * \ResubmitTweedieEricMod3Proj3>src> javac Animal.java (compile first)
 * \ResubmitTweedieEricMod3Proj3>src> javac Mammal.java (compile second)
 * \ResubmitTweedieEricMod3Proj3>src> javac Dog.java (compile third)
 * \ResubmitTweedieEricMod3Proj3>src> javac Main.java (compile fourth)
 * After all files are compiled, run the Main file
 * \ResubmitTweedieEricMod3Proj3>src> java Main
 * Expected output:
 * Max is eating.
 * Woof!
 * Name: Max
 * Breed: Golden Retriever
 * Max gives birth after 63 days.
*/
