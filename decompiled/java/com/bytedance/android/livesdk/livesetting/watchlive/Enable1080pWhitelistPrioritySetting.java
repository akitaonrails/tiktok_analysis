package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enable_1080p_allowlist_priority")
public final class Enable1080pWhitelistPrioritySetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final Enable1080pWhitelistPrioritySetting INSTANCE = new Enable1080pWhitelistPrioritySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_1080p_allowlist_priority", DEFAULT);
    }

    public final boolean enable1080pWhiteListPriority() {
        return getValue() == 1;
    }
}
