package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_pitaya_request_all_enable")
public final class LivePitayaUpdateRequestAllEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePitayaUpdateRequestAllEnableSetting INSTANCE = new LivePitayaUpdateRequestAllEnableSetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pitaya_request_all_enable", DEFAULT);
    }
}
