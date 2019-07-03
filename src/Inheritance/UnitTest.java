package Inheritance;

public class UnitTest {
    public static void main(String[] args) {
        String result;
        System.out.println("Unit Test : step1");
        Actress actress = new Actress();
        result = actress.readScript("Avengers");
        System.out.println(result);
    }

  /*  public void givenWaitressInstance_whenCheckedType_thenIsInstanceOfPerson() {
        assertThat(new Waitress("Mary", "mary@domain.com", 22))
                .isInstanceOf(Person.class);
    } */
}
