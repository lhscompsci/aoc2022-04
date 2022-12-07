import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws Throwable {

        partOne();
        partTwo();

    }

    private static void partTwo() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));



        long totalScore = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            Scanner splitter = new Scanner(next);
            splitter.useDelimiter(",");
            String elf1 = splitter.next();
            String elf2 = splitter.next();
            splitter = new Scanner(elf1);
            splitter.useDelimiter("-");
            int elf1start = splitter.nextInt();
            int elf1end = splitter.nextInt();
            splitter = new Scanner(elf2);
            splitter.useDelimiter("-");
            int elf2start = splitter.nextInt();
            int elf2end = splitter.nextInt();
            if((elf1start <= elf2start && elf1end >= elf2end) ||
                    (elf2start <= elf1start && elf2end >= elf1end) ||
                    ((elf1start <= elf2start && elf2start <= elf1end) && elf2start <= elf1end && elf1end <= elf2end) ||
                    ((elf2start <= elf1start && elf1start <= elf2end) && elf1start <= elf2end && elf2end <= elf1end) )
                totalScore += 1;



        }

        out.println(totalScore);
    }

    private static void partOne() throws Throwable {
        Scanner infile = new Scanner(new File("test.dat"));

        long totalScore = 0L;
        while(infile.hasNext()){
            String next = infile.nextLine();
            Scanner splitter = new Scanner(next);
            splitter.useDelimiter(",");
            String elf1 = splitter.next();
            String elf2 = splitter.next();
            splitter = new Scanner(elf1);
            splitter.useDelimiter("-");
            int elf1start = splitter.nextInt();
            int elf1end = splitter.nextInt();
            splitter = new Scanner(elf2);
            splitter.useDelimiter("-");
            int elf2start = splitter.nextInt();
            int elf2end = splitter.nextInt();
            if((elf1start <= elf2start && elf1end >= elf2end) || (elf2start <= elf1start && elf2end >= elf1end))
                totalScore += 1;


        }

        out.println(totalScore);

    }
}
