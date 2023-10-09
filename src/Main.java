public class Main {
    public static void main(String[] args) {
      Habitat habitat = new Habitat("China");
      Animals animals = new Animals("LuckyAnimals",3,Color.BLACK,habitat);
      System.out.println("zooName:"+animals.getZooName()+ "age: " + animals.getAge() + " color: "+ animals.getColor()+ " habitat: "+ habitat.getName());
      animals.makeVoice();
      animals.makeVoice("aaaaaaaaaaa");

        Habitat habitat1 = new Habitat("America");
        Dolphin dolphin = new Dolphin("Emil",2,Color.PINK,habitat1,"прыгнуть через обруч");
      System.out.println("zooName: "+ dolphin.getZooName()+ " age:" + dolphin.getAge() + " color " + dolphin.getColor()+ " habitat1: "+ habitat1.getName()+" commands"+ dolphin.getCommands());
        dolphin.makeVoice();
        dolphin.makeVoice("иииииииииии");

        Habitat habitat2 = new Habitat("Tailand");
        Dolphin dolphin2 = new Dolphin("Bekbolot ", 1,Color.PURPLE,habitat2," нырять на большие глубины");
      System.out.println("zooName: " + dolphin2.getZooName() + " age: " + dolphin2.getAge()+" color:"+ dolphin2.getColor()+" habitat2 "+ habitat2.getName()+"commands"+ dolphin2.getCommands());
        dolphin2.makeVoice();
        dolphin2.makeVoice("чирк-чирк-чирк");



    }
}