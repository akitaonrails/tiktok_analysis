package com.ss.android.ugc.feed.platform.metric.model;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class DeviceInfo {

    @C09CT("screen_dip")
    public final float screenDip;

    @C09CT("screen_dpi")
    public final int screenDpi;

    @C09CT("screen_height")
    public final int screenHeightPageCouldUse;

    @C09CT("screen_rating")
    public final int screenRating;

    @C09CT("screen_resolution")
    public final String screenResolution;

    @C09CT("screen_width")
    public final int screenWidthPageCouldUse;

    public DeviceInfo() {
        this(0, 0, 0, 0.0f, "", 0);
    }

    public DeviceInfo(int i, int i2, int i3, float f, String str, int i4) {
        this.screenWidthPageCouldUse = i;
        this.screenHeightPageCouldUse = i2;
        this.screenDpi = i3;
        this.screenDip = f;
        this.screenResolution = str;
        this.screenRating = i4;
    }
}
