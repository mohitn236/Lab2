
public class Pet {
	private String id;
    private String name;
    private String species;
    private String breed;
    private int age;

    public Pet(String id, String name, String species, String breed, int age) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{id='" + id + "', name='" + name + "', species='" + species + "', breed='" + breed + "', age=" + age + "}";
    }
}
