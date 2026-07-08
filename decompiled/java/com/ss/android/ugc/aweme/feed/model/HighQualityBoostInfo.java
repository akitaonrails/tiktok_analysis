package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class HighQualityBoostInfo implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("is_high_quality_post")
    public final Boolean isHighQualityPost;

    @C09CT("link")
    public final String link;

    public HighQualityBoostInfo() {
        this(null, null, Boolean.FALSE);
    }

    public final Boolean isHighQualityPost() {
        return this.isHighQualityPost;
    }

    public HighQualityBoostInfo(String str, String str2, Boolean bool) {
        this.description = str;
        this.link = str2;
        this.isHighQualityPost = bool;
    }
}
