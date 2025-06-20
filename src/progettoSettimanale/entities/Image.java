package progettoSettimanale.entities;

import progettoSettimanale.interfaces.Brightness;
import progettoSettimanale.interfaces.Show;

public class Image extends MultimediaElement implements Brightness, Show {

    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void increaseBrightness() {
        if (this.brightness == 10) {
            System.out.println("The image brightness is at maximum.");
        } else {
            this.brightness++;
            System.out.println("You have increased the image brightness. Now it's at " + this.brightness);
        }
    }

    @Override
    public void decreaseBrightness() {
        if (this.brightness == 0) {
            System.out.println("The image brightness is at minimum.");
        } else {
            this.brightness--;
            System.out.println("You have decreased the image brightness. Now it's at " + this.brightness);
        }
    }

    @Override
    public void show() {
        System.out.println("This is an image called " + this.title + " * ".repeat(this.brightness));
    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + title + '\'' +
                ", brightness=" + brightness +
                '}';
    }
}
