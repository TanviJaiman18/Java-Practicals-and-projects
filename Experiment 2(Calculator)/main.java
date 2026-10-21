public class main {
    void main(){
        Cviews cv = new Cviews();
        Cmodals cm = new Cmodals();
        new Ccontroller(cm, cv);
        System.out.println("Calculator");
    }
}
