public class Main {
    public static void main(String[] args) {
        Document document = new Document("Yujin");
        Father objectA = new Father("John",HairColor.BLACK,document,40);
        Son objectB = new Son("Max", HairColor.BROWN,document, 20);
        Son objectC = new Son("Jek", HairColor.BLACK,document, 10);
        objectA.getInfo();
        objectB.getInfo();
        objectC.getInfo();
      /* Не использовал цикл потом что потомки дедушки не могут быть этои дедушками
       Father[] sanjra = {objectA, objectB, objectC};
        for (int i = 0; i < sanjra.length; i++) {
            sanjra[i].getInfo();
        }*/
    }
}