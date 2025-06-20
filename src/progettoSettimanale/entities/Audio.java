package progettoSettimanale.entities;

import progettoSettimanale.interfaces.Playable;

public class Audio extends MultimediaElement implements Playable {
    private int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    // METHODS

    @Override
    public void turnUp() {
        if (this.volume == 10) {
            System.out.println("The audio volume is at maximum.");
        } else {
            this.volume++;
            System.out.println("You turned the audio volume up. Now it's at " + this.volume);
        }
    }

    @Override
    public void turnDown() {
        if (this.volume == 0) {
            System.out.println("The audio volume is at minimum.");
        } else {
            this.volume--;
            System.out.println("You turned the audio volume down. Now it's at " + this.volume);
        }
    }


    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println("This is an audio called " + this.title + " ! ".repeat(this.volume));

        }
    }

    @Override
    public String toString() {
        return "Audio{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", volume=" + volume +
                '}';
    }
}
