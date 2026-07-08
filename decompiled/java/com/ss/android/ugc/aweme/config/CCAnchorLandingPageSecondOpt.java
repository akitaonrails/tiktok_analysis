package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CCAnchorLandingPageSecondOpt {

    @C09CT("android_score")
    public final PreloadVideoConfigAndroidScore androidScore;

    @C09CT("hardware_decode")
    public final Integer hardwareDecode;

    @C09CT("lynx_asyn_layout")
    public final Integer lynxAsynLayout;

    @C09CT("multi_rate")
    public final Integer multiRate;

    @C09CT("operate_asyn")
    public final Integer operateAsyn;

    @C09CT("skip_stream")
    public final Integer skipStream;

    public CCAnchorLandingPageSecondOpt() {
        this(null, null, null, null, null, null);
    }

    public CCAnchorLandingPageSecondOpt(Integer num, Integer num2, Integer num3, Integer num4, PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore, Integer num5) {
        this.lynxAsynLayout = num;
        this.operateAsyn = num2;
        this.multiRate = num3;
        this.skipStream = num4;
        this.androidScore = preloadVideoConfigAndroidScore;
        this.hardwareDecode = num5;
    }
}
