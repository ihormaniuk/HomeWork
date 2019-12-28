package LessonsJavaCore_4.Animal;

public class AnimalMain {
    public static void main(String[] args){
        Animal animal = new Animal("Леопард",20,7);
        System.out.println ( animal );
        animal.setNameAnimal ( "Бик" );
        animal.setSpeedAnimal ( 2 );
        animal.setAgeAnimal ( 14 );
        System.out.println ( animal.toString () );
    }
}
