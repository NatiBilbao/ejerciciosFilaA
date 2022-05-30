package ejercicio5Interpreter;

public class Context {
    protected String input="";
    protected int output=0;

    protected boolean aparecioMultiplicacion = false;

    protected boolean huboMultiplicacion = false;
    protected boolean primeraexpression = true;

    public Context(String input){
        this.input=input;
    }
}
