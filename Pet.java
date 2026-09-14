// Jamaal McClinton

public class Pet {
    private int age;
    private String name;
    private String type;

    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        }
        else {
            return "Yowl";
        }
    }

    public String toString() {
        String petInfo = "Pet information:\n";
        petInfo += "Type: " + type + "\n";
        petInfo += "Name: " + name + "\n";
        petInfo += "Sound: " + speak() + "\n";
        petInfo += "Age: " + age;
        return petInfo;
    }
}