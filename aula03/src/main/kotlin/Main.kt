import java.util.Scanner

fun main(args: Array<String>)
{
    var terminal = Scanner( System.`in`)
////    var usuario : usuario();
////    usuario.nome = "Lucas"
////    usuario.email = = "lucasemil.com"
////    usuario.idade = 30
////    usuario.senha = "123"
////
////    var usuario02 : usuario();
////    usuario02.nome = "Miguel"
////    usuario02.idade = 30
////    usuario02.senha="123"
//
//
//    var novoCarro = carro (
//        "abc1234",
//         "Celta",
//          "Chervolet")
//    println(novoCarro.marca,)
//
//    var carro2 = carro(
//        "fdg53465",
//        "rapido",
//        "dodge",)
//
//    var arrayCarros =  arrayOf<carro>();
//
//    arrayCarros = arrayCarros.plus( novoCarro);
//    arrayCarros = arrayCarros.plus( carro2 )
//
//    for ( carro in arrayCarros )
//    {
//        println( carro.placa )
//        println( carro.modelo )
//        println( carro.Andar() )
//    }

    var pintcher = Cachorro( "fredy","Pintcher",3 );
    pintcher.Falar()
    pintcher.Correr()
    pintcher.FazerXixi()

    println("Informe a acao do dogzinhuu")
    println( "1 fala 2 correee 3 pixizin o sair" )

    var acao = terminal.nextInt();
    while (acao != 0 )
    {
        if( acao == 1 ){
            pintcher.Falar()
        }else if (acao == 2 ){
            pintcher.Correr()
        }else if (acao == 3){
            pintcher.FazerXixi()
        }else{
            println("0 " + pintcher.nomeCachorro+"esta mimindo")
        }


        println("Informe a acao do dogzinhuu")
        println( "1 fala 2 correee 3 pixizin o sair" )
        acao=terminal.nextInt();
    }

    var novoUsuario = usuario("Lucas" ,"lucas@email.com" )

//    Atribuindo ao meu usuário um novo pet
    novoUsuario.AdicionarPet(pintcher)

    // ? -> Se eu tiver..
    println(novoUsuario.pet?.nomeCachorro)


}
