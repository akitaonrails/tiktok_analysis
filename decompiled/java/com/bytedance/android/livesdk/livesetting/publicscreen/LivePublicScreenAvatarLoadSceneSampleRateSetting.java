package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.AbstractC19994813Le;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_avatar_load_scene_sample_rate")
public final class LivePublicScreenAvatarLoadSceneSampleRateSetting {
    public static final LivePublicScreenAvatarLoadSceneSampleRateSetting INSTANCE = new LivePublicScreenAvatarLoadSceneSampleRateSetting();
    public static final double DEFAULT = 0.5d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_public_screen_avatar_load_scene_sample_rate", DEFAULT);
    }

    public static final boolean shouldPassAvatarScene() {
        return AbstractC19994813Le.Default.nextDouble() < getValue();
    }
}
