//parent class GymMember
public abstract class GymMember
{
    //Atributes with protected access modifier
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance = 0;
    protected double loyaltyPoints = 0;
    protected boolean activeStatus = false;
    //Constructor accepting parameter
    public GymMember(int id,String name,String location,String phone,String email,
    String gender,String DOB,String membershipStartDate)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
        this.membershipStartDate = membershipStartDate;
        this.attendance = 0;
        //Initialize to zero
        this.loyaltyPoints = 0.0;
        //Initialize to zero
        this.activeStatus = false;
        //Initialize to false
    }
    //Abstract method of mark attendance of member
    protected abstract void markAttendance();
    //Method to activate the membership
    protected void activateMembership()
    {
        this.activeStatus = true;
    }
    //Method to deactivate the membership
    protected void deactivateMembership()
    {
        if(this.activeStatus){
            this.activeStatus = false;
        }  else{
            System.out.println("Membership is already inactive.");
        }
    }
    //Method to reset the member details
    protected void resetMember()
    {
        this.activeStatus = false;
        this.attendance = 0;
        this.loyaltyPoints = 0.0;

    }
    //Display method to output member datails
    protected void display()
    {
        System.out.println("Member Information");
        System.out.println("ID"+id);
        System.out.println("Name"+name);
        System.out.println("Location:"+location);
        System.out.println("Phone:"+phone);
        System.out.println("Email:"+email);
        System.out.println("Date of Birth"+DOB);
        System.out.println("Membership Start Date:"+membershipStartDate);
        System.out.println("Attendance"+attendance);
        System.out.println("Loyalty Points:"+loyaltyPoints);
        System.out.println("Active Status:"+(activeStatus ? "Active":"Inactive")); 
    }
    //Getter method
    public int getId() 
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getLocation()
    {
        return this.location;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getGender()
    {
        return this.gender;
    }

    public String getDOB()
    {
        return this.DOB;
    }

    public String getMembershipStartDate()
    {
        return this.membershipStartDate;
    }

    public int getAttendance()
    {
        return this.attendance;
    }

    public double getLoyaltyPoints()
    {
        return this.loyaltyPoints;
    }

    public boolean getActiveStatus()
    {
        return this.activeStatus;
    }

}