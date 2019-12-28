package LessonsJavaCore_4.Animal;

public class Animal {
    private String nameAnimal;
    private int speedAnimal;
    private int ageAnimal;

    @Override
    public String toString() {
        return "Назва тварини = " + this.nameAnimal + ", Швидкість тварини = " + this.speedAnimal + " км/год " + ", Вік тварини = " + this.ageAnimal + " років";
    }
    public Animal(String nameAnimal,int speedAnimal,int ageAnimal){
       this.nameAnimal = nameAnimal;
       this.speedAnimal = speedAnimal;
       this.ageAnimal = ageAnimal;
    }
    public String getNameAnimal ( ) {
        return nameAnimal;
    }

    public void setNameAnimal ( String nameAnimal ) {
        this.nameAnimal = nameAnimal;
    }

    public int getSpeedAnimal ( ) {
        return speedAnimal;
    }

    public void setSpeedAnimal ( int speedAnimal ) {
        this.speedAnimal = speedAnimal;
    }

    public int getAgeAnimal ( ) {
        return ageAnimal;
    }

    public void setAgeAnimal ( int ageAnimal ) {
        this.ageAnimal = ageAnimal;
    }
}
