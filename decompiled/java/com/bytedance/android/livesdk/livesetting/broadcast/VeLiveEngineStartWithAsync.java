package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ve_live_engine_start_with_async")
public final class VeLiveEngineStartWithAsync {
    public static final boolean DEFAULT = false;
    public static final VeLiveEngineStartWithAsync INSTANCE = new VeLiveEngineStartWithAsync();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ve_live_engine_start_with_async", DEFAULT);
    }
}
