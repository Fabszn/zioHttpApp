package org.zio.http.app


import zio.http.*
import zio.*
import zio.http.Header.ContentType
import zio.http.Path.empty

import java.io.File


object MainApp extends ZIOAppDefault {

  override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = Server.serve(app).provide(Server.default)

  val textRoute =
    Method.GET / "text" -> handler(Response.text("Hello World!"))

  val loadApp =
    Method.GET / ""  -> Handler.fromFile(new File("src/main/resources/index.html")).addHeader(Header.ContentType.name, "text/html; charset=utf-8")


  val app: HttpApp[Any] = Routes(loadApp).sandbox.toHttpApp  @@ Middleware.serveResources( Path.empty )


}