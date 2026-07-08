package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class LivePreviewScrollConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("live_exp_added_page_offset")
    public final float liveExpAddedPageOffset;

    @C09CT("live_exp_fling_distance")
    public final int liveExpFlingDistance;

    @C09CT("live_exp_minimum_velocity")
    public final int liveExpMinimumVelocity;

    @C09CT("live_long_press_distance")
    public final int liveLongPressDistance;

    @C09CT("live_long_press_time")
    public final int liveLongPressTime;

    @C09CT("live_touchSlop")
    public final int liveTouchSlop;

    @C09CT("open_debug_tool")
    public final boolean openDebugTool;

    public LivePreviewScrollConfig() {
        this(false, false, 21, 280, 0.3f, 16, 500, 8);
    }

    public LivePreviewScrollConfig(boolean z, boolean z2, int i, int i2, float f, int i3, int i4, int i5) {
        this.enable = z;
        this.openDebugTool = z2;
        this.liveExpFlingDistance = i;
        this.liveExpMinimumVelocity = i2;
        this.liveExpAddedPageOffset = f;
        this.liveTouchSlop = i3;
        this.liveLongPressTime = i4;
        this.liveLongPressDistance = i5;
    }
}
