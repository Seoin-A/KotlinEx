fun stringFormat(){
    var price = 1000;
    var tax = 100;

    val originalPrice = "Thr original price is $price"
    val taxPrice = "The tax price is ${price+tax}"

    println(originalPrice)
    println(taxPrice);
}
