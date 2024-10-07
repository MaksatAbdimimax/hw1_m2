public class Grandfather {
    private String name;
    private int age;
    private Document document;
    private HairColor hairColor;

    public String getName() {
        return name;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public int getAge() {
        return age;
    }

    public Document getDocument() {
        return document;
    }

    public Grandfather(String name, HairColor hairColor, Document document, int age) {
        this.name = name;
        this.hairColor = hairColor;
        this.document = document;
        this.age = age;
    }
   public void getInfo(){
       System.out.println("Name: "+name+
               "\nAge: "+age+
               "\nDocument: "+document.getDom()+
               "\nHairColor: "+hairColor);
   }
}
