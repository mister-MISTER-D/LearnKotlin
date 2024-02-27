package lesson_15

abstract class SpaceSh : Movable, Shoottable {
    abstract  val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceSh(){
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернутькрылья")
    }

    override fun startShoopting() {
        println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить орудие N")
    }

}