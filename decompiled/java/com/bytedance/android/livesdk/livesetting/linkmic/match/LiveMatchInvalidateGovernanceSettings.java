package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("tt_live_match_invalidate_governance_enable")
public final class LiveMatchInvalidateGovernanceSettings {
    public static final boolean DEFAULT = false;
    public static final LiveMatchInvalidateGovernanceSettings INSTANCE = new LiveMatchInvalidateGovernanceSettings();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("tt_live_match_invalidate_governance_enable", DEFAULT);
    }
}
