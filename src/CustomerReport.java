
public class CustomerReport {
	private Bank bank;

   public CustomerReport() {
   }

   public Bank getBank() {
       return bank;
   }

   public void setBank(Bank bank) {
       this.bank = bank;
   }

   public void generateReport() {
       // Print report header
       System.out.println("\t\t\tCUSTOMERS REPORT");
       System.out.println("\t\t\t================");

       // For each customer...
       for ( int cust_idx = 0;cust_idx < Bank.getNumeroClientes();cust_idx++ ) {
           Cliente customer = Bank.getCliente(cust_idx);

           // Print the customer's name
           System.out.println();
           System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

           // For each account for this customer...
           for ( int acct_idx = 0; acct_idx < customer.getNroCuentas(); acct_idx++ ) {
               Cuenta account = customer.getCuenta(acct_idx);
               String  account_type = "";

               // Determine the account type
               if ( account instanceof CajaAhorro ) {
                   account_type = "Savings Account";
               } else if ( account instanceof CuentaCorriente ) {
                   account_type = "Checking Account";
               } else {
                   account_type = "Unknown Account Type";
               }

               // Print the current balance of the account
               System.out.println("    " + account_type + ": current balance is " + account.getBalance());
           }
       }
   }
   public String viewReport(int idCliente) {
	   String strSalida = "";
       // Print report header
       strSalida = "CUSTOMERS REPORT";
       strSalida = strSalida + "\n===================";

       Cliente customer = Bank.getCliente(idCliente);

       // Print the customer's name
       strSalida = strSalida + "\n\nCustomer: " + customer.getLastName() + ", " + customer.getFirstName();

       // For each account for this customer...
       for ( int acct_idx = 0; acct_idx < customer.getNroCuentas(); acct_idx++ ) {
           Cuenta account = customer.getCuenta(acct_idx);
           String  account_type = "";

           // Determine the account type
           if ( account instanceof CajaAhorro ) {
               account_type = "Savings Account";
           } else if ( account instanceof CuentaCorriente ) {
               account_type = "Checking Account";
           } else {
               account_type = "Unknown Account Type";
           }

           // Print the current balance of the account
           strSalida = strSalida +  "\n    " + account_type + ": current balance is " + account.getBalance();
       }
       return strSalida.trim();
   }
}
