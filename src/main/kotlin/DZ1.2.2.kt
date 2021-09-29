fun main() {
    while (true) {
        println("Введите количество положительных likes.")
        var likes = readLine()
        var d = likes!!.count()
        var del = likes!!.removeRange(0, d - 1)
        if (del != "1") {
            println("Понравилось $likes людям.")
        } else {
            println("Понравилось $likes человеку.")
        }
        println("Новый ввод - ENTER. Завершить - введите q и ENTER.")
        var prov = readLine()
        if (prov == "q") break
    }
}