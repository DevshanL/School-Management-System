package school_management_system;

/**
 * This class is responsible for keep the track of students fees, name, grade & fees paid.
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name,int grade ){
        this.feespaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //Not going to alter student's name, student's id.

    public void setGrade(int grade){
        this.grade = grade;
    }

    //Keep adding the fees to feesPaid field
    public void payFees (int fees){
        feespaid = feespaid + fees; // feespaid+=fees;
        School.updateTotalMoneyEarned(feespaid);


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feespaid;
    }


}
