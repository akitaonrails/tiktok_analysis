package com.ss.android.ugc.aweme.topic.movie.anchors;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieAnchorContent {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("category")
    public final String category;

    @C09CT("movie_cover_uri")
    public final String cover;

    @C09CT("third_id")
    public final String id;

    @C09CT("imdb_rating")
    public final Double imdbRating;

    @C09CT("title")
    public final String title;

    @C09CT("year")
    public final Integer year;

    public MovieAnchorContent(String str, String str2, Integer num, Double d, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.year = num;
        this.imdbRating = d;
        this.cover = str3;
        this.category = str4;
    }
}
