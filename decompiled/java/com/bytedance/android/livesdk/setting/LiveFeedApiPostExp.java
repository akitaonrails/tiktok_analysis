package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_post_trans")
public final class LiveFeedApiPostExp {
    public static final int DEFAULT = 0;
    public static final LiveFeedApiPostExp INSTANCE = new LiveFeedApiPostExp();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_inner_post_trans", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
