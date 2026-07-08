package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_chxmg_live_studio_audience")
public final class LinkMicChxmgLiveStudioAudience {
    public static final int DEFAULT = 0;
    public static final LinkMicChxmgLiveStudioAudience INSTANCE = new LinkMicChxmgLiveStudioAudience();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_chxmg_live_studio_audience", DEFAULT);
    }
}
