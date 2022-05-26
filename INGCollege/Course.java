/**
 * The Course class is the superclass that
 * @author Injala karki
 * @version CW 1.0
 */
//creating a superclass
public class Course
{
    //declaring the instance variables with private access
    // declaring String variable
    private String courseID;
    private String courseName;
    private String courseLeader;  
    private int duration;          // declaring integer variable
    
    /**
     * This is the constructor of class Course 
     * @param courseID It is an specific ID for the respective course
     * @param courseName It is the name of course
     * @param duration It is the time period until the courrse ends.
     */
    public Course(String courseID, String courseName, int duration)
    {
        this.courseID = courseID;        //assigning the value of courseID with that of paramter
        this.courseName = courseName;    // assigning the value of course with parameter
        this.duration = duration;        // assigning the value of duration with parameter
        this.courseLeader = "";          //assigning the value of courseLeader as empty
    } 
    
    /**
     * Creating accessor method to get the value of courseID
     * @return the value of courseID
     */
    public String getCourseID()
    {
        return courseID;
    }
    
    /**
     * Creating accessor method to get the value of courseName
     * @return the value f courseName
     */
    public String getCourseName()
    {
        return courseName;
    }
    
    /**
     * Creating accessor method to get the value of courseLeader
     * @return the value of courseLeader
     */
    public String getCourseLeader()
    {
        return courseLeader;
    }
    
    /**
    * Creating accessor method to get the value of duration
    * @return the value of duration
    */
    public int getDuration() 
    {
        return duration;
    }
    
    /**
     * Creating mutator method to set the value of courseLeader
     * @param newCourseLeader It is the new assigned value of courseLeader.
     */
    public void setCourseLeader(String newCourseLeader)
    {
        this.courseLeader = newCourseLeader;
    }
    
    /**
     * The display method here prints the value 
     */
    public void display()
    {
            System.out.println("The course ID is = " + courseID);             //displaying the value of courseID attribute
            System.out.println("The course name is = " + courseName);       //displaying the value of courseName attribute
            System.out.println("The duration of course is = " + duration + "year");  //displaying the value of duration attribute
        // if courseLeader has no value then courseLeader is diplayed
        if(courseLeader != "") {
            System.out.println("The name of course leader is = " + courseLeader);   //displaying the value of courseLeader attribute
        } 
        }
    }
