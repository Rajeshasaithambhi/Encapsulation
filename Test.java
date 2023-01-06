public class Test{
public static void main(String[]args){

Customer cust1=new Customer(101,2000,12345678);
cust1.display();
cust1.set_balance(5000);
cust1.display();
cust1.get_balance();
System.out.println("Print get_balance"+cust1.get_balance());




}
}
