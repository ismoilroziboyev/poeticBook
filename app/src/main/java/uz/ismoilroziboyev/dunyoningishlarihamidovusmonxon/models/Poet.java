package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models;

import java.io.Serializable;
import java.util.Objects;

public class Poet implements Serializable {
    private String name;
    private String poetText;
    private boolean isLiked;
    private int imageResource;
    private String chapter;


    public Poet(String name, String poetText, boolean isLiked, int imageResource, String chapter) {
        this.name = name;
        this.poetText = poetText;
        this.isLiked = isLiked;
        this.imageResource = imageResource;
        this.chapter = chapter;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoetText() {
        return poetText;
    }

    public void setPoetText(String poetText) {
        this.poetText = poetText;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    @Override
    public String toString() {
        return "Poet{" +
                "name='" + name + '\'' +
                ", chapter='" + chapter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poet poet = (Poet) o;
        return Objects.equals(poetText, poet.poetText) &&
                Objects.equals(chapter, poet.chapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poetText, chapter);
    }
}
