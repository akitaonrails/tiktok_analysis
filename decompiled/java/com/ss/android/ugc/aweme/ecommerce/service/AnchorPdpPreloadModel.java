package com.ss.android.ugc.aweme.ecommerce.service;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPdpPreloadModel {

    @C09CT("duration")
    public final Integer duration;

    @C09CT("enable")
    public final int enable;

    public AnchorPdpPreloadModel() {
        this(0, null);
    }

    public AnchorPdpPreloadModel(int i, Integer num) {
        this.enable = i;
        this.duration = num;
    }
}
