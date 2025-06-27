//Subclass PremuimMember extending GymMember
public class PremiumMember extends GymMember
{
    //Attributes specific to PremuimMember
    private final double premiumCharge = 50000.0;
    //final variable for premuim charge
    private final int attendanceLimit = 30;
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;

    //Constructor accepting nine parameter
    public PremiumMember(int id, String name, String location,String phone,String email,String gender,String DOB,String membershipStartDate,String personalTrainer)
    {
        //Call the superclass(GymMember) constructor
        super(id, name, location, phone,email, gender, DOB, membershipStartDate);
        //Set the specific attributes for PremuimMember
        this.personalTrainer = personalTrainer;
        this.isFullPayment = false;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }
    //Accessor Methods for PremuimMember attributes
    public double getPremuimCharge()
    {
        return premiumCharge;
    }

    public String getPersonalTrainer()
    {
        return personalTrainer;
    }

    public boolean getIsFullPayment()
    {
        return isFullPayment;
    }

    public double getPaidAmount()
    {
        return paidAmount;
    }

    public double getDiscountAmount()
    {
        return discountAmount;
    }

    //Method to pay due amount
    public String payDueAmount(double amount)
    {
        //If the payment is already full
        if(this.isFullPayment)
        {
            return "Payment already completed.No due amount left."; 
        }

        if (this.paidAmount + amount > premiumCharge)
        {
            return"Error: Total paid amount exceeds premuim charge.";
        }
        paidAmount += amount;
        double remainingAmount = premiumCharge - paidAmount;
        if(paidAmount == premiumCharge)
        {
            isFullPayment = true;
            discountAmount = 0.10 * premiumCharge;
        }
        return "Payment successful.Remaining amount to be paid:" + remainingAmount;
    }
    //Display method to show the details of PremiumMember
    @Override
    public void markAttendance()
    {
        attendance++;
        loyaltyPoints += 10;
    }

    public void calculateDiscount()
    {
        //Method to claculate discount based on payment is full
        if(this.isFullPayment)
        {
            //Calculate 10% discount if the payment is full
            this.discountAmount = premiumCharge * 0.10;
            System.out.println("Discount calculated:"+this.discountAmount);
        }else
        {
            discountAmount = 0;
            System.out.println("No discount available.Full payment required.");
        }
    }
    //Method to revert the PremuimMember(reset attributes)
    public void revertPremuimMember()
    {
        super.resetMember();
        //Reset PremuimMember specific attributes
        this.personalTrainer = "";
        this.isFullPayment = false;
        this.paidAmount = 0;
        this.discountAmount = 0;
    }
    //Display method to show the details of PremiumMember
    @Override
    public void display()
    {
        //Call the superclass display method to show common attributes
        super.display();
        //Display PremiumMember specific attributes
        System.out.println("Personal Trainer:" + personalTrainer);
        System.out.println("Paid Amount:" + paidAmount);
        System.out.println("Full Payment Done:"+ isFullPayment);
        //Calculate and display remaining amount
        double remainingAmount = premiumCharge - paidAmount;
        System.out.println("Remaining Amount to be Paid:" + remainingAmount);
        //Display discount if full payment is made
        if(isFullPayment)
        {
            System.out.println("Discount Amount:" + discountAmount);
        }
    }
}