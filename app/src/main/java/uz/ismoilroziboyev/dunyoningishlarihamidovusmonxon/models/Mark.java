package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Mark implements Serializable {
    private Poet poet;
    private Chapter chapter;
    private int scrollPosition;
    private Date date;

    public Mark(Poet poet, Chapter chapter, int scrollPosition, Date date) {
        this.poet = poet;
        this.chapter = chapter;
        this.scrollPosition = scrollPosition;
        this.date = date;
    }

    public Poet getPoet() {
        return poet;
    }

    public void setPoet(Poet poet) {
        this.poet = poet;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public int getScrollPosition() {
        return scrollPosition;
    }

    public void setScrollPosition(int scrollPosition) {
        this.scrollPosition = scrollPosition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return Objects.equals(poet, mark.poet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poet);
    }
}
