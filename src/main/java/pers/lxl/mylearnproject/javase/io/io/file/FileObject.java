package pers.lxl.mylearnproject.javase.io.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/**磁盘操作**/
public class FileObject {
    public static void main(String[] args) throws IOException {
//        即使传入的文件或目录不存在，代码也不会出错，因为构造一个File对象，并不会导致任何磁盘操作,调用方法时才会磁盘操作
        //绝对路径是以根目录开头的完整路径Java字符串中以//代表/
//        File表示文件或目录
        //\u202A系统复制产生
        File file = new File("C:\\Users\\Administrator\\Desktop\\lixianglun\\fileTest.txt");
        //相对路径（可以用.表示当前目录，..表示上级目录）绝对路径去掉当前目录
        File afile = new File("..\\fileTest.txt");
        File catalog=new File("C:\\Users\\Administrator\\Desktop");
        System.out.println(file);
        //返回构造方法传入的路径
        System.out.println(file.getPath());
        //返回绝对路径
        System.out.println(file.getAbsolutePath());
        //返回的是规范路径。
        System.out.println(afile.getCanonicalPath());
        //根据当前平台打印"\"或"/"
        System.out.println(File.separator);
        System.out.println(file.isFile());
        //判断当前文件，目录是否存在
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(afile.length());
        //add、delete
//        if (file.createNewFile()) {
//            // 文件创建成功:
//            // TOD O:TODO提交代码会提醒
//            if (file.delete()) {
//                // 删除文件成功:
//            }
//        }
//        递归列出目录下的所有文件
//        public static void listAllFiles(File dir) {
//    if (dir == null || !dir.exists()) {
//        return;
//    }
//    if (dir.isFile()) {
//        System.out.println(dir.getName());
//        return;
//    }
//    for (File file : dir.listFiles()) {
//        listAllFiles(file);
//    }
//}
//有些时候，程序需要读写一些临时文件，File对象提供了createTempFile()来创建一个临时文件，以及deleteOnExit()在JVM退出时自动删除该文件。
        System.out.println(catalog.list());
        //目录下的文件和子目录名
        System.out.println(catalog.listFiles());
        //listFiles()提供了一系列重载方法，可以过滤不想要的文件和目录
        // 仅列出.exe文件
        File[] fs2 = catalog.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe"); // 返回true表示接受该文件
            }
        });
        printFiles(fs2);
    }
    /**boolean mkdir()：创建当前File对象表示的目录；
    //boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
    //boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。*/
        static void printFiles(File[] files) {
            System.out.println("==========");
            if (files != null) {
                for (File f : files) {
                    System.out.println(f);
                }
            }
            System.out.println("==========");
            // 构造一个Path对象
            Path p1 = Paths.get(".", "project", "study");
            System.out.println(p1);
            // 转换为绝对路径
            Path p2 = p1.toAbsolutePath();
            System.out.println(p2);
            // 转换为规范路径
            Path p3 = p2.normalize();
            System.out.println(p3);
            // 转换为File对象
            File f = p3.toFile();
            System.out.println(f);
            // 可以直接遍历Path
            for (Path p : Paths.get("src/main").toAbsolutePath()) {
                System.out.println("  " + p);
            }
    }
}

