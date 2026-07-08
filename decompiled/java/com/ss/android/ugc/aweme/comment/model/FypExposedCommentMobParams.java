package com.ss.android.ugc.aweme.comment.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class FypExposedCommentMobParams implements Serializable {
    public final String fypCommentId;
    public Integer isFypShow;
    public final String showCmtInterMetricType;
    public final Long showCmtInterMetricValue;

    public FypExposedCommentMobParams() {
        this(null, null, null, null);
    }

    public final Integer isFypShow() {
        return this.isFypShow;
    }

    public final void setFypShow(Integer num) {
        this.isFypShow = num;
    }

    public FypExposedCommentMobParams(Integer num, String str, String str2, Long l) {
        this.isFypShow = num;
        this.fypCommentId = str;
        this.showCmtInterMetricType = str2;
        this.showCmtInterMetricValue = l;
    }
}
