package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_zstd_load_setting")
public final class LiveMessageZstdLoadSetting {
    public static final int DEFAULT = 0;
    public static final LiveMessageZstdLoadSetting INSTANCE = new LiveMessageZstdLoadSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_message_zstd_load_setting", DEFAULT);
    }

    public final boolean isZstdLoadWhenLivePlay() {
        return getValue() == 1;
    }

    public final boolean isZstdLoadWhenSDKStart() {
        return getValue() == 0;
    }
}
