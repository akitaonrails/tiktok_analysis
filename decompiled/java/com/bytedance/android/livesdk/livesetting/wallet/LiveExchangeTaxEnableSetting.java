package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("should_request_tax")
public final class LiveExchangeTaxEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveExchangeTaxEnableSetting INSTANCE = new LiveExchangeTaxEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("should_request_tax", DEFAULT);
    }
}
