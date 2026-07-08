package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_studio_star_comment_protect_setting")
public final class LSStarCommentProtectSetting {
    public static final LSStarCommentProtectSetting INSTANCE = new LSStarCommentProtectSetting();
    public static final boolean DEFAULT = true;

    public final boolean getSettingValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_studio_star_comment_protect_setting", DEFAULT);
    }
}
