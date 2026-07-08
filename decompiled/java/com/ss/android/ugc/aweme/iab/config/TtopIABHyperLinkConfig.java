package com.ss.android.ugc.aweme.iab.config;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopIABHyperLinkConfig {

    @C09CT("router")
    public final Router router;

    @C09CT("skip_review")
    public final SkipReview skipReview;

    @C09CT("system_browser")
    public final SystemBrowser systemBrowser;

    public TtopIABHyperLinkConfig() {
        this(null, null, null);
    }

    public TtopIABHyperLinkConfig(Router router, SystemBrowser systemBrowser, SkipReview skipReview) {
        this.router = router;
        this.systemBrowser = systemBrowser;
        this.skipReview = skipReview;
    }
}
