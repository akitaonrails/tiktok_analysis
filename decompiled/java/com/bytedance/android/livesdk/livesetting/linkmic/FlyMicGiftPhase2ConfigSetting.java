package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_flying_mic_config")
public final class FlyMicGiftPhase2ConfigSetting {
    public static final FlyMicGiftPhase2ConfigSetting INSTANCE = new FlyMicGiftPhase2ConfigSetting();
    public static final FlyMicV2Config DEFAULT = new FlyMicV2Config(false, false);
    public static final FlyMicV2Config EXPERIMENT_GROUP = new FlyMicV2Config(true, true);
    public static final FlyMicV2Config CONTROL_GROUP = new FlyMicV2Config(false, true);

    public final FlyMicV2Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FlyMicV2Config flyMicV2Config = DEFAULT;
        FlyMicV2Config flyMicV2Config2 = (FlyMicV2Config) settingsManager.getValueSafely("live_flying_mic_config", flyMicV2Config);
        return flyMicV2Config2 != null ? flyMicV2Config2 : flyMicV2Config;
    }
}
