package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_quick_cohost_pre_filter")
public final class LiveQuickCohostPreFilterSetting {
    public static final int DEFAULT = 0;
    public static final LiveQuickCohostPreFilterSetting INSTANCE = new LiveQuickCohostPreFilterSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_quick_cohost_pre_filter", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
