package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_app_context_switch")
public final class TTLHProbeAppContextSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHProbeAppContextSwitch INSTANCE = new TTLHProbeAppContextSwitch();

    public final boolean enableTTLHProbeAppContext() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_app_context_switch", DEFAULT) == 1;
    }
}
