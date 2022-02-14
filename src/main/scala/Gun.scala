sealed abstract class DamageValue(val value: Int)


abstract class Gun(damageValue: Int,val gunName:String) extends DamageValue(damageValue){

  def shoot(player: Player):Int={
    player match {
      case player1: Player1 => player1.health - damageValue
      case player2: Player2 => if(player2.armour){
        player2.health -damageValue+10
      }else{
        player2.health-damageValue
      }
    }

  }
}
case object Gun1 extends  Gun(30,"Gun1")
case object Gun2 extends  Gun(50,"Gun2")