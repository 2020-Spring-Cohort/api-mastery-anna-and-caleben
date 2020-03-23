package org.wcci.apimastery.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Collection<Studio> studios;

    private String name;
    private String releaseDate;
    private String style;

    public Game(){}

    public Game(ArrayList<Studio> studios, String name, String releaseDate, String style) {
        this.studios = studios;
        this.name = name;
        this.releaseDate = releaseDate;
        this.style = style;
    }

    public Long getId() {
        return id;
    }

    public Collection<Studio> getStudios() {
        return studios;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getStyle() {
        return style;
    }
}
