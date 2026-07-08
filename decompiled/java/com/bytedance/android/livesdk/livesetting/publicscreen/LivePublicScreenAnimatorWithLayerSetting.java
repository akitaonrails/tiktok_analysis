package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_animator_with_layer")
public final class LivePublicScreenAnimatorWithLayerSetting {
    public static final int DEFAULT = 0;
    public static final int FRAME_ALIGN = 2;
    public static final LivePublicScreenAnimatorWithLayerSetting INSTANCE = new LivePublicScreenAnimatorWithLayerSetting();
    public static final int WITH_LAYER = 1;
    public static final int WITH_LAYER_AND_FRAME_ALIGN = 3;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_animator_with_layer", DEFAULT);
    }

    public final boolean frameAlign() {
        return getValue() == 2 || getValue() == 3;
    }

    public final boolean withLayer() {
        return getValue() == 1 || getValue() == 3;
    }
}
