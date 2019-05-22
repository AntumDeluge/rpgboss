package rpgboss.model.resource

import rpgboss.model._

object ResourceConstants {
  def defaultRcDir = "defaultrc"
  def testRcDir = "testrc"

  def getRcList(dirname: String) = {
    val rcStream = getClass.getClassLoader.getResourceAsStream(
        "%s/enumerated.txt".format(dirname))
    io.Source.fromInputStream(rcStream).getLines().toList
  }

  lazy val defaultRcList = getRcList("defaultrc")
  lazy val testRcList = getRcList("testrc")

  def systemStartScript = "sys/start.js"
  def systemStartCall = "start()"

  def defaultBattleback = "sys/Etolier/01sougen.jpg"
  def battlerTarget = "sys/Redshrike/goblinrider.png"

  def defaultBattleMusic =
    Some(SoundSpec("sys/sean_m_stephens/Battle1.mid"))

  def defaultTilesets = Array[String]()

  def defaultAutotiles = Array[String](
    "sys/autotile-1.png")

  def getProjectDataStartup = ProjectDataStartup(
    startingLoc = MapLoc(RpgMap.generateName(1), 5.5f, 5.5f),
    startingParty = Array(0),

    titlePic = "sys/landscape.png",
    titleMusic =
      Some(SoundSpec("sys/sean_m_stephens/TitleMoon.mid")),

    gameOverPic = "sys/game_over.png",
    gameOverMusic =
      Some(SoundSpec("sys/aaron_mcdonald/Macbeth - Cue 2.mid")),

    screenW = 640,
    screenH = 480,
    fullscreen = false,
    windowIcon = "sys/icon.png",

    windowskin = "sys/turning_polyhedron_mod-scanlines.png",
    msgfont = "sys/Vegur-Regular.ttf",
    fontsize = 24,

    stringInputCharacters =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 -._",

    soundCursor =
      Some(SoundSpec("sys/rpgboss-menu/MenuCursor.ogg")),
    soundSelect =
      Some(SoundSpec("sys/rpgboss-menu/MenuSelect.ogg")),
    soundCancel =
      Some(SoundSpec("sys/rpgboss-menu/MenuCancel.ogg")),
    soundCannot =
      Some(SoundSpec("sys/rpgboss-menu/MenuCannot.ogg")))

  def defaultCharacters = Array(
    Character("Char0", sprite = Some(SpriteSpec("sys/vx_chara01_a.png", 0))),
    Character("Char1", sprite = Some(SpriteSpec("sys/vx_chara01_a.png", 1))),
    Character("Char2", sprite = Some(SpriteSpec("sys/vx_chara01_a.png", 2))),
    Character("Char3", sprite = Some(SpriteSpec("sys/vx_chara01_a.png", 3))),
    Character("Char4", sprite = Some(SpriteSpec("sys/vx_chara01_a.png", 4))))

  def defaultSpriteSpec = SpriteSpec("sys/vx_chara01_a.png", 0)

  def globalsScript = "sys/globals.js"

  def mainScript = "sys/main.js"

  def menuScript = "sys/menu.js"

  def timerScript = "sys/timer.js"

  def transitionsScript = "sys/transitions.js"
}