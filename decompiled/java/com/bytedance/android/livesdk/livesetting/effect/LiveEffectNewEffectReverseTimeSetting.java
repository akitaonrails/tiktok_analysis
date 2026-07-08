package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_reverse_effect_deadline_timestamp")
public final class LiveEffectNewEffectReverseTimeSetting {
    public static final long DEFAULT = 1666719760000L;
    public static final LiveEffectNewEffectReverseTimeSetting INSTANCE = new LiveEffectNewEffectReverseTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_effect_reverse_effect_deadline_timestamp", DEFAULT);
    }
}
