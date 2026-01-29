public class Freshman extends HighschoolStudent {
    protected String middleSchool;

    public Freshman(String name, int age, String gender, String idNum, double gpa, String academy, int year, String middleSchool){ 
		super(name, age, gender, idNum, gpa, academy, year);

        this.middleSchool = middleSchool;
	}

    public String getMiddleSchool() {
        return middleSchool;
    }

    public String interrupt() {
        switch ((int) (Math.random() * 5)) {
            case 0:
                return "Hahahahaha";
            
            case 1:
                return "Give me that back!";

            case 2:
                return "Pssssttt";

            case 3:
                return "What are you having for lunch?";

            case 4:
                return "Shut up!";
        
            default:
                return "";
        }
    }

    public String toString() {
        return super.toString() + ", middle school: " + middleSchool;
    }
}
