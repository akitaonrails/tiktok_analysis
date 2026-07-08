package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlivesdk_pcs_event_intercept_enable")
public final class TTLivePcsEventInterceptSetting {
    public static final boolean DEFAULT = false;
    public static final TTLivePcsEventInterceptSetting INSTANCE = new TTLivePcsEventInterceptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivesdk_pcs_event_intercept_enable", DEFAULT);
    }
}
