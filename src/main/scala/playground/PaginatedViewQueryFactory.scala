package playground

import com.couchbase.client.CouchbaseClient
import com.couchbase.client.protocol.views._

object PaginatedViewQueryFactory {

  def create(client: CouchbaseClient, designDocName: String, viewName: String, viewKey: String) = {
    val view = client.getView(designDocName, viewName)
    val query = new Query()
    query.setKey(viewKey)
    query.setIncludeDocs(true)
    client.paginatedQuery(view, query, 5)
  }
}
