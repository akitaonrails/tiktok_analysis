package com.ss.android.ugc.aweme.feed.model.interest;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NewUserRecommendReasonEntry implements Serializable {

    @C09CT("detail")
    public String detail;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("text")
    public String text;

    public NewUserRecommendReasonEntry() {
    }

    public NewUserRecommendReasonEntry(String str, String str2, String str3) {
        this.recommendReason = str;
        this.detail = str2;
        this.text = str3;
    }
}
