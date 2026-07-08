package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_specific_gift_playbook_id")
public final class LiveMatchSpecificGiftPlaybookIdSetting {
    public static final long DEFAULT = 7540582188808047366L;
    public static final LiveMatchSpecificGiftPlaybookIdSetting INSTANCE = new LiveMatchSpecificGiftPlaybookIdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_match_specific_gift_playbook_id", DEFAULT);
    }
}
