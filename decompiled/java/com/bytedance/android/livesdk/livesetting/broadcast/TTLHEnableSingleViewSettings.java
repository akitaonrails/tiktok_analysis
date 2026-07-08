package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_enable_single_view")
public final class TTLHEnableSingleViewSettings {
    public static final boolean DEFAULT = false;
    public static final TTLHEnableSingleViewSettings INSTANCE = new TTLHEnableSingleViewSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_enable_single_view", DEFAULT);
    }
}
