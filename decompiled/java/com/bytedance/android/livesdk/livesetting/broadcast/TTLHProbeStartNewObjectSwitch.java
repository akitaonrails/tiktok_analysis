package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_start_new_object")
public final class TTLHProbeStartNewObjectSwitch {
    public static final TTLHProbeStartNewObjectSwitch INSTANCE = new TTLHProbeStartNewObjectSwitch();
    public static final int DEFAULT = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_probe_start_new_object", DEFAULT) == 1;
    }
}
