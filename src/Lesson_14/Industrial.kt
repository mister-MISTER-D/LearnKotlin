package Lesson_14

import javax.print.attribute.standard.JobOriginatingUserName

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones(){
        println("$name: сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic(){
        super.runSystemDiagnostic()
        println("$name: Запущена диагностика дронов и майнеров")
    }

}