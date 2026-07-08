package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "tikcast_multilive_animation")
public final class MultiLiveAnimation {
    public static final int DEFAULT = 0;
    public static final MultiLiveAnimation INSTANCE = new MultiLiveAnimation();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("tikcast_multilive_animation", DEFAULT) > 1;
    }

    public final boolean enableScroll() {
        return SettingsManager.INSTANCE.getIntValue("tikcast_multilive_animation", DEFAULT) >= 3;
    }
}
