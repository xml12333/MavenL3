//"6. Create a class and demonstrate proper encapsulation techniques
//the class will be called Printer
//It will simulate a real Computer printer
//It should have fields for toner level, number of pages printed, and also
//whether its a duplex printer (capable of printing on both sides of the paper).
//Add methods to fill up the toner (up to a maximum of 100%), another method to
//simulate printing a page(which should increase the number of pages printed).
//Decide on the scope, whether to use constructors, and anything else you think is needed."
public class Printer {
    private int tonerLevel,numberOfPagesPrinted;
    private boolean duplexPagesPrinted;

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return this.numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean getDuplexPagesPrinted() {
        return this.duplexPagesPrinted;
    }

    public void setDuplexPagesPrinted(boolean duplexPagesPrinted) {
        this.duplexPagesPrinted = duplexPagesPrinted;
    }

    public void fillUp(int tonerVolume)
    {
        this.tonerLevel=this.tonerLevel+tonerVolume;
    }
    public void print(int pages, boolean duplexPagesPrinted)
    {
        this.numberOfPagesPrinted = pages;
        if (duplexPagesPrinted==true) {
            this.tonerLevel = pages*2;
        }
        else{
        this.tonerLevel = pages;
    }
    }
    public boolean tonerIsEmpty(){
        if (this.tonerLevel <=1001){ return true;}
        else {return false;}
    }


    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.setNumberOfPagesPrinted(20);
        obj.setTonerLevel(800);
        obj.print(200,true);
        System.out.println(obj.getTonerLevel());
        if (obj.getTonerLevel()<= 500) {
            obj.fillUp(500);
        }
        System.out.println(obj.getTonerLevel());
    }

}
