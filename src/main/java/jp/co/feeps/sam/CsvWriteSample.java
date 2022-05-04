package jp.co.feeps.sam;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CsvWriteSample {
    /*** 文字コード */
    private static final String CSV_CHARSET = "Shift-JIS";
    /*** 改行コード */
    private static final String LINE_FEED_CODE = "\r\n";
    /*** 区切り文字（カンマ） */
    private static final String DELIMITER_COMMA = ",";

    public static void main(String[] args) {
        // CSVファイルに書き込みするためのデータ作成
        List<CsvDataBean> list = new ArrayList<CsvDataBean>();
        list.add(new CsvDataBean("1","山田一郎","30","東京都渋谷区"));
        list.add(new CsvDataBean("2","佐藤二郎","25","大阪府大阪市"));
        list.add(new CsvDataBean("3","鈴木三郎","22","神奈川県横浜市"));

        // CSVファイル作成
        CsvWriteSample csvWriteSample = new CsvWriteSample();
        csvWriteSample.writeCsv("/Users/shogun/Desktop/test.csv", list);
    }

    private void writeCsv(String file, List<CsvDataBean> list) {

        try (PrintWriter pw = new PrintWriter(file, Charset.forName(CSV_CHARSET))) {
            // ヘッダ情報
            pw.print("No");
            pw.print(DELIMITER_COMMA);
            pw.print("名前");
            pw.print(DELIMITER_COMMA);
            pw.print("年齢");
            pw.print(DELIMITER_COMMA);
            pw.print("住所");
            pw.print(LINE_FEED_CODE);

            for(CsvDataBean bean : list) {
                pw.print(bean.getNo());
                pw.print(DELIMITER_COMMA);
                pw.print(bean.getName());
                pw.print(DELIMITER_COMMA);
                pw.print(bean.getAge());
                pw.print(DELIMITER_COMMA);
                pw.print(bean.getAddress());
                pw.print(LINE_FEED_CODE);
            }

            System.out.println("CSVファイル書き込み完了");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

