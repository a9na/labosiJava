package MatricaNiti;

class Nit extends Thread {
    private int[] redak;

    public Nit(int[] redak) {
        this.redak = redak;
    }

    @Override
    public void run() {
        int max = redak[0];
        for (int broj : redak) {
            if (broj > max) {
                max = broj;
            }
        }
        System.out.println("MatricaNiti.Nit " + Thread.currentThread().getId() + " je zavrsila s radom, najveći broj u retku je: " + max);
    }
}
