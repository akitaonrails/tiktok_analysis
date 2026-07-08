package com.bytedance.android.livesdk.broadcast.preview.animation.manager;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewAnimationConfig {

    @C09CT("isActive")
    public final boolean isActive;

    @C09CT("position")
    public final String position;

    @C09CT("priority")
    public final int priority;

    public PreviewAnimationConfig() {
        this("", 0, true);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public PreviewAnimationConfig(String str, int i, boolean z) {
        this.position = str;
        this.priority = i;
        this.isActive = z;
    }
}
