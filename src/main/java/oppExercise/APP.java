package oppExercise;

public class APP {
    public static void main(String[] args) {

        Person Name = new Person("Hanna", "Johanna");

       // System.out.println("PersonName: "+ name.getFirstname() +" "+ name.getLastName()+ " " + name.getPersonId());
        System.out.println(Name.PersonInformation());
        Books title = new Books("Java how to program","Paul Dei-tel",true);
        System.out.println(title.BookInformation());

    }

}

