class Cachorro
{
    var nomeCachorro : String;

    var raca : String;

    var peso : Int;

    constructor( nomeCachorro: String ,
                 raca : String,
                peso : Int)
    {
        this.nomeCachorro = nomeCachorro;
        this.raca = raca ;
        this.peso = peso;
    }

    fun Falar()
    {
        println("auf auf")
    }
    fun FazerXixi()
    {
        println("xiiiii")
    }
    fun Correr()
    {
        println("pocoto")
    }



}