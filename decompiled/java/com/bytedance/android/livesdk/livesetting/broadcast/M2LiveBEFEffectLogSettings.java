package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2live_bef_effect_log_level")
public final class M2LiveBEFEffectLogSettings {
    public static final M2LiveBEFEffectLogSettings INSTANCE = new M2LiveBEFEffectLogSettings();
    public static final int DEFAULT = 5;

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("m2live_bef_effect_log_level", DEFAULT);
    }
}
