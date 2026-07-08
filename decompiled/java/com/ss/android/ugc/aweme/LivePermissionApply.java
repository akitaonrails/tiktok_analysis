package com.ss.android.ugc.aweme;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LivePermissionApply {

    @C09CT("enable_screenshot")
    public boolean enableLiveScreenshot;

    @C09CT("enable_third_party")
    public boolean enableLiveThirdParty;

    @C09CT("enable_live_video")
    public boolean enableLiveVideo;

    public LivePermissionApply() {
        this(false, false, false);
    }

    public LivePermissionApply(boolean z, boolean z2, boolean z3) {
        this.enableLiveThirdParty = z;
        this.enableLiveScreenshot = z2;
        this.enableLiveVideo = z3;
    }
}
