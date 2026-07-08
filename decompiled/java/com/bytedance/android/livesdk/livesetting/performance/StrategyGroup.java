package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyGroup {
    public static final TypeAdapter ADAPTER = new StrategyGroup_OptTypeAdapter(NormalGson.singleton());

    @C09CT("high_device")
    public StrategyInfo highDevice;

    @C09CT("low_device")
    public StrategyInfo lowDevice;

    @C09CT("midDevice")
    public StrategyInfo midDevice;
}
