package ejercicio5Interpreter;

public class Suma extends AbstractExpression {
    public Suma(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.aparecioMultiplicacion) {
            if (context.input.startsWith("+")) {
                context.input = context.input.substring(digit);
            }
        }else{
            throw new ArithmeticException();
        }
    }
}
