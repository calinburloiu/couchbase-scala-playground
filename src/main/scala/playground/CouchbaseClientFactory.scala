package playground

import com.couchbase.client.CouchbaseClient
import collection.JavaConversions._
import play.api.libs.json._

/**
 * Creates a CouchbaseClient by providing the host (not URL), bucket and password. It assumes the
 * default port 8091.
 */
object CouchbaseClientFactory {

  def create(host: String, bucket: String, password: String) = new CouchbaseClient(
    Seq(java.net.URI.create(s"http://$host:8091/pools")), bucket, password
  )
}
