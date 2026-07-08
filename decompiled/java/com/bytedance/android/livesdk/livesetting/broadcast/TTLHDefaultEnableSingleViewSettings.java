package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_default_enable_single_view")
public final class TTLHDefaultEnableSingleViewSettings {
    public static final TTLHDefaultEnableSingleViewSettings INSTANCE = new TTLHDefaultEnableSingleViewSettings();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_default_enable_single_view", DEFAULT);
    }
}
