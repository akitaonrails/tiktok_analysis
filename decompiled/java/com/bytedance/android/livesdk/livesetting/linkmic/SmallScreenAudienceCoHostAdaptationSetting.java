package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("small_screen_audience_cohost_adaptation")
public final class SmallScreenAudienceCoHostAdaptationSetting {
    public static final SmallScreenAudienceCoHostAdaptationSetting INSTANCE = new SmallScreenAudienceCoHostAdaptationSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("small_screen_audience_cohost_adaptation", DEFAULT);
    }
}
