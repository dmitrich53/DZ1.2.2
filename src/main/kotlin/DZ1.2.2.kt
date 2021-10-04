fun main() {
    while (true) {
        println("Введите количество положительных likes.")
        val likes = readLine()
        val discardingPositions = likes?.takeLast(1)
        if (discardingPositions != "1") {
            println("Понравилось $likes людям.")
        } else {
            println("Понравилось $likes человеку.")
        }
        println("Новый ввод - ENTER. Завершить - введите q и ENTER.")
        if (readLine() == "q") break
    }
}