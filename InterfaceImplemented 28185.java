package pkginterface;
public class InterfaceImplemented implements MyFirstInterface {
    
    @Override
    public void display(){
        System.out.println(x); //Error : cannot assign a valu to final variable "x"
}
}
