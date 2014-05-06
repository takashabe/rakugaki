package controllers.api

import play.api._
import play.api.mvc._

/**
 * API about the book
 * Return response format a JSON
 */
object Book extends Controller {
  def list = Action {
    Ok("test")
  }
}
