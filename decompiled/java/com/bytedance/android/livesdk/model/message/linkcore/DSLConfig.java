package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DSLConfig {

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("scene_version")
    public int sceneVersion;

    public DSLConfig() {
        this(0, null);
    }

    public DSLConfig(int i, String str) {
        this.sceneVersion = i;
        this.layoutId = str;
    }
}
