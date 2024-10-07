public class Father extends Grandfather{
    public Father(String name, HairColor hairColor, Document document, int age) {
        super(name, hairColor, document, age);
    }
    public void teachLife(String string){
        System.out.println("У тебя все хорошо.");
    }
    final public void teachLife(){
        System.out.println("You're doing well.");
    }
}
