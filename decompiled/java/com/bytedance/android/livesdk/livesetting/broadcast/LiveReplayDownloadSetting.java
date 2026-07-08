package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_download_enable")
public final class LiveReplayDownloadSetting {
    public static final int DEFAULT = 0;
    public static final LiveReplayDownloadSetting INSTANCE = new LiveReplayDownloadSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_download_enable", DEFAULT) > 0;
    }
}
