package com.bytedance.pumbaa.hybrid.container.cct;

import X.C828350WeX;

/* JADX INFO: loaded from: classes14.dex */
public final class SeclinkConfig {
    public static final C828350WeX Companion = new Object() { // from class: X.0WeX
    };
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
