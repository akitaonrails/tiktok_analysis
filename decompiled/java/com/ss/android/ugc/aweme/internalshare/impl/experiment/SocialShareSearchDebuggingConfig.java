package com.ss.android.ugc.aweme.internalshare.impl.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialShareSearchDebuggingConfig {

    @C09CT("config_fetch_fail")
    public final boolean configFetchFail;

    @C09CT("ranking_labels")
    public final boolean rankingLabels;

    public SocialShareSearchDebuggingConfig() {
        this(false, false);
    }

    public SocialShareSearchDebuggingConfig(boolean z, boolean z2) {
        this.rankingLabels = z;
        this.configFetchFail = z2;
    }
}
