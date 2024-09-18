public class OlaMergulhador {


    // Comentários

    /*
        COmentários em bloco
     */

    //TODO: keyword reservado para novas features/funcionalidades


    // Acessar o java code conventions e google style guide
    // Principalmente da oracle

    /*

     Palavras reservadas do java:

     abstract
     class
     extends
     implements
     new
     static
     throws
     enum
     boolean
     const = não possui significado no compilador
     final
     import
     package
     strictfp
     transient
     break
     continue
     finally
     instanceof
     private
     super
     try
     byte
     default
     float
     int
     protected
     switch
     void
     case
     do
     for
     interface
     public
     synchronize
     volatile
     catch
     double
     goto = não possui significado no compilador
     long
     return
     this
     while
     chat
     else
     if
     native
     short
     throw
     assert

     */

    int counter = 20; // Variável de instância
    static float PI = 3.14f; // Variável de classe


    public static void main(String[] args) {

        // Linguagem fortemente tipada, todas as variáveis devem ser criadas com um tipo fixo.
        // Code Convention da Oracle, uma declaração de variável por linha;

        // DesignPattern de java - Lower cammel case
        int age = 30; // Variável local (dentro do corpo do método)

    }

    public static void print(int param) { // Argumento de método
        System.out.println(param);
    }

    /*
    Nomes de variáveis em Java são sensíveis a maiúsculas e minúsculas. O nome da variável employee não é o mesmo que Employee ou EMPLOYEE.,
    Nomes de variáveis em Java devem começar com uma letra, ou o caractere $ ou . Após o primeiro caractere em um nome de variável Java, o nome pode conter números, $ ou .
    Nomes de variáveis não podem ser palavras reservadas em Java. Por exemplo, as palavras break ou continue são reservadas em Java. Portanto, você não pode nomear suas variáveis com elas.
    Nomes de variáveis devem ser escritos em minúsculas. Por exemplo, variable ou apple.
    Se os nomes das variáveis consistirem em várias palavras, siga a notação camelCase. Por exemplo, deptName ou firstName.
    Campos finais estáticos (constantes) devem ser nomeados em todas as maiúsculas, normalmente usando um sublinhado _ para separar as palavras no nome. Por exemplo, LOGGER ou INTEREST_RATE.
     */

    

}
