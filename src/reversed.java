public class reversed {
    public static void main(String[] args) {
        reverser rev=new reverser();
        System.out.println(rev.reverse("Ali Omar"));
        System.out.println(rev.reverse("Somalia"));
        System.out.println(rev.reverse("Just"));
        System.out.println("this is reversed buffer");

//        reversebuffer
        reversebuffer newrev= new reversebuffer();
        System.out.println(newrev.reverseBuffer("Ali Omar"));
        System.out.println(newrev.reverseBuffer("Somalia"));
        System.out.println(newrev.reverseBuffer("Just"));
    }
}
