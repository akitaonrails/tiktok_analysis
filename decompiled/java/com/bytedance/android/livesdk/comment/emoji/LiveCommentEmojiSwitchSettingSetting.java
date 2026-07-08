package com.bytedance.android.livesdk.comment.emoji;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_emoji_switch_setting")
public final class LiveCommentEmojiSwitchSettingSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentEmojiSwitchSettingSetting INSTANCE = new LiveCommentEmojiSwitchSettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_comment_emoji_switch_setting", DEFAULT);
    }
}
