class Customer{
//Private data Members
    private int Id;
    private double  balance;
    private long pan;
Customer(int Id,double balance,long pan){

    this.Id=Id;
    this.balance=balance;
    this.pan=pan;
}
void display()
{
System.out.println(Id+" "+balance+" "+pan);
}
//public getter and setter method
public double get_balance()
    {
    return balance;
    }
public void set_balance(double balance)
    {
    this.balance=balance;
    }
}
