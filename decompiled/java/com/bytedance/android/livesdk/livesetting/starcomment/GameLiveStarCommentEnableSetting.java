package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("game_live_star_comment_entrance_enabled")
public final class GameLiveStarCommentEnableSetting {
    public static final boolean DEFAULT = false;
    public static final GameLiveStarCommentEnableSetting INSTANCE = new GameLiveStarCommentEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_star_comment_entrance_enabled", DEFAULT);
    }
}
