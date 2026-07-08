package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_funny_effect_playbook_id")
public final class LiveMatchFunnyEffectPlaybookIdSetting {
    public static final long DEFAULT = 0;
    public static final LiveMatchFunnyEffectPlaybookIdSetting INSTANCE = new LiveMatchFunnyEffectPlaybookIdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_match_funny_effect_playbook_id", DEFAULT);
    }
}
