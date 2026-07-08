package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_live_ab_settings")
public final class TTLHLiveABSettings {
    public static final TTLHLiveABSettings INSTANCE = new TTLHLiveABSettings();
    public static final String DEFAULT = "{}";

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_live_ab_settings", DEFAULT);
    }
}
