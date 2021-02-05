import java.util.Scanner;

public class Calculadora implements CalculadoraGeneral{

    Scanner scan = new Scanner(System.in);
    StackVector<Float> numeros = new StackVector<Float>();
        //son floats y no ints para no tener problema con la división

    public Calculadora(){}

    @Override
    public String Calculo(String expresion)
    {
        String resultado = "";
        float resuladonum = 0;
        //try {

            for (char c: expresion.toCharArray())
            {
                if (Character.isDigit(c))
                {
                    //guardar el número que salió
                    numeros.push((float)c);
                }

                else if (Character.isWhitespace(c)){
                    //Ignorar porque es un espacio permitiendo que se ingresen expresiones con o
                    //sin espacio
                }

                else {
                    //hay que operar
                    float a = numeros.pop();
                    float b = numeros.pop();
                    float r;

                    if (c == '+') {
                        r = a + b;
                        numeros.push(r);
                    } else if (c == '-') {
                        r = a - b;
                        numeros.push(r);
                    } else if (c == '*') {
                        r = a * b;
                        numeros.push(r);
                    } else if (c == '/') {
                        r = (a / b);
                        numeros.push(r);
                    }
                }
            }
            //}
        return numeros.pop().toString();
    }


        //}
        //catch (){
            //Hubo un error
            //resultado = "La expresion ingresada no es valida";
            //scan.nextLine();
        //}
}
