package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class TCMInfo implements Serializable {

    @C09CT("review_status")
    public int reviewStatus;

    public final int getReviewStatus() {
        return this.reviewStatus;
    }

    public final void setReviewStatus(int i) {
        this.reviewStatus = i;
    }
}
