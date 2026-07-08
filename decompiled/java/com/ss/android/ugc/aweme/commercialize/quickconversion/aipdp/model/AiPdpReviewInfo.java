package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpReviewInfo implements Serializable {
    public static final int $stable = 0;
    public final Double rating;
    public final Integer reviewCount;

    public AiPdpReviewInfo() {
        this(null, null);
    }

    public AiPdpReviewInfo(Double d, Integer num) {
        this.rating = d;
        this.reviewCount = num;
    }
}
