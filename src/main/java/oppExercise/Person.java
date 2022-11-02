package oppExercise;

public class Person {
    private  static int personId = 100;
    private static String firstname;
    private static String lastName;
    private static Books LoanBook;
    private static String displayBooks;


    public Person(){
        this.personId=++personId;
    }
    public Person(String firstname, String lastName){
        this();
        this.firstname=firstname;
        this.lastName=lastName;
    }

    public static int getPersonId() {
        return personId;
    }

    public static String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(firstname==null)throw new IllegalArgumentException();
        this.firstname = firstname;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName==null) throw new IllegalArgumentException();
        this.lastName = lastName;
    }
    public static Books getLoanBook(Books loanBook){
        return loanBook;
    }
    public static String getDisplayBooks(){
        return displayBooks;
    }
    public static String PersonInformation(){
        return "Person information :"+ firstname +" "+ lastName + " "+ personId ;
    }
}
