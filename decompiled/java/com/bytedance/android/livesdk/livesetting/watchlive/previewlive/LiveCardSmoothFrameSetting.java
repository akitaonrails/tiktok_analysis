package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_card_smooth_frame_setting")
public final class LiveCardSmoothFrameSetting {
    public static final int DEFAULT = 0;
    public static final LiveCardSmoothFrameSetting INSTANCE = new LiveCardSmoothFrameSetting();
    public static final int PLAYER_SOURCE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_card_smooth_frame_setting", DEFAULT);
    }

    public final boolean isPlayerSource() {
        return SettingsManager.INSTANCE.getIntValue("live_card_smooth_frame_setting", DEFAULT) == PLAYER_SOURCE;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getPLAYER_SOURCE() {
        return PLAYER_SOURCE;
    }
}
