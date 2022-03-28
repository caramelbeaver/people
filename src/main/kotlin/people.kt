fun main() {
    print("Введите количество лайков: ")
    val likes = readln().toUIntOrNull()
    if (likes == null) {
        println("Некорректный ввод")
        return
    }
    if (likes % 10u==1u && likes % 10u != 11u) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}