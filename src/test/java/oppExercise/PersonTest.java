package oppExercise;
import org.junit.Before;

import org.junit.Test;
import org.junit.Assert;


public class PersonTest {

    @Before

     public void startTestPerson() {
        Person Name = new Person("Hanna", "Johansson");
        }
    @Test
    public void testFirstName(){
        String expectedName= "Hanna";
        String actualName= Person.getFirstname();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testLastName(){
        String expectedLastName= "Johansson";
        String actualLastname = Person.getLastName();
        Assert.assertEquals(expectedLastName,actualLastname);
    }
    @Test
     public void testPersonId(){
        int expectedId= 101;
        int actualId=Person.getPersonId();
    }

    }


