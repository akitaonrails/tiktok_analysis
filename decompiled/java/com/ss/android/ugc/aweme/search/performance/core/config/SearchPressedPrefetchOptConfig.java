package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPressedPrefetchOptConfig {

    @C09CT("enable_ack")
    public final boolean enableAck;

    @C09CT("enable_comment")
    public final boolean enableComment;

    @C09CT("enable_feed_bar")
    public final boolean enableFeedBar;

    @C09CT("enable_hashtag")
    public final boolean enableHashtag;

    @C09CT("enable_normal")
    public final boolean enableNormal;

    @C09CT("enable_other")
    public final boolean enableOther;

    @C09CT("enable_related")
    public final boolean enableRelated;

    @C09CT("reuse_last_pre_request")
    public final boolean enableReuseLastPreRequest;

    @C09CT("enable_sug")
    public final boolean enableSug;

    public SearchPressedPrefetchOptConfig() {
        this(false, false, false, false, false, false, false, true, false);
    }

    public SearchPressedPrefetchOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.enableNormal = z;
        this.enableRelated = z2;
        this.enableSug = z3;
        this.enableHashtag = z4;
        this.enableComment = z5;
        this.enableFeedBar = z6;
        this.enableOther = z7;
        this.enableAck = z8;
        this.enableReuseLastPreRequest = z9;
    }
}
