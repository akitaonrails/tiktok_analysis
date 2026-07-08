package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_icy_clash_playbook_id")
public final class LiveMatchIcyClashPlaybookIdSetting {
    public static final long DEFAULT = 7599691607125789458L;
    public static final LiveMatchIcyClashPlaybookIdSetting INSTANCE = new LiveMatchIcyClashPlaybookIdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_match_icy_clash_playbook_id", DEFAULT);
    }
}
