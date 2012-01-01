resolvers ++= Seq(
    Classpaths.typesafeResolver,
    "lessis" at "http://repo.lessis.me"
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0-M2")

addSbtPlugin("me.lessis" % "np" % "0.2.0")
