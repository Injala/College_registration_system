/**
 * Subclass AcademicCourse is created by extending superclass Course
 * 
 * @author Injala Karki
 * @version CW 1.0
 */

public class AcademicCourse extends Course
{
    
    private String lecturerName, level, credit, startingDate, completionDate; //declaring the instance variables as String 
    private int noOfAssessments; //declaring the instance variables as integer
    private boolean isRegistered; //declaring the instance variables as boolean
    
    /**
     * The constructor for AcademicCourse is created
     * @param courseID It is an specific ID for the respective course
     * @param courseName It is the name of course
     * @param level It is the position holds by the course
     * @param credit It is teaching hours.
     * @param duration It is the time period until the course ends.
     * @param noOfAssessments It is the number of assessments given to the teacher
     */
    AcademicCourse(String courseID, String courseName, String level, String credit, int duration, int noOfAssessments)
    {
        //calling superclass constructor by super keyword
        super(courseID,courseName,duration);
        //assigning the value of level with that of parameter
        this.level = level;
        //assigning the value of credit with that of parameter
        this.credit = credit;
        //assigning the value of instance variable lecturerName as empty string
        this.lecturerName = "";
        //assigning the value of instance variable startingDate as empty string
        this.startingDate = "";
        //assigning the value of instance variable completionDate as empty string
        this.completionDate = "";
        //assigning the value of noOfAssessments with that of parameter
        this.noOfAssessments = noOfAssessments;
        //assigning the value of instance variable isRegistered as false
        this.isRegistered = false;
    }
    
    /**
     *  Creating accessor method to get the value of lecturerName
     * @return the value of lecturerName
     */
    public String getLecturerName() 
    {
        return lecturerName;
    }
    
    /**
     *  Creating accessor method to get the value of level
     * @return the value of level
     */
    public String getLevel() 
    {
        return level;
    }
    
    /** 
     * Creating accessor method to get the value of credit
     * @return the value of credit
     */
    public String getCredit()
    {
        return credit;
    }
    
    /**
     * Creating accessor method to get the value of startingDate
     * @return the value of startingDate
     */
    public String getStartingDate() 
    {
        return startingDate;
    }
    
    /**
     * Creating accessor method to get the value of completionDate
     * @return the value of completionDate
     */
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    /**
     * Creating accessor method to get the value of noOfAssessments
     * @return the value of noOfAssessments
     */
    public int getNoOfAssessments() 
    {
        return noOfAssessments;
    }
    
    /**
     * Creating accessor method to get the value of isRegistered
     * @return the value of isRegistered
     */
    public boolean getisRegistered() 
    {
        return isRegistered;
    }
    
    /**
     * Creating mutator method to set the value of lecturerName
     * @param newLecturername It is the new assigned value of lecturerName.
     */
    public void setlectureName(String newLecturerName)
    {
        this.lecturerName = newLecturerName;
    }
    
    /**
     * Creating mutator method to set the value of noOfAssessments
     * @param newNoOfAssessments It is the new assigned value of noOfAssessments.
     */
    public void setNoOfAssessments(int newNoOfAssessments)
    {
        this.noOfAssessments = newNoOfAssessments;
    }
    
    /**
     * Register method is created to check whether this course is registered or not.
     * @param courseLeaderName  It is the name of the course leader.
     * @param lecturerName It is the name of the lecturer.
     * @param startingDate It is the date when this course starts.
     * @param completionDate It is the date when this course ends.
     */
    public void register(String courseLeaderName, String lecturerName, String startingDate, String completionDate)
    {
        //if the course is registered then lectureName, startingDate, completionDate are printed
        if(isRegistered == true) {
            System.out.println("The name of the lecturer is = " + lecturerName); //displaying the value of lecturerName attribute
            System.out.println("The stating date of the academic course is = " + startingDate); //displaying the value of startingDate attribute
            System.out.println("The completion date of academic course is = " + completionDate); //displaying the value of completionDate attribute
        } 
        else { 
        
            super.setCourseLeader(courseLeaderName); // call is made to parent class to set the courseLeader with courseLeaderName as parameter
            this.lecturerName = lecturerName;        //assigning the value of lecturerName with that of paramter
            this.startingDate = startingDate;        //assigning the value of startingDate with that of paramter
            this.completionDate = completionDate;     //assigning the value of completionDate with that of paramter
            this.isRegistered = true;                 //assigning the value of isRegistered as true
        }
    }
    
    /**
     * The display method is created to display all the details of Academic course
     */
    public void display()
    {
        super.display();
        if(isRegistered == true) {
            System.out.println("The name of the lecturer is = " + lecturerName); //displaying the value of lecturerName attribute
            System.out.println("The level is = " + level);                       //displaying the value of level attribute
            System.out.println("The credit for this course is = " + credit + "hours");     //displaying the value of credit attribute
            System.out.println("The starting date is = " + startingDate);        //displaying the value of startingDate attribute
            System.out.println("The completion date is " + completionDate);      //displaying the value of completionDate attribute
            System.out.println("The number of assessments are = " + noOfAssessments); //displaying the value of noOfAssessments attribute
        }
    }

}









