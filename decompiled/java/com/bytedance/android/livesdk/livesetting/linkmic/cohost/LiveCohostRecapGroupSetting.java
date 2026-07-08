package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_recap_group")
public final class LiveCohostRecapGroupSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostRecapGroupSetting INSTANCE = new LiveCohostRecapGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_recap_group", DEFAULT);
    }
}
