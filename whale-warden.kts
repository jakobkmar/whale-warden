service("itzg/minecraft-server:adopt11") {
    name = "zickzack"
    tty = true

    ports(25565 to 25565)

    mounts(
        "data" to "/data",
        "./mods" to "/mods"
    )

    restart(UNLESS_STOPPED)

    env["DB_HOST"] = "mongodb"

    env(
        "EULA" to true,
        "TYPE" to "FABRIC"
    )

    events {
        onFirstStart {
            // custom logic
        }
    }
}
