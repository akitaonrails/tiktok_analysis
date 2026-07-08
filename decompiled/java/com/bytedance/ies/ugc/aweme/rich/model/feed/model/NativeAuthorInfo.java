package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeAuthorInfo implements Serializable {

    @C09CT("auto_pull_up")
    public int autoPullStyle;

    @C09CT("bottom_banner")
    public BottomBanner bottomBanner;

    public NativeAuthorInfo() {
        this(null, 0);
    }

    public final void setAutoPullStyle(int i) {
        this.autoPullStyle = i;
    }

    public final void setBottomBanner(BottomBanner bottomBanner) {
        this.bottomBanner = bottomBanner;
    }

    public NativeAuthorInfo(BottomBanner bottomBanner, int i) {
        this.bottomBanner = bottomBanner;
        this.autoPullStyle = i;
    }
}
