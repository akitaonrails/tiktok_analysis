package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class IMTypingRecommendationImageInfo implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public IMTypingRecommendationImageInfo() {
        this(null, null, null, null);
    }

    public IMTypingRecommendationImageInfo(String str, Integer num, Integer num2, String str2) {
        this.url = str;
        this.width = num;
        this.height = num2;
        this.type = str2;
    }
}
