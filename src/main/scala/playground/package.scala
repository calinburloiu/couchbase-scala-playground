import play.api.libs.json.Json

/**
 * Created by calinburloiu on 4/30/14.
 */
package object playground {

  def prettify(rawJson: AnyRef) = Json.prettyPrint(Json.parse(rawJson.toString))
}
