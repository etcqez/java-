import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashsetSource {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);
    }
}
