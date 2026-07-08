package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_toplive_bubble_track")
public final class ReportLiveBubbleDataSetting {
    public static final boolean DEFAULT = true;
    public static final ReportLiveBubbleDataSetting INSTANCE = new ReportLiveBubbleDataSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toplive_bubble_track", DEFAULT);
    }
}
