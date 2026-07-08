package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("m2l_game_pre_add_track")
public final class M2LGamePreAddTrack {
    public static final M2LGamePreAddTrack INSTANCE = new M2LGamePreAddTrack();
    public static final int DEFAULT = 1;

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("m2l_game_pre_add_track", DEFAULT);
    }
}
