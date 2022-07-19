object question4_b extends App {
    
    def attendees(price:Int)= 120 + (15-price)/5*20;

    def revenue(price:Int)= attendees(price)*price;

    def cost(price:Int)=500 + 3*attendees(price);

    def profit(price:Int)=revenue(price) - cost(price);

    printf("Profit for ticket price 15: %d\n",profit(15));
    printf("Profit for ticket price 20: %d\n",profit(20));
    printf("Profit for ticket price 25: %d\n",profit(25));
    printf("Profit for ticket price 30: %d\n",profit(30));
    printf("Profit for ticket price 35: %d\n",profit(35));
    printf("Profit for ticket price 45: %d\n",profit(40));


}
