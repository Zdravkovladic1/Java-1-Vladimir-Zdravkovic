package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {

        Television myTelevision = new Television(4, 3, true);
        myTelevision.showData();
        
        
        Radio myRadio = new Radio(94.9, 640, 'F');
        myRadio.showData();
    }

}
