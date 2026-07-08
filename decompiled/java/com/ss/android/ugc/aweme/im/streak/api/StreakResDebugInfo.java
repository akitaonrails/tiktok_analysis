package com.ss.android.ugc.aweme.im.streak.api;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakResDebugInfo {

    @C09CT("channel")
    public final String channel;

    @C09CT("is_animation_unlock_keep_last_frame")
    public final boolean isAnimationUnlockKeepLastFrame;

    @C09CT("is_res_ready")
    public final boolean isResReady;

    @C09CT("provider_name")
    public final String providerName;

    public StreakResDebugInfo() {
        this("", null, false, false);
    }

    public StreakResDebugInfo(String str, String str2, boolean z, boolean z2) {
        this.providerName = str;
        this.channel = str2;
        this.isResReady = z;
        this.isAnimationUnlockKeepLastFrame = z2;
    }
}
