package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_filter_none_loki")
public final class LiveFilterNoneFromLokiSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFilterNoneFromLokiSetting INSTANCE = new LiveFilterNoneFromLokiSetting();

    public final boolean disable() {
        return !SettingsManager.INSTANCE.getBooleanValue("live_filter_none_loki", DEFAULT);
    }
}
