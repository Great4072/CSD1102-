import java.time.LocalTime;

public class Restaurant {


    public int restaurantId;
    private String name;
    private String address;
    private String phone;
    private String email;

    private LocalTime openTime;
    private LocalTime closeTime;

    private boolean available;
    private double rating;
    private int totalOrders;


    public Restaurant() {
    }

    public Restaurant(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Restaurant(int restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    public Restaurant(int restaurantId, String name, String address, String phone) {
        this(restaurantId, name);
        this.address = address;
        this.phone = phone;
    }

    public Restaurant(int restaurantId, String name, String address, String phone,
                      LocalTime openTime, LocalTime closeTime,
                      boolean available, double rating, int totalOrders) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.available = available;
        this.rating = rating;
        this.totalOrders = totalOrders;
    }


    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

        // ตัวอย่างที่ 1: ตรวจสอบค่าตัวเลขไม่ให้ติดลบ
public void setTotalOrders1(int totalOrders) {
    if (totalOrders < 0) {
        // โยน Exception ออกไปเมื่อเงื่อนไขไม่ถูกต้อง
        throw new IllegalArgumentException("จำนวนคำสั่งซื้อต้องไม่ต่ำกว่า 0");
    }
    this.totalOrders = totalOrders;
}

// ตัวอย่างที่ 2: ตรวจสอบความยาวรหัสผ่าน
public void setPassword1(String password) {
    if (password == null || password.length() < 6) {
        throw new IllegalArgumentException("รหัสผ่านต้องมีอย่างน้อย 6 ตัวอักษร");
    }
    this.password = password;
}

public Customer(int customerId, String name, ...) {
    if (customerId <= 0) {
        throw new IllegalArgumentException("ID ลูกค้าต้องเป็นจำนวนบวกเท่านั้น");
    }
    this.customerId = customerId;
    // ... กำหนดค่าอื่นๆ ...
}

public class Main {
    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        
        try {
            // ลองใส่ค่าที่ผิดเงื่อนไข
            myCustomer.setTotalOrders(-5); 
        } catch (IllegalArgumentException e) {
            // จัดการเมื่อเกิดข้อผิดพลาด
            System.out.println("พบข้อผิดพลาด: " + e.getMessage());
            System.out.println("ระบบจะตั้งค่าเริ่มต้นเป็น 0 ให้แทน");
            myCustomer.setTotalOrders(0);
        } finally {
            // ส่วนนี้จะทำงานเสมอ (เช่น ปิดการเชื่อมต่อฐานข้อมูล)
            System.out.println("การประมวลผลข้อมูลลูกค้าเสร็จสิ้น");
        }
    }
}
}