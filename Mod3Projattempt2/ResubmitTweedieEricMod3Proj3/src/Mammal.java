// reference is from generative AI on google when searching for multilevel inheritance with visibility java example

class Mammal extends Animal {
    /** Mammal class that inherits from the Animal class.
     * @param gestationPeriod private integer variable used for how long the gestation period is.
     */
    private int gestationPeriod;

    public Mammal(String name, int gestationPeriod) {
        /** Method Mammal used for holding the animals name and 
         * holding the gestationPeriod variable.
         * Uses the name method from the Animal class.
         * @param gestationPeriod is instantiated as an instance variable
         */
        super(name);
        this.gestationPeriod = gestationPeriod;
    }

    protected void giveBirth() {
        /** Method giveBirth used for return a statement using the name of the animal
         * and displaying how many days the gestation period is for the animal.
         */
        System.out.println(name + " gives birth after " + gestationPeriod + " days.");
    }
}