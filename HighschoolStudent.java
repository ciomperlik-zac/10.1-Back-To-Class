public class HighschoolStudent extends Student {
    protected String academy;
    protected int year;

    public HighschoolStudent(String name, int age, String gender, String idNum, double gpa, String academy, int year){ 
		super(name, age, gender, idNum, gpa); 
		
        this.academy = academy;
        this.year = year;
	} 
    
    public String getAcademy() {
        return academy;
    }

    public int getYear() {
        return year;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", academy: " + academy + ", year: " + year;
    }
}
