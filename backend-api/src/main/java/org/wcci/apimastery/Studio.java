package org.wcci.apimastery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Studio {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Collection<Game> games;
    private String name;
    private String headquarteredIn;
    private String description;
    private String websiteUrl;

    public Studio(){}

    public Studio(ArrayList<Game> games, String name, String headquarteredIn, String description, String websiteUrl) {
        this.games = games;
        this.name = name;
        this.headquarteredIn = headquarteredIn;
        this.description = description;
        this.websiteUrl = websiteUrl;
    }

    public Long getId() {
        return id;
    }

    public Collection<Game> getGames() {
        return games;
    }

    public String getName() {
        return name;
    }

    public String getHeadquarteredIn() {
        return headquarteredIn;
    }

    public String getDescription() {
        return description;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
}
