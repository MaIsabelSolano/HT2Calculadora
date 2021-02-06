public class Calculadora implements CalculadoraGeneral{

    StackVector<Float> numeros = new StackVector<Float>();
        //son floats y no ints para no tener problema con la división

    public Calculadora(){}

    @Override
    public String Calculo(String expresion)
    {
        String resultado = "";

        char[] CCC = expresion.toCharArray();

        for (char c: CCC)
        {
            if (Character.isDigit(c))
            {
                if (c == '1'){ numeros.push(1.0f);}
                else if (c == '2'){numeros.push(2.0f);}
                else if (c == '3'){numeros.push(3.0f);}
                else if (c == '4'){numeros.push(4.0f);}
                else if (c == '5'){numeros.push(5.0f);}
                else if (c == '6'){numeros.push(6.0f);}
                else if (c == '7'){numeros.push(7.0f);}
                else if (c == '8'){numeros.push(8.0f);}
                else if (c == '9'){numeros.push(9.0f);}
                //Está así feo porque cuando convertía 'num' a float me daba un valor muy distinto
            }

            else if (Character.isWhitespace(c)){
                //Ignorar porque es un espacio permitiendo que se ingresen expresiones con o
                //sin espacio
            }

            else {
                //hay que operar
                float a = numeros.pop();
                float b = numeros.pop();

                if (c == '+') {
                    numeros.push(a + b);
                } else if (c == '-') {
                    numeros.push(a - b);
                } else if (c == '*') {
                    numeros.push(a * b);
                } else if (c == '/') {
                    numeros.push(a / b);
                }
            }
        }

        resultado = "resultado " + numeros.pop().toString(); //Devolver respuesta
        if (numeros.empty() == false){
            //Aun hay elementose en el stack por lo que no es una expresion correcta
            resultado = "La expresion no es correcta";
        }
        return resultado;
    }


}

