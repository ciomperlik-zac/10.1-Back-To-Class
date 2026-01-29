public class Main{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", 45, "male", "physisc", 46000);
        Freshman freshman = new Freshman("Jeff", 17, "male", "314159", 3.2, "ASI", 9, "Small");
        Senior senior = new Senior("Linda", 18, "female", "98735", 4.0, "ADT", 12, true);

        System.out.println(teacher);
        System.out.println(freshman);
        System.out.println(senior);

        System.out.println(freshman.interrupt());
        System.out.println(senior.skippingClass());
    }
}
