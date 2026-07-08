package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveTooltipDebugConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_tooltip_debug")
public final class LiveTooltipDebugSetting {
    public static final LiveTooltipDebugConfig DEFAULT;
    public static final LiveTooltipDebugSetting INSTANCE = new LiveTooltipDebugSetting();
    public static final LiveTooltipDebugConfig value;

    static {
        LiveTooltipDebugConfig liveTooltipDebugConfig = new LiveTooltipDebugConfig(false, false, 0, 0, true, true, true);
        DEFAULT = liveTooltipDebugConfig;
        LiveTooltipDebugConfig liveTooltipDebugConfig2 = (LiveTooltipDebugConfig) SettingsManager.INSTANCE.getValueSafely(LiveTooltipDebugSetting.class);
        if (liveTooltipDebugConfig2 != null) {
            liveTooltipDebugConfig = liveTooltipDebugConfig2;
        }
        value = liveTooltipDebugConfig;
    }

    public final LiveTooltipDebugConfig getValue() {
        return value;
    }
}
