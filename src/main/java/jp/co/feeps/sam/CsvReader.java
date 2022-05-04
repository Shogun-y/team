package jp.co.feeps.sam;
import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/shogun/Desktop/プログラミング/spring/spring-practice/src/main/java/jp/co/feeps/sam/sample.csv");
        try {
        	System.out.println("通ってる");
            // CSVファイルの読み込み
            List<String> lines = Files.readAllLines(path);
            System.out.println("通ってる２");
            for (int i = 1; i < lines.size(); i++) {
                String[] data = lines.get(i).split(",");
                if (data.length > 3) {
                    // 読み込んだCSVファイルの内容を出力
                    System.out.print(data[0] + ",");
                    System.out.print(data[1] + ",");
                    System.out.print(data[2] + ",");
                    System.out.println(data[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗");
        }
    }
}
