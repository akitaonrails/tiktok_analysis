package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_card_smooth_enter_ignore_first_frame_exp")
public final class LiveCardSmoothEnterIgnoreFirstFrameExp {
    public static final int DEFAULT = 0;
    public static final LiveCardSmoothEnterIgnoreFirstFrameExp INSTANCE = new LiveCardSmoothEnterIgnoreFirstFrameExp();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_card_smooth_enter_ignore_first_frame_exp", DEFAULT) == 1;
    }

    public final boolean isDisable() {
        return !isEnable();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
