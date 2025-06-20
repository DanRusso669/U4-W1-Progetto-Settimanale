package progettoSettimanale;

import progettoSettimanale.entities.Audio;
import progettoSettimanale.entities.Image;
import progettoSettimanale.entities.MultimediaElement;
import progettoSettimanale.entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Audio mountain = new Audio("mountain", 2, 3);
        Audio hill = new Audio("hill", 1, 10);
        Video cruise = new Video("cruise", 2, 3, 4);
        Image family = new Image("family", 8);

       /* mountain.play();
        mountain.turnUp();
        mountain.play();
        mountain.turnDown();
        mountain.play();

        hill.play();
        hill.turnUp();
        hill.turnDown();
        hill.turnDown();
        hill.play(); */

        /* cruise.play();
        cruise.decreaseBrightness();
        cruise.increaseBrightness();
        cruise.turnDown();
        cruise.play();
        cruise.turnUp(); */

        /* family.show();
        family.increaseBrightness();
        family.increaseBrightness();
        family.increaseBrightness(); */

        System.out.println("You'll now add 5 multimedia elements to a list.");

        MultimediaElement[] list = new MultimediaElement[5];

        for (int i = 0; i < list.length; i++) {

            System.out.println("Enter AUDIO, VIDEO or IMAGE.");
            ElementType element = ElementType.valueOf(scanner.nextLine());

            switch (element) {
                case AUDIO: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter duration: ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    Audio audio = new Audio(title, duration, volume);
                    list[i] = audio;
                }
                break;
                case VIDEO: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter duration: ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter brightness: ");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    Video video = new Video(title, duration, volume, brightness);
                    list[i] = video;
                }
                break;
                case IMAGE: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter brightness: ");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    Image image = new Image(title, brightness);
                    list[i] = image;
                }
                break;
                default: {
                    System.out.println("Invalid type. Restarting...");
                }
            }
        }

        System.out.println(Arrays.toString(list));

        while (true) {
            System.out.println("Enter 1 - 5 to run the elements. Enter 0 to exit.");
            int enter = Integer.parseInt(scanner.nextLine());

            if (list[enter] instanceof Audio) {
                ((Audio) list[enter]).play(); // <---- intelliJ me lo mette automaticamente così quando scrivo --> list[enter].play()
            } else if (list[enter] instanceof Video) {
                ((Video) list[enter]).play(); // <---- intelliJ me lo mette automaticamente così quando scrivo --> list[enter].play()
            }

        }
    }


}

