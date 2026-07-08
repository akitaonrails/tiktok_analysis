package com.ss.android.ugc.aweme.search.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class VisualSearchFeedVideoViewModel implements Serializable {
    public final Integer feedVideoHeight;
    public final Integer feedVideoMarginStart;
    public final Integer feedVideoMarginTop;
    public final Integer feedVideoWidth;

    public VisualSearchFeedVideoViewModel() {
        this(null, null, null, null);
    }

    public VisualSearchFeedVideoViewModel(Integer num, Integer num2, Integer num3, Integer num4) {
        this.feedVideoWidth = num;
        this.feedVideoHeight = num2;
        this.feedVideoMarginTop = num3;
        this.feedVideoMarginStart = num4;
    }
}
