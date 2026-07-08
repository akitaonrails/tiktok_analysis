package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_mix_stream_region_fix")
public final class LinkMicMixStreamRegionFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicMixStreamRegionFixSetting INSTANCE = new LinkMicMixStreamRegionFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mix_stream_region_fix", DEFAULT);
    }
}
