package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models;

import java.io.Serializable;
import java.util.List;

public class Chapter implements Serializable {

    private String title;
    private List<Poet> poetList;
    private int albumResource;

    public Chapter(String title, List<Poet> poetList, int albumResource) {
        this.title = title;
        this.poetList = poetList;
        this.albumResource = albumResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Poet> getPoetList() {
        return poetList;
    }

    public void setPoetList(List<Poet> poetList) {
        this.poetList = poetList;
    }

    public int getAlbumResource() {
        return albumResource;
    }

    public void setAlbumResource(int albumResource) {
        this.albumResource = albumResource;
    }
}
