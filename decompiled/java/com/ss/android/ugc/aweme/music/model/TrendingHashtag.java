package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class TrendingHashtag implements Serializable {

    @C09CT("hashtag_id")
    public final String hashtagId;

    @C09CT("hashtag_name")
    public final String hashtagName;

    @C09CT("hashtag_views")
    public final Long hashtagViews;

    @C09CT("is_hot_trending_hashtag")
    public final Boolean isHotTrendingHashtag;

    public TrendingHashtag() {
        this(null, null, null, null);
    }

    public final Boolean isHotTrendingHashtag() {
        return this.isHotTrendingHashtag;
    }

    public TrendingHashtag(Boolean bool, String str, String str2, Long l) {
        this.isHotTrendingHashtag = bool;
        this.hashtagName = str;
        this.hashtagId = str2;
        this.hashtagViews = l;
    }
}
