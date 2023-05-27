class usuario
{
    //todos os usuarios do meu sistema vai ter as
    //propriedades e metodos de um usuario

    var nome : String = "";
    var email : String = "";
    var idade : String = "";
    var senha : String = "";
    var pet : Cachorro? = null;

    var carrosUsuario :MutableList<carro> = mutableListOf()

    constructor(nome: String, pet : Cachorro)
    {
        this.nome = nome;
        this.pet = pet;

    }
constructor(nome:String,email : String)
{
    this.nome = nome;
    this.email = email
}
    fun AdicionarPet (pet: Cachorro)
    {
        this.pet = pet;
    }

    fun NomeEEmail():String
    {
        return nome + "e o email"+email+ "e a idade" + idade;
    }
    fun MudarSenha( novaSenha:String)
    {
        senha = novaSenha
    }
}
