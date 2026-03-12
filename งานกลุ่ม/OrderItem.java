
public class OrderItem {

    private String MenuId;
    private String MenuName;
    private int quantity;
    private double pricePerUnit;
    public MenuItem menuItem;

    public OrderItem(String MenuId) {
        this.MenuId = MenuId;
    }

    public OrderItem(String MenuId, String MenuName) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
    }

    public OrderItem(String MenuId, String MenuName, int quantity) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
    }

    public OrderItem(String MenuId, String MenuName, int quantity, double pricePerUnit) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public OrderItem(String MenuId, String MenuName, int quantity, double pricePerUnit, MenuItem menuItem) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.menuItem = menuItem;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

}
//ตรวจสอบค่าผิดพลาดใน Constructor
public OrderItem(String menuId, String menuName, int quantity, double pricePerUnit) {

    if (menuId == null || menuId.trim().isEmpty()) {
        throw new IllegalArgumentException("MenuId cannot be null or empty");
    }

    if (quantity <= 0) {
        throw new IllegalArgumentException("Quantity must be greater than 0");
    }

    if (pricePerUnit < 0) {
        throw new IllegalArgumentException("Price per unit cannot be negative");
    }

    this.MenuId = menuId;
    this.MenuName = menuName;
    this.quantity = quantity;
    this.pricePerUnit = pricePerUnit;
}
//ดักจับใน Setter
public void setQuantity(int quantity) {
    if (quantity <= 0) {
        throw new IllegalArgumentException("Quantity must be greater than 0");
    }
    this.quantity = quantity;
}

public void setPricePerUnit(double pricePerUnit) {
    if (pricePerUnit < 0) {
        throw new IllegalArgumentException("Price per unit cannot be negative");
    }
    this.pricePerUnit = pricePerUnit;
}

public void setMenuId(String menuId) {
    if (menuId == null || menuId.trim().isEmpty()) {
        throw new IllegalArgumentException("MenuId cannot be null or empty");
    }
    this.MenuId = menuId;
}
