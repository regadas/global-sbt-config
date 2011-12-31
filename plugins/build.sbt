resolvers ++= Seq(
    Classpaths.typesafeResolver,
    "lessis" at "http://repo.lessis.me"
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.5.0")

addSbtPlugin("me.lessis" % "np" % "0.2.0")
