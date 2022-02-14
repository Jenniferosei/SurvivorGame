abstract class Player(val name: String , val weapon:String,var health: Int =100) {

  def healing: Unit = {
    health = 100

  }

  def death: Boolean={
    health <1
  }

  def setHealth(newHealth: Int){
    health= newHealth
  }

}