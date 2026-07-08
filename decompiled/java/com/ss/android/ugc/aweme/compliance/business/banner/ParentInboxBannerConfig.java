package com.ss.android.ugc.aweme.compliance.business.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ParentInboxBannerConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("action_string")
    public final String actionString;

    @C09CT("action_url")
    public final String actionUrl;

    @C09CT("content")
    public final String content;

    @C09CT("show_status")
    public boolean showStatus;

    public ParentInboxBannerConfig() {
        this(false, "", "", "");
    }

    public final void setShowStatus(boolean z) {
        this.showStatus = z;
    }

    public ParentInboxBannerConfig(boolean z, String str, String str2, String str3) {
        this.showStatus = z;
        this.content = str;
        this.actionString = str2;
        this.actionUrl = str3;
    }
}
