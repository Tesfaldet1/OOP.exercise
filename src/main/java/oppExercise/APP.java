package oppExercise;

public class APP {
    public static void main(String[] args) {

        Person name = new Person();
        name.setFirstname("Hanna");
        name.setLastName("Ohlsson");
       // System.out.println("PersonName: "+ name.getFirstname() +" "+ name.getLastName()+ " " + name.getPersonId());
        System.out.println(name.PersonInformation());
    }
}

