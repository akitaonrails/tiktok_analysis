package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_star_comment_protect_setting")
public final class LiveStarCommentProtectSetting {
    public static final LiveStarCommentProtectSetting INSTANCE = new LiveStarCommentProtectSetting();
    public static final boolean DEFAULT = true;

    public final boolean getSettingValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_star_comment_protect_setting", DEFAULT);
    }
}
