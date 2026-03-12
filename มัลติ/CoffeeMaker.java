class CoffeeMaker implements Runnable {

    private String menu;
    private CoffeeMachine machine;

    // Constructor รับชื่อเมนูและเครื่องชง
    public CoffeeMaker(String menu, CoffeeMachine machine) {
        this.menu = menu;
        this.machine = machine;
    }

    @Override
    public void run() {

        // Thread แต่ละตัวจะเรียกใช้เครื่องชง
        // ถ้าไม่มี synchronized จะเกิด Race Condition
        machine.brew(menu);
    }
}
