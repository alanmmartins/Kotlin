class carro {
    var placa :String;
    var modelo:String;
    var marca:String;

    constructor(novaPlaca:String,
                novoModelo:String,
                novaMarca:String)

    {
        placa = novaPlaca;
        modelo = novoModelo;
        marca = novaMarca
    }
    fun Andar() : String
    {
        return "Vrum vrum"
    }
}
