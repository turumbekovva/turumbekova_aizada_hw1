public final class Dolphin extends Animals{
    private  String commands ;

    public Dolphin(String zooName, int age, Color color, Habitat habitat, String commands) {
        super(zooName, age, color, habitat);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    @Override
    public void makeVoice(String name) {
        super.makeVoice(name);
    }
}
