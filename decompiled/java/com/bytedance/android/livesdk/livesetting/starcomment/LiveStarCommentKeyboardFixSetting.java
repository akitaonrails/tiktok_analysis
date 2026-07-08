package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_star_comment_keyboard_fix_setting")
public final class LiveStarCommentKeyboardFixSetting {
    public static final LiveStarCommentKeyboardFixSetting INSTANCE = new LiveStarCommentKeyboardFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_star_comment_keyboard_fix_setting", DEFAULT);
    }
}
