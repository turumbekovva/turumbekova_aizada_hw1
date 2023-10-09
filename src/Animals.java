public class Animals extends Zoo{
    private  int age ;
    private Color color ;
    private Habitat habitat ;

    public Animals(String zooName, int age, Color color, Habitat habitat) {
        super(zooName);
        this.age = age;
        this.color = color;
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }


    public Color getColor() {
        return color;
    }


    public Habitat getHabitat() {
        return habitat;
    }

    public final void makeVoice(){
        System.out.println("и-и-и-и");
    }
    public void makeVoice(String name){
        System.out.println(name);
    }
}
