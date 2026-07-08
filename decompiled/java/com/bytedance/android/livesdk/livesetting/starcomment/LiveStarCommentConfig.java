package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_star_comment_self_waiting_time")
public final class LiveStarCommentConfig {
    public static final LiveStarCommentConfig INSTANCE = new LiveStarCommentConfig();
    public static final long DEFAULT = 3000;

    public final long getSettingValue() {
        return SettingsManager.INSTANCE.getLongValue("live_star_comment_self_waiting_time", DEFAULT);
    }
}
