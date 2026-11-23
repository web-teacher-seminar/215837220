
public class Main {
    public static void main(String[] args) {
//בדיקה שהכל עובד
      MyMap m=new MyMap(8);
      m.set("esty",18);
      m.set("guttmann",22);
      m.set("guttmann2",33);
      m.set("guttmann3",44);
      m.set("guttmann",55);
      m.set("guttmann2",66);
      m.print();
        System.out.println(m.get("guttmann"));
        System.out.println(m.hashKey("guttmann2"));
        System.out.println(m.hashKey("wow"));


    }
}