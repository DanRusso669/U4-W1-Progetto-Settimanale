package progettoSettimanale;

import progettoSettimanale.entities.Audio;
import progettoSettimanale.entities.Image;
import progettoSettimanale.entities.MultimediaElement;
import progettoSettimanale.entities.Video;
import progettoSettimanale.enums.ElementType;

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

        ElementType element;

        boolean isError = false;

        for (int i = 0; i < list.length; i++) {

            System.out.println("Enter AUDIO, VIDEO or IMAGE.");
            String type = scanner.nextLine().toUpperCase();

            if (!type.equals("AUDIO") && !type.equals("VIDEO") && !type.equals("IMAGE")) {
                System.out.println("Invalid input, restart the program.");
                isError = true;
                break;
            } else {

                element = ElementType.valueOf(type);
            }


            // https://www.geeksforgeeks.org/java/java-string-valueof/


            switch (element) {
                case AUDIO: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("Title can't be empty. It will be set to 'Random Title' by default.");
                        title = "Random Title";
                    }
                    System.out.println("Enter duration: ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    if (duration > 10) {
                        System.out.println("The maximum duration is 10.");
                        duration = 10;
                    } else if (duration <= 0) {
                        System.out.println("Duration can't be lower than 1. Set by default to 1.");
                        duration = 1;
                    }
                    System.out.println("Enter volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    if (volume > 10) {
                        System.out.println("The maximum volume is 10 and will be set by default to 5.");
                        volume = 5;
                    } else if (volume < 0) {
                        System.out.println("Volume can't be lower than 0 and will be set by default to 5.");
                        volume = 5;
                    }
                    Audio audio = new Audio(title, duration, volume);
                    list[i] = audio;
                    System.out.println("--------------------------------------");
                }
                break;
                case VIDEO: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("Title can't be empty. It will be set to TITLE by default.");
                        title = "Random Title";
                    }
                    System.out.println("Enter duration: ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    if (duration > 10) {
                        System.out.println("The maximum duration is 10 and will be set by default.");
                        duration = 10;
                    } else if (duration <= 0) {
                        System.out.println("Duration can't be lower than 1. Rerun the program.");
                        isError = true;
                        break;
                    }
                    System.out.println("Enter volume: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    if (volume > 10) {
                        System.out.println("The maximum volume is 10 and will be set by default to 5.");
                        volume = 5;
                    } else if (volume < 0) {
                        System.out.println("Volume can't be lower than 0 and will be set by default to 5.");
                        volume = 5;
                    }
                    System.out.println("Enter brightness: ");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    if (brightness > 10) {
                        System.out.println("The maximum brightness is 10 and will be set by default to 5.");
                        brightness = 5;
                    } else if (brightness < 0) {
                        System.out.println("Brightness can't be lower than 0 and will be set by default to 5.");
                        brightness = 5;
                    }
                    Video video = new Video(title, duration, volume, brightness);
                    list[i] = video;
                    System.out.println("--------------------------------------");
                }
                break;
                case IMAGE: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("Title can't be empty. It will be set to TITLE by default.");
                        title = "Random Title";
                    }
                    System.out.println("Enter brightness: ");
                    int brightness = Integer.parseInt(scanner.nextLine());
                    if (brightness > 10) {
                        System.out.println("The maximum brightness is 10 and will be set by default to 5.");
                        brightness = 5;
                    } else if (brightness < 0) {
                        System.out.println("Brightness can't be lower than 0 and will be set by default to 5.");
                        brightness = 5;
                    }
                    Image image = new Image(title, brightness);
                    list[i] = image;
                    System.out.println("--------------------------------------");
                }
                break;
                default: {
                    System.out.println("Invalid type. Restarting...");
                }
            }
            if (isError) break;

        }

        // System.out.println(Arrays.toString(list));

        if (!isError) {

            while (true) {
                System.out.println("Enter 1 - 5 to run the elements. Enter 0 to exit.");
                int enter = Integer.parseInt(scanner.nextLine());

                if (enter == 0) {
                    break;
                }

                if (enter < 0 || enter > 5) {
                    System.out.println("Invalid input.");
                    continue;
                }

                if (list[enter - 1] instanceof Audio) {
                    ((Audio) list[enter - 1]).play(); // <---- intelliJ me lo mette automaticamente così quando scrivo --> list[enter].play()
                } else if (list[enter - 1] instanceof Video) {
                    ((Video) list[enter - 1]).play(); // <---- intelliJ me lo mette automaticamente così quando scrivo --> list[enter].play()
                } else if (list[enter - 1] instanceof Image) {
                    ((Image) list[enter - 1]).show();
                }

            }
        }


    }


}

