package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_linkmic_log_switch")
public final class TTLHLinkMicLogSwitch {
    public static final boolean DEFAULT = true;
    public static final TTLHLinkMicLogSwitch INSTANCE = new TTLHLinkMicLogSwitch();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_linkmic_log_switch", DEFAULT);
    }
}
