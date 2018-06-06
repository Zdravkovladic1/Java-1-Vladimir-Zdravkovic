package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;
    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void showData() {

        System.out.println("Volume: " + getVolume());
        System.out.println("Current program: " + getCurrentProgram());
        System.out.println("Did television is On or Off: " + isTurnOn());
        System.out.println();
    }

}
