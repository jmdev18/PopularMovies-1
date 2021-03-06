package net.javango.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Movie implements Parcelable {

    private int id;
    private String title;
    private String posterPath;
    private String synopsis;
    private double rating;
    private Date releaseDate;
    private String backdropPath;
    private int voteCount;
    private double popularity;

    public Movie() {
        // noargs
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(getPosterPath());
        dest.writeString(synopsis);
        dest.writeDouble(rating);
        dest.writeLong(releaseDate.getTime());
        dest.writeString(backdropPath);
        dest.writeInt(voteCount);
        dest.writeDouble(popularity);
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    private Movie(Parcel in) {
        id = in.readInt();
        title = in.readString();
        posterPath = in.readString();
        synopsis = in.readString();
        rating = in.readDouble();
        releaseDate = new Date(in.readLong());
        backdropPath = in.readString();
        voteCount = in.readInt();
        popularity = in.readDouble();
    }

}
