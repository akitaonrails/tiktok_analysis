package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTECContentTag implements Serializable {

    @C09CT("recommendation_tag_consumer_str")
    public String recommendationTagConsumerStr;

    @C09CT("recommendation_tag_creator_str")
    public String recommendationTagCreatorStr;

    public TTECContentTag() {
        this(null, null);
    }

    public TTECContentTag(String str, String str2) {
        this.recommendationTagConsumerStr = str;
        this.recommendationTagCreatorStr = str2;
    }
}
