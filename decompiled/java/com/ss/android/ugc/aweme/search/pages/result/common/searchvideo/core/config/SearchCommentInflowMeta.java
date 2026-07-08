package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class SearchCommentInflowMeta {

    @C09CT("before_show_latency")
    public final int beforeShowLatencySecond;

    @C09CT("show_duration")
    public final int showDurationSecond;

    public SearchCommentInflowMeta() {
        this(3, 6);
    }

    public SearchCommentInflowMeta(int i, int i2) {
        this.beforeShowLatencySecond = i;
        this.showDurationSecond = i2;
    }
}
