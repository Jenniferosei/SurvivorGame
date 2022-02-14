import org.scalatest.flatspec.AnyFlatSpec

class FlatSpecClass extends AnyFlatSpec{

  "Gun1" should "reduce Player1's health by 30" in {

    val player1 = new Player1("Francis","Arrow")
    Gun1.shoot(player1)
    assert(player1.health ==70)


  }

  "Player2 armour" should "work" in{
    val player2 = new Player2(true,"gitFree Spec and Flat SpecTed","Acid")

    Gun2.shoot(player2)
    assert(player2.health ==60)
  }

}
