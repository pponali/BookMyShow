package models;

public enum Language {
    ENGLISH("English"),
    HINDI("Hindi"),
    TAMIL("Tamil"),
    TELUGU("Telugu"),
    KANNADA("Kannada"),
    MALAYALAM("Malayalam");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
