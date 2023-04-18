public class persongeneric {
    public static void main(String[] args) {
        person<Integer> data=new person<Integer>();
        data.data1=23;
        System.out.println(data.data1);
        data.data2=1010;
        System.out.println(data.data2);

        person<String> obst=new person<String>();
        obst.data1="Abukar Hassan Salah";
        obst.data2="C120479";
        System.out.println(obst.data1);
        System.out.println(obst.data2);

        person<Boolean> obbool=new person<Boolean>();
        obbool.data1=true;
        obbool.data2=false;
        System.out.println(obbool.data1);
        System.out.println(obbool.data2);
    }
}
