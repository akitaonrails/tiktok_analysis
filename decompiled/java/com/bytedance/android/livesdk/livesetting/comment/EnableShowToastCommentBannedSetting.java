package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enable_show_toast_comment_banned")
public final class EnableShowToastCommentBannedSetting {
    public static final int DEFAULT = 0;
    public static final EnableShowToastCommentBannedSetting INSTANCE = new EnableShowToastCommentBannedSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("enable_show_toast_comment_banned", DEFAULT) > 0;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_show_toast_comment_banned", DEFAULT);
    }
}
