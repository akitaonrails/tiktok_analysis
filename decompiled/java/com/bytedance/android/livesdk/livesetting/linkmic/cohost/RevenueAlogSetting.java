package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_revenue_alog_enabled")
public final class RevenueAlogSetting {
    public static final boolean DEFAULT = true;
    public static final RevenueAlogSetting INSTANCE = new RevenueAlogSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_revenue_alog_enabled", DEFAULT);
    }
}
