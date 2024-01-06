import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transaction;
    private String name;

    public Customer(String customerName, double initialAmount ){
        this.name = customerName;
        //Intiantiated the array list
        this.transaction = new ArrayList<>();
        // added the amount to the transaction
        addTransaction(initialAmount);
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }


    public void addTransaction(double amount){
        this.transaction.add(amount);
    }


    private ArrayList<Double> setTransaction(double transaction) {
        this.transaction = new ArrayList<Double>();
        return null;
    }
    public String getName() {
        return name;
    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//    public Customer(ArrayList<Double> transaction, String customerName) {
//        this.transaction = transaction;
//
//        this.customerName = customerName;
//    }
}
