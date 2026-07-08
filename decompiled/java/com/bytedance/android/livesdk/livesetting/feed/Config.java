package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("back_smooth")
    public boolean backSmooth;

    @C09CT("cache_interval")
    public int cacheInterval;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_dragging_opt")
    public boolean enableDraggingOpt;

    @C09CT("enable_sliding_opt")
    public boolean enableSlidingOpt;

    public Config() {
        this(false, true, true, false, 180000);
    }

    public Config(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.enable = z;
        this.enableDraggingOpt = z2;
        this.enableSlidingOpt = z3;
        this.backSmooth = z4;
        this.cacheInterval = i;
    }
}
