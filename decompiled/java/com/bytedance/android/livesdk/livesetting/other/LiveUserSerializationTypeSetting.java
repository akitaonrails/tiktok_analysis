package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_optimization_user_serialization_type")
public final class LiveUserSerializationTypeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUserSerializationTypeSetting INSTANCE = new LiveUserSerializationTypeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_optimization_user_serialization_type", DEFAULT);
    }
}
