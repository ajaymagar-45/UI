

  class main {


    int num = 500000;

    void test() {
        System.out.println(" INHERITANCE");
    }

    void ok() {
        System.out.println("hello world");
    }

      public static void main(String[] args) {
          main obj=new main();
          obj.test();
      }
}

public class  Hello extends main {
      void a(){
          System.out.println("inheritance");
      }


    public static void main(String[] args) {




       Hello obj1 = new Hello();

        System.out.println("given value is " + obj1.num);
        obj1.test();
        obj1.num = 4;
        System.out.println("given value is " + obj1.num);
        obj1.ok();
		



    }
}
