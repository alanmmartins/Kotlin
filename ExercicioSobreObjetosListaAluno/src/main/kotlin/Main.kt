import java.util.Scanner

fun main(args: Array<String>) {
    var terminal = Scanner(System.`in`)
    var terminal02 = Scanner(System.`in`)

    var listaAlunos = arrayOf<Aluno>()

    println("digite  1 para adicionar nome # 2 para listar # 3 para sair")


    var acao = terminal02.nextInt()

    while (acao != 3) {

        if (acao == 1) {

            println(" dig nomes ")
            var nA = terminal.nextLine()
            //nA = nome do aluno

            println(" dig a media ")
            var mM = terminal02.nextInt()
            //mM  = media do aluno

            var alu = Aluno(nA, mM)
            // Alu = aluno

            listaAlunos = listaAlunos.plus(alu)

        } else if (acao == 2) {
            for (alluno in listaAlunos) {
                println("a lista de aluno e  " + alluno.nome + " a media e " + alluno.media)
            }
            //alluno = alunos na lista memoria
        }
        println("dig 1 p add nome2  p listar 3 para sair")
        acao = terminal02.nextInt()
    }

}

