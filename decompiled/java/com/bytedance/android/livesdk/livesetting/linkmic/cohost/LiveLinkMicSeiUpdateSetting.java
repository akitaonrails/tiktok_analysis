package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_link_mic_sei_update")
public final class LiveLinkMicSeiUpdateSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLinkMicSeiUpdateSetting INSTANCE = new LiveLinkMicSeiUpdateSetting();

    public final boolean optimize() {
        return SettingsManager.INSTANCE.getBooleanValue("live_link_mic_sei_update", DEFAULT);
    }
}
