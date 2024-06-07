public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel > 100 || tonerLevel < 0 ? -1 : tonerLevel;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages) {
        pagesPrinted += pages;
        if(duplex) {
            System.out.println("It's a duplex printer.");
            return pagesPrinted / 2 + pagesPrinted % 2;
        }
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
