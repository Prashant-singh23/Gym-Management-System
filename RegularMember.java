//subclass RegularMember extending GymMember
public class RegularMember extends GymMember
{
    //private attributes of RegularMember
    private final int attendanceLimit = 30;
    //Final variable, cannot be changed
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;

    //Constructor accepting nine parameters
    public RegularMember(int id, String name, String location, String phone, String email, String gender, 
    String DOB, String membershipStartDate, String referralSource) {
        //Call the superclass (GymMember) constructor
        super(id, name, location, phone, email, gender, DOB, membershipStartDate);
        //set the specific attributes for RegularMember
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = "";
        this.referralSource = referralSource;
    }
    //Getter method for RegularMember attributes
    public int getAttendanceLimit() {
        return attendanceLimit;
    }

    public boolean isEligibleForUpgrade() {
        return isEligibleForUpgrade;
    }

    public String getRemovalReason() {
        return removalReason;
    }

    public String getReferralSource() {
        return referralSource;
    }

    public String getPlan() {
        return plan;
    }

    public double getPrice()
    {
        return price;
    }
    //Abstract method implemementation to mark attendance
    @Override
    public void markAttendance() 
    {
        //Increment attendance and loyalty points
        this.attendance++;
        this.loyaltyPoints += 5;
        //Check if the attendance reaches the limit
        if (attendance >= attendanceLimit) {
            isEligibleForUpgrade = true;
            //Member is eligible for plan upgrade
        }
    }
    //Method to retrieve the price of a given plan
    public double getPlanPrice(String plan) {
        switch (plan.toLowerCase()) {
            case "basic":
                return 6500;
            case "standard":
                return 12500;
            case "deluxe":
                return 18500;
            default://Default for invalid plan
                return -1;
        }
    }
    //Method to upgrade the plan if eligible
    public String upgradePlan(String newPlan) {
        if (!isEligibleForUpgrade) {
            return "Member is not eligible for an upgrade.";
        }
        if (this.plan.equalsIgnoreCase(newPlan)) {
            return "Member is already subscribed to this plan.";
        }
        //Get the new plan's price
        double newPrice = getPlanPrice(newPlan);
        if (newPrice != -1) {
            //Valid plan
            this.plan = newPlan;
            this.price = newPrice;
            this.isEligibleForUpgrade = false;
            //Reset eligibility after upgrade
            return "Plan upgraded successfully to " + newPlan + " with price " + newPrice;
        }else{
            return"Invalid plan selection.";

        }
    }
    //Method to revert a RegularMember (resset attributes and membership)
    public void revertRegularMember(String removalReason) {
        //Call the superclass reset method 
        resetMember();
        //Reset specific RegularMember attributes
        this.isEligibleForUpgrade = false;
        this.plan = "basic";
        this.price = 6500;
        this.removalReason = removalReason;
    }

    
    //Display method to show the details of RegularMember
    public void display()
    {
        //Call the superclass spacific attributes
        super.display();
        System.out.println("Plan: " + plan);
        System.out.println("Price: " + price);
        ////Display removal reason if it is not empty
        if (!removalReason.isEmpty()) {
            System.out.println("Removal Reason: " + removalReason);
        }
    }
} 