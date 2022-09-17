import scala.math._

object question1 extends App{

    val p1 = new Point(0,0)
    val p2 = new Point(3,4)

    val p3 = p2.move(1,1)
    val p4 = p2.distance(p1)
    val p5 = p2.invert()

    println(p1 + p2)
    println(p4)
    println(p5)

}

case class Point(x:Int, y:Int){

    def +(that:Point) = Point(this.x+that.x, this.y+that.y) //add two given points

    def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)  //move a point by a given distance

    def distance(that:Point) =  sqrt( pow(that.x-this.x, 2) + pow(that.y-this.y, 2) )   //distance between two given points

    def invert() = Point(this.y, this.x) //switch the x and y coordinates
}