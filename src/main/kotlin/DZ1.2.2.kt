fun main() {
    while (true) {
        println("Введите количество положительных likes.")
        val likes = readLine()
        val numberLength = likes?.count()
        val discardingPositions = likes?.removeRange(0, numberLength?.minus(1) ?: 0)
        if (discardingPositions != "1") {
            println("Понравилось $likes людям.")
        } else {
            println("Понравилось $likes человеку.")
        }
        println("Новый ввод - ENTER. Завершить - введите q и ENTER.")
        if (readLine() == "q") break
    }
}