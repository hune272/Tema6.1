public class TestGhiozdan {
    public static void main(String[] argv) {
        Ghiozdan g = new Ghiozdan();
        Caiet c1 = new Caiet("Matematica");
        Caiet c2 = new Caiet("Geografie");
        Manual m1 = new Manual("Romana");
        Manual m2 = new Manual("Matematica");

        g.add(c1);
        g.add(c2);
        g.add(m1);
        g.add(m2);

        System.out.println("Nr de rechizite: " + g.getNrRechizite());
        System.out.println("Nr de caiete: " + g.getNrCaiete());
        System.out.println("Nr de manuale: " + g.getNrManuale());

        g.listItems();
        g.listCaiet();
        g.listManual();

    }
}
