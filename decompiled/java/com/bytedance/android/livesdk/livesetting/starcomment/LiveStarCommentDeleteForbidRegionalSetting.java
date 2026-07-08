package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_star_comment_regional_setting_enabled")
public final class LiveStarCommentDeleteForbidRegionalSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStarCommentDeleteForbidRegionalSetting INSTANCE = new LiveStarCommentDeleteForbidRegionalSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_star_comment_regional_setting_enabled", DEFAULT);
    }
}
