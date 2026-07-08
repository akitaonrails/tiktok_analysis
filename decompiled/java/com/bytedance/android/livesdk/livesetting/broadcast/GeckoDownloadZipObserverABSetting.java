package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_gecko_download_zip_observer")
public final class GeckoDownloadZipObserverABSetting {
    public static final int DEFAULT = 0;
    public static final GeckoDownloadZipObserverABSetting INSTANCE = new GeckoDownloadZipObserverABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_gecko_download_zip_observer", DEFAULT) == 1;
    }
}
