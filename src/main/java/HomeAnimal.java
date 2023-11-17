public class HomeAnimal {

    private String animalType;
    private String bark;
    private int age;
    private boolean sex;

    public HomeAnimal(String animalType, String bark, int age, boolean sex) {
        this.animalType = animalType;
        this.bark = bark;
        this.age = age;
        this.sex = sex;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        if (this.bark.isEmpty()) {
            this.bark = bark;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
