public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();

        // แบบฝึกข้อ 1
        // เพิ่มเมนูกาแฟให้เป็น 10 รายการ
        String[] menus = {
            "Espresso",
            "Latte",
            "Mocha",
            "Americano",
            "Cappuccino",
            "Macchiato",
            "Flat White",
            "Affogato",
            "Irish Coffee",
            "Ristretto"
        };

        // สร้าง Thread สำหรับแต่ละเมนู
        for(String m : menus){
            new Thread(new CoffeeMaker(m, machine)).start();
        }

        // แบบฝึกข้อ 4
        // แสดงว่า main thread ทำงานต่อโดยไม่รอ Thread อื่น
        System.out.println("End main");

        // แบบฝึกข้อ 3 (อธิบาย)
        // ถ้าใช้ .run() แทน .start()
        // Thread จะไม่ถูกสร้างใหม่ และโปรแกรมจะทำงานทีละคำสั่ง
    }
}
