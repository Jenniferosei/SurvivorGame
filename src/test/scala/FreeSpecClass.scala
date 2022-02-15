import org.scalatest.freespec.AnyFreeSpec

class FreeSpecClass extends  AnyFreeSpec {

  "A Player" - {
    "when shot " - {
      "should have health reduced appropriately" in {

        val player1 = new Player1("Francis", "Arrow")
        Gun1.shoot(player1)
        assert(player1.health == 70)


      }
    }
  }


              "Player2 armour" - {
                "should" - {

                  "work" - {
                    val player2 = new Player2(true, "gitFree Spec and Flat SpecTed", "Acid")

                    Gun2.shoot(player2)
                    assert(player2.health == 60)
                  }


                }

              }

          }
//
//        "A Set" - {
//          "when empty" - {
//            "should have size 0" in {
//              assert(Set.empty.size == 0)
//            }
//            "should produce NoSuchElementException when invoked" in {
//              assertThrows[NoSuchElementException] {
//                Set.empty.head
//              }
//            }
//          }
//        }
//      }


