public class Ghiozdan {
    Rechizita[] rechizite = new Rechizita[10];
    private int index = 0;

     public void add(Caiet c){
         if(index < 10) {
             rechizite[index++] = c;
         }
         else {
             System.out.println("Ghiozdanul este plin!");
         }
     }

    public void add(Manual m){
        if(index < 10) {
            rechizite[index++] = m;
        }
        else {
            System.out.println("Ghiozdanul este plin!");
        }
    }

    public void add(Rechizita r) {
        if (index < 10) {
            rechizite[index++] = r;
        } else {
            System.out.println("Ghiozdanul este plin!");
        }
    }

    public void listItems() {
        //  for(int i=0; i<index; i++)

        for (Rechizita r : rechizite) {
            if (r != null) {
                System.out.println(r.getNume());
            }
        }
    }

    public void listManual() {
        for (Rechizita r : rechizite) {
            if (r instanceof Manual)
                if (r != null) {
                    System.out.println(r.getNume());
                }
        }
    }

    public void listCaiet() {
        for (Rechizita r : rechizite) {
            if (r instanceof Caiet)
                if (r != null) {
                    System.out.println(r.getNume());
                }
        }
    }

    public int getNrRechizite() {
        return index;
    }

    public int getNrManuale() {
        int aux = 0;
        for (Rechizita r : rechizite) {
            if (r instanceof Manual)
                aux++;
        }

        return aux;
    }

    public int getNrCaiete() {
        int aux = 0;
        for (Rechizita r : rechizite) {
            if (r instanceof Caiet)
                aux++;
        }

        return aux;
    }


}
