package net.xylophones.planetoid.game.model

import net.xylophones.planetoid.game.maths.Vector2D

case class Explosion(val position: Vector2D,
                     val radius: Int) extends Circular {

}
