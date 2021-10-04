import java.io.*;

public class Counter {
    private static int fileCounter = 0;

    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            throw new IllegalArgumentException("Please specify a path! (e.g. \".\")");

        File argsFile = new File(args[0]);

        long allLines = (argsFile.isFile()) ? countSingleFile(argsFile) : countFolder(argsFile);
        System.out.println();
        System.out.println("All files (" + fileCounter + "): " + allLines + " lines");
    }

    private static long countFolder(File folder) throws IOException {
        long linesPerFolder = 0;

        File[] filesInFolder = folder.listFiles();

        if (filesInFolder == null)
            return 0;

        for (File file : filesInFolder) {
            if (file.isFile()) {
                long linesPerFile = countSingleFile(file);
                System.out.println(file.getName() + ": " + linesPerFile + " lines");
                linesPerFolder += linesPerFile;
                continue;
            }

            linesPerFolder += countFolder(file);
        }

        return linesPerFolder;
    }

    private static long countSingleFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        long lines = 0;

        while (reader.readLine() != null)
            lines++;

        reader.close();

        fileCounter++;
        return lines;
    }
}
