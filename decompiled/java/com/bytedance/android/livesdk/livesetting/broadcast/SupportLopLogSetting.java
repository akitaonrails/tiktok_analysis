package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("support_lop_log_report")
public final class SupportLopLogSetting {
    public static final SupportLopLogSetting INSTANCE = new SupportLopLogSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("support_lop_log_report", DEFAULT);
    }
}
