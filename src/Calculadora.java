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
                if (Character.isDigit(exp[i]))
                {
                    //guardar el número que salió
                    numeros.push((int)exp[i]);
                }
                else {
                    //hay que operar
                    int a = numeros.pop();
                    int b = numeros.pop();
                    int r = 0;

                    if (exp[i] == '+') {
                        r = a + b;
                        numeros.push(r);
                    } else if (exp[i] == '-') {
                        r = a - b;
                        numeros.push(r);
                    } else if (exp[i] == '*') {
                        r = a * b;
                        numeros.push(r);
                    } else if (exp[i] == '/') {
                        r = (a / b);
                        numeros.push(r);
                    }
                    else {
                        //ignorar porque es un espacio vacío
                    }
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
