package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_square_inbox_refresh_interval")
public final class LiveSquareInboxRefreshIntervalSetting {
    public static final int DEFAULT = 300;
    public static final LiveSquareInboxRefreshIntervalSetting INSTANCE = new LiveSquareInboxRefreshIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_square_inbox_refresh_interval", DEFAULT);
    }
}
