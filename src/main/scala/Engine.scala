import scala.util.Random

object Engine {
  def main (args: Array[String]):Unit = {

    val guns =List(Gun1,Gun2)

    val player1 = new Player1("Jen", "Sword")
    val player2 =  new Player2(Random.nextBoolean(),"Nii","Gun")

    val players: List[Player] = List(player1,player2)

    val selectedPlayer = players(Random.nextInt(2))

    while(!selectedPlayer.death){
      val triggeredGun = guns(Random.nextInt(2))
      selectedPlayer match {
        case player1: Player1 => println(s"${player1.name}(armour:false,gun:${triggeredGun.gunName}):Im still alive, my health is ${player1.health}" )
        case player2: Player2 =>println(s"${player2.name}(amour: ${player2.armour},gun:${triggeredGun.gunName}): Im still alive, my health is ${player2.health}" )

      }


      val newHealth = triggeredGun.shoot(selectedPlayer)
      selectedPlayer.setHealth(newHealth)
    }
    println(" I'm dead!!!!!!!!!")

  }
}

