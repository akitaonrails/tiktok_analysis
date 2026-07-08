package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SamsungAppSellPoint implements Serializable {

    @C09CT("app_size")
    public final String appSize;

    @C09CT("number_of_reviews")
    public final String numberOfReviews;

    @C09CT("rating")
    public final String rating;

    public SamsungAppSellPoint() {
        this(null, null, null);
    }

    public SamsungAppSellPoint(String str, String str2, String str3) {
        this.appSize = str;
        this.rating = str2;
        this.numberOfReviews = str3;
    }
}
