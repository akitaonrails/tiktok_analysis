package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "comment_mute_rule_group")
public final class LiveMuteGroupSetting {
    public static final int DEFAULT = 0;
    public static final LiveMuteGroupSetting INSTANCE = new LiveMuteGroupSetting();

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("comment_mute_rule_group", DEFAULT) != 0;
    }
}
