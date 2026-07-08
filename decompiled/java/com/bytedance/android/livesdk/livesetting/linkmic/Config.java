package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("align_online")
    public boolean alignOnline;

    @C09CT("enable")
    public boolean enable;

    @C09CT("for_test")
    public boolean forTest;

    @C09CT("measure_timing")
    public int measureTiming;

    @C09CT("opt_card_cpu")
    public boolean optCardCpu;

    @C09CT("opt_online")
    public boolean optOnline;

    @C09CT("opt_save_room")
    public boolean optSaveRoom;

    @C09CT("preload_timing")
    public int preloadTiming;

    @C09CT("preload_type")
    public int preloadType;

    public Config() {
        this(false, 0, 0, 0, false, false, false, true, true);
    }

    public Config(boolean z, int i, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enable = z;
        this.preloadTiming = i;
        this.preloadType = i2;
        this.measureTiming = i3;
        this.forTest = z2;
        this.alignOnline = z3;
        this.optOnline = z4;
        this.optSaveRoom = z5;
        this.optCardCpu = z6;
    }
}
