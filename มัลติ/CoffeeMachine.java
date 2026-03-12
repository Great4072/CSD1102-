class CoffeeMachine {

    // synchronized ใช้แก้ปัญหา Race Condition
    // ทำให้แต่ละครั้งมีเพียง Thread เดียวที่ใช้เครื่องชงได้
    public synchronized void brew(String menu) {

        System.out.println("กำลังใช้เครื่องชง: " + menu);

        try {
            // แบบฝึกข้อ 2
            // เปลี่ยนเวลาจาก 2000 ms เป็นเวลาสุ่ม 0-3000 ms
            Thread.sleep((long)(Math.random() * 3000));
        } 
        catch (InterruptedException e) {}

        System.out.println("เครื่องชงเสร็จ: " + menu);
    }
}
