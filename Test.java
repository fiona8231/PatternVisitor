import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test {

    public static void main(String[] args){

        TaxVisitor taxCal = new TaxVisitor();
        TaxHolidayVisitor taxHoCal = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor volka = new Liquor(11.7);
        Tobacco cigar = new Tobacco(19.2);

        System.out.println(milk.accept(taxCal));
        System.out.println(volka.accept(taxCal));
        System.out.println(cigar.accept(taxCal));

        System.out.println("Holiday price!");

        System.out.println(volka.accept(taxHoCal));
        System.out.println(milk.accept(taxHoCal));
        System.out.println(cigar.accept(taxHoCal));
    }


}
