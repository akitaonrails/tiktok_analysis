package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
@SettingsKey(preciseExperiment = false, value = "live_player_render_message_sequence_opt")
public final class LivePlayerMessageOptSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_RENDER_MESSAGE_OPT_BY_FRAME_ANIMATION = 2;
    public static final int ENABLE_RENDER_MESSAGE_OPT_BY_FRAME_ANIMATION_AND_MQ = 3;
    public static final int ENABLE_RENDER_MESSAGE_OPT_BY_MQ = 1;
    public static final LivePlayerMessageOptSetting INSTANCE = new LivePlayerMessageOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_player_render_message_sequence_opt", DEFAULT);
    }

    public final boolean disableRenderMessageOpt() {
        return getValue() == DEFAULT;
    }

    public final boolean enableRenderMessageOptByFrameAnimation() {
        int value = getValue();
        return value == 2 || value == 3;
    }

    public final boolean enableRenderMessageOptByMQ() {
        int value = getValue();
        return value == 1 || value == 3;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
