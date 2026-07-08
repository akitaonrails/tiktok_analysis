package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class NewStableModeConfig {
    public static final TypeAdapter ADAPTER = new NewStableModeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_init_ms")
    public long delayInitMs;

    @C09CT("enable")
    public boolean enable;

    @C09CT("default_open")
    public boolean defaultOpen = true;

    @C09CT("heavy_threshold")
    public int heavyThreshold = 50;

    @C09CT("function_available_mask")
    public int functionAvailableMask = -1;

    @C09CT("strategy_name")
    public String strategyName = "live_anchor_stable_mode";
}
