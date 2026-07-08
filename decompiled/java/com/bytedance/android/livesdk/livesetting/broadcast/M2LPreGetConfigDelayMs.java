package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("pre_get_config_delay_ms")
public final class M2LPreGetConfigDelayMs {
    public static final int DEFAULT = 0;
    public static final M2LPreGetConfigDelayMs INSTANCE = new M2LPreGetConfigDelayMs();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("pre_get_config_delay_ms", DEFAULT);
    }
}
