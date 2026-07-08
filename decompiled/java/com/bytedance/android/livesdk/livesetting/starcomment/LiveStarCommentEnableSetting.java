package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_star_comment_enable_setting")
public final class LiveStarCommentEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStarCommentEnableSetting INSTANCE = new LiveStarCommentEnableSetting();

    public final boolean getSettingValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_star_comment_enable_setting", DEFAULT);
    }
}
