object question3 extends App {
    
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f

    // --b * a + c *d--
    b-=1   // --b
    println( b * a + c *d) 
    d-=1 // d--

    // a++
    println(a); 
    a+=1   //a++

    // –2 * ( g – k ) +c
    println (-2 * ( g - k ) +c)

    // c=c++
    println (c);
    c+=1;   //c++

    // c=++c*a++
    c+=1
    println (c*a)
    a+=1
}
