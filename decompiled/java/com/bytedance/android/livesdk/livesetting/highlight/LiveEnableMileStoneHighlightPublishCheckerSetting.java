package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_enable_mile_stone_high_light_publish_checker")
public final class LiveEnableMileStoneHighlightPublishCheckerSetting {
    public static final LiveEnableMileStoneHighlightPublishCheckerSetting INSTANCE = new LiveEnableMileStoneHighlightPublishCheckerSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_enable_mile_stone_high_light_publish_checker", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
