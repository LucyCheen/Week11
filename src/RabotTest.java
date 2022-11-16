public class RabotTest {
    public static void main(String[] args) {
        Rabot r = new Rabot("GUNDAM",2022);
        System.out.println(r.getName());
        r.setName("Aerial");
        System.out.println(r.getName());
    }
}
