public class Payment {

    // instance variables
    public int paymentId;
    private double amount;
    private String method;          
    private String status;          
    private String paymentDate;     
    private String transactionRef;  

    // Constructors
    public Payment(int paymentId) {
        this.paymentId = paymentId;
        this.status = "PENDING";
    }

    public Payment(int paymentId, double amount) {
        this(paymentId);
        setAmount(amount);
    }

    public Payment(int paymentId, double amount, String method,
                   String payerName, String paymentDate) {
        this(paymentId, amount);
        setMethod(method);
        this.paymentDate = paymentDate;
        this.status = "PAID";
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        try {
            if (paymentId <= 0) {
                throw new IllegalArgumentException("Payment ID must be positive");
            }
            this.paymentId = paymentId;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Amount cannot be negative");
            }
            this.amount = amount;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        try {
            if (!method.equals("Cash") &&
                !method.equals("Credit") &&
                !method.equals("PromptPay")) {

                throw new IllegalArgumentException("Invalid payment method");
            }
            this.method = method;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        try {
            if (!status.equals("PAID") &&
                !status.equals("PENDING") &&
                !status.equals("FAILED")) {

                throw new IllegalArgumentException("Invalid status");
            }
            this.status = status;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        try {
            if (paymentDate == null || paymentDate.isEmpty()) {
                throw new IllegalArgumentException("Payment date cannot be empty");
            }
            this.paymentDate = paymentDate;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        try {
            if (transactionRef == null || transactionRef.isEmpty()) {
                throw new IllegalArgumentException("Transaction reference cannot be empty");
            }
            this.transactionRef = transactionRef;

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
