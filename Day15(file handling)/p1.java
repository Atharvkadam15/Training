import java.io.File;
public class p1 {
    public static void main(String[] args) {




                File file = new File("test.txt");

                System.out.println(file.exists());
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
            }
        }


