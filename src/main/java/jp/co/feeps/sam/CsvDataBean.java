package jp.co.feeps.sam;

/**
 * CSVファイルの内容を格納するBeanクラス
 */
public class CsvDataBean {
    /**
     * コンストラクタ
     * @param no No
     * @param name 名前
     * @param age 年齢
     * @param address 住所
     */
    public CsvDataBean(String no, String name, String age, String address) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * No
     */
    private String no;
    /**
     * 名前
     */
    private String name;
    /**
     * 年齢
     */
    private String age;
    /**
     * 住所
     */
    private String address;
    /**
     * Noの取得
     * @return No
     */
    public String getNo() {
        return no;
    }
    /**
     * Noの設定
     * @param no No
     */
    public void setNo(String no) {
        this.no = no;
    }
    /**
     * 名前の取得
     * @return 名前
     */
    public String getName() {
        return name;
    }
    /**
     * 名前の設定
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 年齢の取得
     * @return 年齢
     */
    public String getAge() {
        return age;
    }
    /**
     * 年齢の設定
     * @param age 年齢
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * 住所の取得
     * @return 住所
     */
    public String getAddress() {
        return address;
    }
    /**
     * 住所の設定
     * @param address 住所
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
