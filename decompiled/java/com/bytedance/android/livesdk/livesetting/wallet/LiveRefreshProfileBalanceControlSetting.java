package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_refresh_profile_balance_control")
public final class LiveRefreshProfileBalanceControlSetting {
    public static final int GROUP_NEVER_REFRESH = 0;
    public static final LiveRefreshProfileBalanceControlSetting INSTANCE = new LiveRefreshProfileBalanceControlSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_refresh_profile_balance_control", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getGROUP_NEVER_REFRESH() {
        return GROUP_NEVER_REFRESH;
    }
}
