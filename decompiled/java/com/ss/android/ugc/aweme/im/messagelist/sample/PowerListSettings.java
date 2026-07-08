package com.ss.android.ugc.aweme.im.messagelist.sample;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PowerListSettings {

    @C09CT("createCellMetricsRate")
    public final float createCellMetricsRate;

    @C09CT("diffMetricsRate")
    public final float diffMetricsRate;

    @C09CT("dropFrameMetricsRate")
    public final float dropFrameMetricsRate;

    @C09CT("fpsMetricsRate")
    public final float fpsMetricsRate;

    @C09CT("loadMetricsRate")
    public final float loadMetricsRate;

    @C09CT("onBindMetricsRate")
    public final float onBindMetricsRate;

    @C09CT("onLayoutMetricsRate")
    public final float onLayoutMetricsRate;

    public PowerListSettings() {
        this(0.01f, 0.05f, 0.01f, 0.05f, 0.05f, 0.01f, 0.01f);
    }

    public PowerListSettings(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.createCellMetricsRate = f;
        this.onLayoutMetricsRate = f2;
        this.fpsMetricsRate = f3;
        this.dropFrameMetricsRate = f4;
        this.diffMetricsRate = f5;
        this.onBindMetricsRate = f6;
        this.loadMetricsRate = f7;
    }
}
