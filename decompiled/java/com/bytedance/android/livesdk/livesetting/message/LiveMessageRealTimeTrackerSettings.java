package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_im_full_link_config")
public final class LiveMessageRealTimeTrackerSettings {
    public static final LiveMessageRealTimeTrackerSettings INSTANCE = new LiveMessageRealTimeTrackerSettings();
    public static final RealtimeTrackerConfig DEFAULT = new RealtimeTrackerConfig(false, LSPassThroughRecordSizeConfig.DEFAULT, new ArrayList(), "", "", 30);

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().getEnable();
    }

    public final RealtimeTrackerConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RealtimeTrackerConfig realtimeTrackerConfig = DEFAULT;
        RealtimeTrackerConfig realtimeTrackerConfig2 = (RealtimeTrackerConfig) settingsManager.getValueSafely("live_im_full_link_config", realtimeTrackerConfig);
        return realtimeTrackerConfig2 != null ? realtimeTrackerConfig2 : realtimeTrackerConfig;
    }
}
