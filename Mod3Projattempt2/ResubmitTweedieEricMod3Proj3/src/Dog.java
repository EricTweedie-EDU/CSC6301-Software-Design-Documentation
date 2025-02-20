// reference is from generative AI on google when searching for multilevel inheritance with visibility java example

class Dog extends Mammal {
    /** Class Dog inherits from the Mammal class.
     * @param breed private string variable identifying the breed of the dog
     */
    private String breed;

    public Dog(String name, int gestationPeriod, String breed) {
        /** Method Dog that calls on the Mammal class gestationPeriod method.
         * Method also uses the name method from Animal class.
         * string variable breed is instantiated as an instance variable.
         */
        super(name, gestationPeriod);
        this.breed = breed;
    }

    public void bark() {
        /** Method bark that prints out string statement saying Woof!. */
        System.out.println("Woof!");
    }

    public void displayInfo() {
        /** Method displayInfo is used for displaying the name, breed, and the gestation period of the animal. */
        System.out.println("Name: " + name);
        // Can't access gestationPeriod directly, as it's private in Mammal
        System.out.println("Breed: " + breed);
        giveBirth(); // Can access protected method from parent class
    }
}