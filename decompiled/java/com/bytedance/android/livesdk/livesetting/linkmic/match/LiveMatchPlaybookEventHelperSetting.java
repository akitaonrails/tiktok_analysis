package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_playbook_event_helper")
public final class LiveMatchPlaybookEventHelperSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchPlaybookEventHelperSetting INSTANCE = new LiveMatchPlaybookEventHelperSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_playbook_event_helper", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
