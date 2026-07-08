package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("revenue_avoid_cohost_close_when_mg_disable")
public final class RevenueAvoidCohostCloseWhenMGDisable {
    public static final boolean DEFAULT = true;
    public static final RevenueAvoidCohostCloseWhenMGDisable INSTANCE = new RevenueAvoidCohostCloseWhenMGDisable();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("revenue_avoid_cohost_close_when_mg_disable", DEFAULT);
    }
}
