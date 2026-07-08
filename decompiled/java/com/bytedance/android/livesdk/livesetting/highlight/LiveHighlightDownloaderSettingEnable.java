package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_highlight_download_enable")
public final class LiveHighlightDownloaderSettingEnable {
    public static final LiveHighlightDownloaderSettingEnable INSTANCE = new LiveHighlightDownloaderSettingEnable();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_highlight_download_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
