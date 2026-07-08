package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_comment_bean_emoji")
public final class LiveCommentDrawableEmojiSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCommentDrawableEmojiSetting INSTANCE = new LiveCommentDrawableEmojiSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_comment_bean_emoji", DEFAULT);
    }
}
