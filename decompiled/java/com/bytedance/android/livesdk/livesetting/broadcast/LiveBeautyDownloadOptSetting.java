package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_beauty_download_opt")
public final class LiveBeautyDownloadOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveBeautyDownloadOptSetting INSTANCE = new LiveBeautyDownloadOptSetting();

    public final boolean inExperiment() {
        return SettingsManager.INSTANCE.getIntValue("live_beauty_download_opt", DEFAULT) != 0;
    }

    public final boolean inV1() {
        return SettingsManager.INSTANCE.getIntValue("live_beauty_download_opt", DEFAULT) == 1;
    }
}
