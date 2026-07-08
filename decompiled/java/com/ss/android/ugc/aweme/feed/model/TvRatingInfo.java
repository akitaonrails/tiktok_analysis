package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TvRatingInfo implements Serializable {

    @C09CT("rating")
    public String tvRating;

    @C09CT("description")
    public String tvRatingDescription;

    public final String getTvRating() {
        return this.tvRating;
    }

    public final String getTvRatingDescription() {
        return this.tvRatingDescription;
    }
}
