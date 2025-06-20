package progettoSettimanale.entities;

import progettoSettimanale.interfaces.Brightness;
import progettoSettimanale.interfaces.Playable;

public class Video extends MultimediaElement implements Playable, Brightness {

    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println("This is a video called " + this.title + " ! ".repeat(this.volume) + " * ".repeat(this.brightness));

        }
    }

    @Override
    public void turnUp() {
        if (this.volume == 10) {
            System.out.println("The video volume is at maximum.");
        } else {
            this.volume++;
            System.out.println("You turned the video volume up. Now it's at " + this.volume);
        }
    }

    @Override
    public void turnDown() {
        if (this.volume == 0) {
            System.out.println("The video volume is at minimum.");
        } else {
            this.volume--;
            System.out.println("You turned the video volume down. Now it's at " + this.volume);
        }
    }

    @Override
    public void increaseBrightness() {
        if (this.brightness == 10) {
            System.out.println("The video brightness is at maximum.");
        } else {
            this.brightness++;
            System.out.println("You have increased the video brightness. Now it's at " + this.brightness);
        }
    }

    @Override
    public void decreaseBrightness() {
        if (this.brightness == 0) {
            System.out.println("The video brightness is at minimum.");
        } else {
            this.brightness--;
            System.out.println("You have decreased the video brightness. Now it's at " + this.brightness);
        }
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                '}';
    }
}
