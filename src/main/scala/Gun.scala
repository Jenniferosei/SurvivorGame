sealed abstract class DamageValue(val damageValue: Int)


abstract class Gun(damageValue: Int,val gunName:String) extends DamageValue(damageValue){

  def shoot(player: Player)
}
case object Gun1 extends  Gun(30,"Gun1"){
  def shoot(player: Player):Unit={
    val newHealth = player match {
      case player1: Player1 => player1.health - damageValue
      case player2: Player2 => if(player2.armour){
        player2.health -damageValue+10
      }else{
        player2.health-damageValue
      }
    }
    player.setHealth(newHealth)

  }
}
case object Gun2 extends  Gun(50,"Gun2"){
  def shoot(player: Player):Unit={
    val newHealth = player match {
      case player1: Player1 => player1.health - damageValue
      case player2: Player2 => if(player2.armour){
        player2.health -damageValue+10
      }else{
        player2.health-damageValue
      }
    }
    player.setHealth(newHealth)

  }

}