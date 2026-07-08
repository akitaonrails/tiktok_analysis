package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_playbook_change_interval")
public final class LiveMatchPlaybookChangeIntervalSetting {
    public static final long DEFAULT = 1500;
    public static final LiveMatchPlaybookChangeIntervalSetting INSTANCE = new LiveMatchPlaybookChangeIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_match_playbook_change_interval", DEFAULT);
    }
}
