package starter.Utils;

import java.io.File;

public class PathDownloadFileUtils {
    public static String getProjectDirectory() {
        return System.getProperty("user.dir");
    }

    //Se agrega ruta obteniendo el user del dispositivo para que sea funcional
    public static String getDownloadDirectory() {
        return getProjectDirectory() + File.separator + "src\\main\\java\\starter\\Utils";
    }

    public static void main(String[] args) {
        System.out.println("Directorio del proyecto: " + getProjectDirectory());
        System.out.println("Directorio de descarga: " + getDownloadDirectory());
    }
}

