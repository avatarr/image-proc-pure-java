/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package image2d;

public class RGB {

    // shift bit red color
    public static int red(int pixels) {
        int r = 0;
        r = (pixels >> 16) & 0xff;
        return r;
    }
    // shift bit green color

    public static int green(int pixels) {
        int r = 0;
        r = (pixels >> 16) & 0xff;
        return r;
    }
    // shift bit blue color

    public static int blue(int pixels) {
        int r = 0;
        r = (pixels >> 16) & 0xff;
        return r;
    }
    // return bit RGB 
}
