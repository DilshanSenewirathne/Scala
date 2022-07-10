object question4_a extends App {

    def normal(hours:Int)=250*hours;

    def ot(hours:Int)=85*hours;

    def income(h1:Int,h2:Int)=normal(h1)+ot(h2);

    def tax(income:Int)=income*0.12;

    def takeHomeSalary(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2));

    printf("Take home salary for 40 normal hours & 30 ot hours: %.2f",takeHomeSalary(40,30));

}


