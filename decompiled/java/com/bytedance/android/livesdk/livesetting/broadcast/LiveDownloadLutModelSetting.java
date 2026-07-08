package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_download_lut_model")
public final class LiveDownloadLutModelSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDownloadLutModelSetting INSTANCE = new LiveDownloadLutModelSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_download_lut_model", DEFAULT);
    }
}
