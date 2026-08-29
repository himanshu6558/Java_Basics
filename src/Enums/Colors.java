package Enums;

public enum Colors {
    Red("abc"), Black("xyz"),White("mno");

    private String code;

    Colors(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
