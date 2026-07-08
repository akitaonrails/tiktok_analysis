package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "comment_mute_rule_content_max_length")
public final class LiveCommentMuteRuleContentMaxLengthSetting {
    public static final int DEFAULT = 150;
    public static final LiveCommentMuteRuleContentMaxLengthSetting INSTANCE = new LiveCommentMuteRuleContentMaxLengthSetting();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("comment_mute_rule_content_max_length", DEFAULT);
    }
}
