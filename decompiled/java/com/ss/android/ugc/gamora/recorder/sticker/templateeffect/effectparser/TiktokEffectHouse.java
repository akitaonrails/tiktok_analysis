package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokEffectHouse {

    @C09CT("business")
    public final String business;

    @C09CT("minSdkVersion")
    public final String minSdkVersion;

    @C09CT("sdkVersion")
    public final String sdkVersion;

    @C09CT("toolVersion")
    public final String toolVersion;

    public TiktokEffectHouse() {
        this(null, null, null, null);
    }

    public TiktokEffectHouse(String str, String str2, String str3, String str4) {
        this.toolVersion = str;
        this.sdkVersion = str2;
        this.minSdkVersion = str3;
        this.business = str4;
    }
}
