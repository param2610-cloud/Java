class BankAccount
{
    private String AccountHolder;
    private String AccountHolderAddress;
    private int AccountNumber;
    private double Balance;
    BankAccount()
    {
        this.AccountHolder= "SOB_USER";
        AccountNumber=9876;
        this.Balance=10.00;
        this.AccountHolderAddress = "Earth";
    }
    BankAccount(String accholder,int accountnumber,double balance,String AccountHolderAddress)
    {
        this.AccountHolder = accholder;
        this.Balance = balance;
        this.AccountNumber = accountnumber;
        this.AccountHolderAddress = AccountHolderAddress;
    }
    BankAccount(BankAccount ref)
    {
        this.AccountHolder = ref.AccountHolder;
        this.AccountNumber = ref.AccountNumber;
        this.Balance = ref.Balance;
        this.AccountHolderAddress = ref.AccountHolderAddress;
    }
    public void deposit(double amount)
    {
        if(amount >0){
            Balance+=amount;
        }
    }
    public void withdraw (double amount)
    {
        if(amount > 0){
            Balance-=amount;
        }
    }
    public void displayAccountInfo()
    {
        System.out.print("\nAccount Holder : "+AccountHolder);
        System.out.print("\nAccount Holder Address : "+AccountHolderAddress);
        System.out.print("\nAccount Number : "+AccountNumber);
        System.out.println("\nAccount Balance : "+Balance);
    }
    public static void main(String[] args) {
        //state bank of india
            //the entry balance should be 10 here 
            //the account no will be fixed for all the branch
            //here the default name will be SOB_USER
        System.out.println("Global User");
        BankAccount globalUser = new BankAccount();
        globalUser.displayAccountInfo();
        //State Bank Of India Dasnagar
        // here the entry balance should be 100
        // the name will be your actual name
        System.out.println("Dasnagar User");
        BankAccount SOB_DASNAGAR_USER = new BankAccount("Parambrata Ghosh",globalUser.AccountNumber,100,"Dharsa Panchanantala");
        SOB_DASNAGAR_USER.deposit(1000);
        SOB_DASNAGAR_USER.displayAccountInfo();
        SOB_DASNAGAR_USER.withdraw(175);
        SOB_DASNAGAR_USER.displayAccountInfo();
        //Update to this account
        System.out.println("Dasnagar Updated User");
        SOB_DASNAGAR_USER.AccountHolderAddress = "Dharsa Panchanantala, Howrah";
        BankAccount SOB_DASNAGAR_UPDATED_USER = new BankAccount(SOB_DASNAGAR_USER);
        SOB_DASNAGAR_UPDATED_USER.displayAccountInfo();
    }
}