public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println(t1);

        t1 =new Triangle(3,5,6);
        System.out.println(t1);

        t1=new Triangle(4,6,7,"red",true);
        System.out.println(t1);
    }
}
