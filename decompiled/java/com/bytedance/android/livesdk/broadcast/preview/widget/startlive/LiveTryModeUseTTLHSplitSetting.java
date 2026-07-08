package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
@SettingsKey(preciseExperiment = false, value = "live_try_mode_use_ttlh_split")
public final class LiveTryModeUseTTLHSplitSetting {
    public static final boolean DEFAULT = false;
    public static final LiveTryModeUseTTLHSplitSetting INSTANCE = new LiveTryModeUseTTLHSplitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_try_mode_use_ttlh_split", DEFAULT);
    }
}
