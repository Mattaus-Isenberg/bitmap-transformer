//Mattäus Isenberg 2018 IO Test Bitmap

package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.FileSystems;


public class Bitmap {
    BufferedImage image;
    int height;
    int width;


    public Bitmap(String sourceFile) throws IOException {
        this.image = ImageIO.read(FileSystems.getDefault().getPath(sourceFile).toFile());
        this.height = this.image.getHeight();
        this.width = this.image.getWidth();
    }

    public void writeBitmap (String destination) throws IOException {
        ImageIO.write(this.image, "bmp", FileSystems.getDefault().getPath(destination).toFile());
    }

    public void greyScale() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int greyColor = (color.getRed() + color.getGreen() + color.getBlue() / 3;
                int newRGB = new Color(greyColor, greyColor, greyColor).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void negative() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int red = 255 - color.getRed();
                int green = 255 - color.getGreen();
                int blue = 255 - color.getBlue();
                int newRGB = new Color(red, green, blue).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void rotateColors() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int newRGB = new Color(color.getRed(), color.getGreen(), color.getBlue()).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }
}
