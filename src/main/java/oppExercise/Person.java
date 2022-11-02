package oppExercise;

public class Person {
    private  int personId = 100;
    private String firstname;
    private String lastName;
    //private Books LoanBook;
    private String displayBooks;

    public Person(){
        this.personId=++personId;
    }
    public Person(String firstname, String lastName){
        this();
        this.firstname=firstname;
        this.lastName=lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(firstname==null)throw new IllegalArgumentException();
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName==null) throw new IllegalArgumentException();
        this.lastName = lastName;
    }
    public Books getLoanBook(Books loanBook){
        return loanBook;
    }
    public  String getDisplayBooks(){
        return displayBooks;
    }
    public  String PersonInformation(){
        return "Person information :"+ firstname +" "+ lastName + " "+ personId;
    }
}
