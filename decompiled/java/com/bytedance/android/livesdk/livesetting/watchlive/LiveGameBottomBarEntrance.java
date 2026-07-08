package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_game_bottom_bar_entrance")
public final class LiveGameBottomBarEntrance {
    public static final LiveGameBottomBarEntrance INSTANCE = new LiveGameBottomBarEntrance();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttlive_game_bottom_bar_entrance", DEFAULT);
    }
}
