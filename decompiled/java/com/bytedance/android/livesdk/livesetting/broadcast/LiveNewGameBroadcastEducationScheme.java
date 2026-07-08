package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_game_new_broadcast_education_h5_scheme")
public final class LiveNewGameBroadcastEducationScheme {
    public static final String DEFAULT = "";
    public static final LiveNewGameBroadcastEducationScheme INSTANCE = new LiveNewGameBroadcastEducationScheme();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_new_broadcast_education_h5_scheme", DEFAULT);
    }
}
