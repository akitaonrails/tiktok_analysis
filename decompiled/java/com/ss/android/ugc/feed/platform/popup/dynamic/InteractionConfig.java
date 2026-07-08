package com.ss.android.ugc.feed.platform.popup.dynamic;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class InteractionConfig {

    @C09CT("back_key_mode")
    public final String backKeyMode;

    @C09CT("disable_back_key")
    public final boolean disableBackKey;

    @C09CT("pause_video")
    public final boolean pauseVideo;

    @C09CT("present_type")
    public final String presentType;

    public InteractionConfig() {
        this(null, false, false, null);
    }

    public InteractionConfig(String str, boolean z, boolean z2, String str2) {
        this.presentType = str;
        this.pauseVideo = z;
        this.disableBackKey = z2;
        this.backKeyMode = str2;
    }
}
