package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_follow_big_word_mode_opt")
public final class LiveFollowBigWordModeOptEnableSetting {
    public static final LiveFollowBigWordModeOptEnableSetting INSTANCE = new LiveFollowBigWordModeOptEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_follow_big_word_mode_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
