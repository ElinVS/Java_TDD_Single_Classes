public class Printer {

    //property
    private int sheets;
    private int volume;

    //constructor
    public Printer(int sheets,int volume) {
        this.sheets = sheets;
        this.volume = volume;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean print() {
        int pages = 10;
        int copies = 5;

        int pagesToPrint = pages * copies;

        if (this.sheets >= pagesToPrint){
            return true;
        } else {
            return false;
        }
    }
}



