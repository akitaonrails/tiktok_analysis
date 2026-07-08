package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_hangout_enable_skylight")
public final class MultiTopLiveHangoutEnableSkylightSetting {
    public static final int DEFAULT = 0;
    public static final MultiTopLiveHangoutEnableSkylightSetting INSTANCE = new MultiTopLiveHangoutEnableSkylightSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_hangout_enable_skylight", DEFAULT) >= 1;
    }
}
