import java.util.Scanner

//class HoraSalario {

//    var salario: Double = 5000.0
//    var horasMensais: Double = 220.0
//    var valorHoraMensal = 0.0

fun valorDaHoraTrabalhada(salario: Double, horasMensais: Double = 220.0): Double {
    return salario / horasMensais
}

val reader = Scanner(System.`in`)
fun main(args: Array<String>) {

    println("Qual seu salario atual?")
    var salario: Double = reader.nextDouble()
    var horasTrabalhadas = 220.0
    var horaMes = salario/horasTrabalhadas


    print("Você ganha por hora hoje: $horaMes")


}