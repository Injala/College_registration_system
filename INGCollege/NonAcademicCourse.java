/**
 * Subclass NonAcademicCourse is created by extending superclass Course
 * 
 * @author Injala Karki
 * @version CW 1.0
 */

public class NonAcademicCourse extends Course
{
    
    private String instructorName, startingDate, completionDate, examDate, prerequisite;  //declaring the instance variables as String
    private boolean isRegistered, isRemoved;  //declaring the instance variables as boolean
    //creating constructor and passing parameters
    /**
     * The constructor for NonAcademicCourse is created.
     * @param courseID It is an specific ID for the respective course
     * @param courseName It is the name of course
     * @param duration It is the time period until the course ends.
     * @param prerequisite It is the requirement for the course.
     */
    NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {
        //calling superclass constructor by super keyword
        super(courseID, courseName, duration);
        //assigning the value of parameter prerequisite to instance variable prerequisite 
        this.prerequisite = prerequisite;
        //assigning the value of instance variable startingDate as empty string
        this.startingDate = "";
        //assigning the value of instance variable completionDate as empty string
        this.completionDate = "";
        //assigning the value of instance variable examDate as empty string
        this.examDate = "";
        //assigning the value of instance variable isRegistered as false
        this.isRegistered = false;
        //assigning the value of instance variable isRemoved as false
        this.isRemoved = false;
    }
    
    /**
     * Creating accessor method to get the value of instructorName
     * @return the value of instructorName
     */
    public String getInstructorName()
    {
        return instructorName;
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
     * Creating accessor method to get the value of examDate
     * @return the value of examDate
     */
    public String getExamDate()
    {
        return examDate;
    }
    
    /**
     * Creating accessor method to get the value of prerequisite
     * @return the value of prerequisite
     */
    public String getPrerequisite()
    {
        return prerequisite;
    }
    
    /**
     * Creating accessor method to get the value of isRegistered
     * @return the value of isRegistered
     */
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    /**
     * Creating accessor method to get the value of isRemoved
     * @return the value of isRemoved
     */
    public boolean getIsRemoved()
    {
        return isRemoved;
    }
    
    /**
     * Creating mutator method to set the value of instructorName
     * @param newInstructorName It is the new assigned value of instructorname.
     */
    public void setInstructorName(String newInstructorName)
    {
        //if the course is not registered yet then new value is assigned to instructor name
        if(isRegistered == false) {
            this.instructorName = newInstructorName;        // assigning the value of duration with parameter
        } else {
            System.out.print("It is already registered so it is not possible to change the instructor name.");   //displaying the suitable message.
        }
    }
    
    /**
     * The register method is created to check whether this course is registered or not
     * @param courseLeaderName  It is the name of the course leader.
     * @param lecturerName It is the name of the lecturer.
     * @param startingDate It is the date when this course starts.
     * @param completionDate It is the date when this course ends.
     * @param examDate It is the date when examination will be held.
     */
    public void register(String courseLeaderName, String instructorName, String startingDate, String completionDate, String examDate)
    {                                               
        if(isRegistered == false) {                  
            super.setCourseLeader(courseLeaderName); // call is made to parent class to set the courseLeader with courseLeaderName as parameter
            this.setInstructorName(instructorName);  // call is made to parent class to set the instructorName with instructorName as parameter
            this.startingDate = startingDate;        //assigning the value of startingDate with that of paramter
            this.completionDate = completionDate;    //assigning the value of completionDate with that of paramter
            this.examDate = examDate;                //assigning the value of examDate with that of paramter
            this.isRegistered = true;                //assigning the value of isRegistered as true
        } else {
            System.out.println("The non-academic course is already registered.");
        }
    }
    
    /**
     * The remove method is created to check whether the NonAcademicCourse is removed or not.
     */
    public void remove()
    {
        if(isRemoved == true) {
            System.out.println(" The non-academic course is removed.");
        } else {
            super.setCourseLeader("");  //call is made to superclass and the courseLeader is assigned a empty value
            this.instructorName = "";   //assigning the value of instructorName as empty
            this.startingDate = "";     //assigning the value of startingDate as empty
            this.completionDate = "";   //assigning the value of completionDate as empty
            this.examDate = "";         //assigning the value of examDate as empty
            this.isRegistered = false;  //assigning the value of isRegistered as false
            this.isRemoved = true;      //assigning the value of isRemoved as true
        }
    }
    
    /**
     * The display method is created.
     */
    public void display()
    {
        super.display();
        if(isRegistered == true) {
            System.out.println("The name of the instructor is = " + instructorName);   //displaying the value of instructorName attribute
            System.out.println("The starting date is = " + startingDate);              //displaying the value of startingDate attribute
            System.out.println("The completion date is = " + completionDate);          //displaying the value of completionDate attribute
            System.out.println("The exam date is = " + examDate);                      //displaying the value of examDate attribute
        } 
    }
}

