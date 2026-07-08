package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_fixed_downgrade_check_logic")
public final class LiveMatchFixedDowngradeCheckLogic {
    public static final boolean DEFAULT = true;
    public static final LiveMatchFixedDowngradeCheckLogic INSTANCE = new LiveMatchFixedDowngradeCheckLogic();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_fixed_downgrade_check_logic", DEFAULT);
    }
}
