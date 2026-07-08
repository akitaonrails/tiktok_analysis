package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_guest_lets_dance_game_resources")
public final class MultiGuestLetsDanceGameResourcesSetting {
    public static final String[] DEFAULT;
    public static final MultiGuestLetsDanceGameResourcesSetting INSTANCE = new MultiGuestLetsDanceGameResourcesSetting();
    public static final String[] gameResourceIdList;

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        gameResourceIdList = SettingsManager.INSTANCE.getStringArrayValue("multi_guest_lets_dance_game_resources", strArr);
    }

    public final String[] getGameResourceIdList() {
        return gameResourceIdList;
    }
}
