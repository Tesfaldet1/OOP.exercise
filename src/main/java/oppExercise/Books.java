package oppExercise;

public class Books {
    private static String title;
    private static String author;
    private static boolean available;
    private static Person showPerson;

    public Books(String title, String author, boolean available){
        this.title=title;
        this.author=author;
        this.available=available;
    }


    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title==null)throw new IllegalArgumentException();
        this.title = title;
    }

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author==null)throw  new IllegalArgumentException();
        this.author = author;
    }

    public static boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public  static Person getShowPerson (Person showPerson){
        return showPerson;
    }
    public  static String BookInformation(){
        return  "Book information: " + title + " "+ author+ " " + available +  " "
                + showPerson.getPersonId();
    }
    public static void main(String[] args) {

        Person Name = new Person("Hanna", "Johanna");

        // System.out.println("PersonName: "+ name.getFirstname() +" "+ name.getLastName()+ " " + name.getPersonId());
        System.out.println(Name.PersonInformation());
        Books title = new Books("Java how to program","Paul Dei-tel",true);
        System.out.println(title.BookInformation());

    }

}
