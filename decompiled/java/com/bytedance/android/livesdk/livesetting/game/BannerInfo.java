package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class BannerInfo {

    @C09CT("compatible")
    public final boolean compatible;

    @C09CT("name")
    public final String name;

    @C09CT("priority")
    public final int priority;

    public BannerInfo(String str, boolean z, int i) {
        this.name = str;
        this.compatible = z;
        this.priority = i;
    }
}
