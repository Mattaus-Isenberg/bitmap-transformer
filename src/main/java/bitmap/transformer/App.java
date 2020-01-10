/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IOException {

       // Bitmap bitStruc = new Bitmap("/Users/Mattaus/codefellows/401/bitmap-transformer/src/main/resources/mario.bmp");
        Bitmap bitStruc = new Bitmap(args[0]);
        bitStruc.mirror();
        switch (args[2].toLowerCase()) {
            case ("greyscale") : bitStruc.greyScale();
                break;
            case ("negative") : bitStruc.negative();
                break;
            case ("mirror") : bitStruc.mirror();
                break;
            case ("randomize") : bitStruc.randomize();
        }
        //bitStruc.writeBitmap("/Users/Mattaus/codefellows/401/test.bmp");
        bitStruc.writeBitmap(args[1]);

        }
}
