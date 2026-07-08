package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class LiveCapsuleStyleConfig {
    public static final TypeAdapter ADAPTER = new LiveCapsuleStyleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("capsule_style_config")
    public LiveCapsuleStyleItemConfig capsuleStyleItemConfig;

    @C09CT("multi_strategy_capsule_style_config")
    public LiveCapsuleStyleItemConfig multiStrategyCapsuleStyleConfig;
}
