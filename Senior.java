public class Senior extends HighschoolStudent {
    protected boolean goingToCollege;

    public Senior(String name, int age, String gender, String idNum, double gpa, String academy, int year, boolean goingToCollege){ 
		super(name, age, gender, idNum, gpa, academy, year);

        this.goingToCollege = goingToCollege;
	}

    public boolean goingToCollege() {
        return goingToCollege;
    }

    public boolean skippingClass() {
        return Math.random() < 0.75;
    }

    public String toString() {
        return super.toString() + ", attending college: " + (goingToCollege ? "yes" : "no");
    }
}
