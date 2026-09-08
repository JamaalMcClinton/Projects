// Jamaal McClinton

public class Pet {
    private String name;

    public Pet() {
        setName("Pet Name");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2.toString());
    }
}