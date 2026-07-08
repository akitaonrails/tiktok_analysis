package com.bytedance.hybrid.spark.third.router;

import X.C829960Wh8;

/* JADX INFO: loaded from: classes14.dex */
public final class SeclinkConfig {
    public static final C829960Wh8 Companion = new C829960Wh8();
    public final boolean enable;
    public final String scene;

    public final boolean checkConfig() {
        return this.enable && this.scene.length() > 0;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getScene() {
        return this.scene;
    }

    public SeclinkConfig(boolean z, String str) {
        this.enable = z;
        this.scene = str;
    }
}
