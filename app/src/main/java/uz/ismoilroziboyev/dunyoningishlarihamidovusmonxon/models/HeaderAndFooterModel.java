package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models;

import java.io.Serializable;

public class HeaderAndFooterModel implements Serializable {
    private String name;
    private String type;
    private String text;

    public HeaderAndFooterModel(String name, String type, String text) {
        this.name = name;
        this.type = type;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
