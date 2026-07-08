package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveTopTabData {
    public static final TypeAdapter ADAPTER = new LiveTopTabData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("clear_screen")
    public boolean clearScreen;

    @C09CT("hide_live_end_close_button")
    public boolean hideLiveEndPageCloseBtn;

    @C09CT("landing_tab_time_threshold")
    public long landingTabTimeSecondsThreshold;

    @C09CT("landscapeOptRevertSwitch")
    public boolean landscapeOptRevertSwitch;

    @C09CT("lynx_prefetch_enable")
    public boolean lynxPrefetchEnable;

    @C09CT("slideOpt")
    public boolean slideOpt;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public boolean f37switch;

    public LiveTopTabData() {
        this(true, true, true, true, true, false, 300L);
    }

    public LiveTopTabData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j) {
        this.f37switch = z;
        this.slideOpt = z2;
        this.clearScreen = z3;
        this.hideLiveEndPageCloseBtn = z4;
        this.lynxPrefetchEnable = z5;
        this.landscapeOptRevertSwitch = z6;
        this.landingTabTimeSecondsThreshold = j;
    }
}
