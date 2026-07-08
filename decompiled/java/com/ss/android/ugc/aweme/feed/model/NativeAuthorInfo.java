package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeAuthorInfo implements Serializable {

    @C09CT("auto_pull_up")
    public int autoPullStyle;

    @C09CT("auto_pull_up_config")
    public final AutoPullUpConfig autoPullUpConfig;

    @C09CT("bottom_banner")
    public BottomBanner bottomBanner;

    public final void setAutoPullStyle(int i) {
        this.autoPullStyle = i;
    }

    public final void setBottomBanner(BottomBanner bottomBanner) {
        this.bottomBanner = bottomBanner;
    }

    public NativeAuthorInfo(BottomBanner bottomBanner, int i, AutoPullUpConfig autoPullUpConfig) {
        this.bottomBanner = bottomBanner;
        this.autoPullStyle = i;
        this.autoPullUpConfig = autoPullUpConfig;
    }
}
