// Jamaal McClinton

public class Animal {
    private String species;

    public Animal() {
        species = "";
    }

    public Animal(String newSpecies) {
        species = newSpecies;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return "Species: " + species;
    }
}
