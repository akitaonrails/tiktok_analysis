package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_opt_stream_jump_exp")
public final class LiveOptStreamJumpExp {
    public static final int DEFAULT = 0;
    public static final LiveOptStreamJumpExp INSTANCE = new LiveOptStreamJumpExp();
    public static final int ENABLE = 1;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_opt_stream_jump_exp", DEFAULT) == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
