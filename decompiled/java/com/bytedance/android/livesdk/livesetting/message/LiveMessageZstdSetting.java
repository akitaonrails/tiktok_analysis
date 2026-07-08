package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_zstd_setting_v2")
public final class LiveMessageZstdSetting {
    public static final int DEFAULT = 0;
    public static final LiveMessageZstdSetting INSTANCE = new LiveMessageZstdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_message_zstd_setting_v2", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }

    public final int zstdType() {
        return getValue();
    }
}
