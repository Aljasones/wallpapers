import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the room in meters");
        double length = scanner.nextDouble();
        System.out.println("The length of your room is " + length + " meters");

        System.out.println("Enter the width of the room in meters");
        double width = scanner.nextDouble();
        System.out.println("The width of your room is " + width + " meters");

        System.out.println("Enter the height of the room in meters");
        double height = scanner.nextDouble();
        System.out.println("The height of the room is " + height + " meters");

        System.out.println("Enter the wallpaper width of the room in meters");
        double wallpaperWidth = scanner.nextDouble();
        System.out.println("The wallpaper width is " + wallpaperWidth + " meters");

        System.out.println("Enter the wallpaper length of the room in meters");
        double wallpaperLength = scanner.nextDouble();
        System.out.println("The wallpaper length is " + wallpaperLength + " meters");

        double perimeter = (length + width) * 2;
        double stripsOfWallpaper = perimeter / wallpaperWidth; //number of strips of wallpaper
        int roundedStripsOfWallpaper = (int)Math.ceil(stripsOfWallpaper); //rounded value up

        double HeightReserve = 0.1; //room height reserve
        int numberOfStrips = (int) (wallpaperLength / (height + HeightReserve)); //number of whole strips in roll

        int result = roundedStripsOfWallpaper / numberOfStrips;
        System.out.println("You will need is " + result + " wallpaper rolls");
        scanner.close();




    }
}
