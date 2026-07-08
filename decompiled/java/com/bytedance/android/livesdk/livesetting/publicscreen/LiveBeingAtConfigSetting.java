package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_being_at_config")
public final class LiveBeingAtConfigSetting {
    public static LiveBeingAtConfig cacheValue;
    public static final LiveBeingAtConfigSetting INSTANCE = new LiveBeingAtConfigSetting();
    public static final LiveBeingAtConfig DEFAULT = new LiveBeingAtConfig();

    public static final class LiveBeingAtConfig {
        public static final TypeAdapter ADAPTER = new LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("messageConsumeInterval")
        public long messageConsumeInterval = Mp4ScreenVideoLoadTimeout.CONTROL;

        @C09CT("messageLifeDuration")
        public long messageLifeDuration = 300000;

        @C09CT("flagReadThreshold")
        public long flagReadThreshold = 3000;

        @C09CT("check_user")
        public boolean checkUser = true;
    }

    public static final LiveBeingAtConfig getValue() {
        if (cacheValue == null) {
            cacheValue = (LiveBeingAtConfig) SettingsManager.INSTANCE.getValueSafely("live_being_at_config", DEFAULT);
        }
        LiveBeingAtConfig liveBeingAtConfig = cacheValue;
        return liveBeingAtConfig == null ? DEFAULT : liveBeingAtConfig;
    }

    public final LiveBeingAtConfig getCacheValue() {
        return cacheValue;
    }

    public final void setCacheValue(LiveBeingAtConfig liveBeingAtConfig) {
        cacheValue = liveBeingAtConfig;
    }
}
