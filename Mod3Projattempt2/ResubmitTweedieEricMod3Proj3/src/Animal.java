// reference is from generative AI on google when searching for multilevel inheritance with visibility java example

class Animal {
    /** Class Animal that is the parent class for Mammal and Dog classes.
     * @author Google Inc. Generative AI search
     * @param name protected string variable
     */
    protected String name;

    public Animal(String name) {
        /** Method Animal to create new instance of an Animal.
         * @param name string variable to hold name of Animal created
         */
        this.name = name;
    }

    public void eat() {
        /** Method eat for returning that the animal is eating.
         * Returns string statement with the name of the animal and that it is eating.
         */
        System.out.println(name + " is eating.");
    }
}