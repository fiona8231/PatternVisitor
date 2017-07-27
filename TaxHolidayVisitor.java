import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {


    DecimalFormat df = new DecimalFormat("#.##");

    //constructor

    public TaxHolidayVisitor(){

    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item price with tax: ");
        return Double.parseDouble(df.format(liquorItem.getPrice()* 0.1 + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item price with tax: ");
        return Double.parseDouble(df.format(tobaccoItem.getPrice()* 0.2 + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item price with tax: ");
        return Double.parseDouble(df.format(necessityItem.getPrice()* 0 + necessityItem.getPrice()));
    }
}
