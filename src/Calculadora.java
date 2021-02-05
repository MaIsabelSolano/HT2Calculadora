import java.util.Scanner;

public class Calculadora implements CalculadoraGeneral{

    Scanner scan = new Scanner(System.in);
    StackVector<Integer> numeros = new StackVector<Integer>();

    public Calculadora(){}

    @Override
    public String Calculo(String expresion)
    {
        String resultado = "";
        float resuladonum = 0;
        char[] exp = expresion.toCharArray();   //convierte el string a un array de character
                                                //manejarlo más fácilmente

        //try {

            for (int i = 0; i < exp.length; i++)
            {
                if (exp[i] == 1||exp[i] == 2||exp[i] == 3||exp[i] == 4||exp[i] == 5||
                        exp[i] == 6||exp[i] == 7||exp[i] == 8||exp[i] == 9||exp[i] == 0)
                {

                }
                else if (exp[i] == '+')
                {
                    int a = numeros.pop();
                    int b = numeros.pop();
                    int r = a+b;
                    numeros.push(r);
                }
                else if (exp[i] == '-')
                {
                    int a = numeros.pop();
                    int b = numeros.pop();
                    int r = a-b;
                    numeros.push(r);
                }
                else if (exp[i] == '*')
                {
                    int a = numeros.pop();
                    int b = numeros.pop();
                    int r = a*b;
                    numeros.push(r);
                }
                else if (exp[i] == '/')
                {
                    int a = numeros.pop();
                    int b = numeros.pop();
                    int r = (a/b);
                    numeros.push(r);
                }
                else
                {
                    //ignorar
                }
            }
            //}
        return resultado;
    }


        //}
        //catch (){
            //Hubo un error
            //resultado = "La expresion ingresada no es valida";
            //scan.nextLine();
        //}
}
