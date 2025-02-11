package YAIP5;

public class Main {
    public static void main(String[] args) {
        // Default Cylinder
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);  
    
        Cylinder cylinder2 = new Cylinder(2.0, 5.0);
        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());

     
        Cylinder cylinder3 = new Cylinder(3.0, 7.0, "blue");
        System.out.println(cylinder3);
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}
