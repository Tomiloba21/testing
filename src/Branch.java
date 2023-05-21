import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer> ();
    }

    public String getName(){
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }
        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;

    }

    private Customer findCustomer(String customerName){
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

//
//    public Customer addNewCustomers(String name){
//        if (Objects.equals(name, super.getCustomerName())){
//            System.out.println("Sorry You Already Have an account at this Branch.");
//            return null;
//        }
//        ArrayList<Double> trans = new ArrayList<>();
//        return new Customer();
//
//    }
//    public void getTransaction(String name){
//        ArrayList<Double> transaction = super.getTransaction();
//        try {
//            System.out.println(transaction);
//        }catch (Exception err){
//            System.out.println(err);
//        }
//
//
//    }
}
