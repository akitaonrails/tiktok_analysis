package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_allow_quick_cohost_preference_match_rollback_key")
public final class LiveCohostAllowQuickCohostPreferenceMatchRollbackKeySetting {
    public static final LiveCohostAllowQuickCohostPreferenceMatchRollbackKeySetting INSTANCE = new LiveCohostAllowQuickCohostPreferenceMatchRollbackKeySetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_allow_quick_cohost_preference_match_rollback_key", DEFAULT);
    }

    public final boolean isRollbackEnabled() {
        return getValue();
    }
}
