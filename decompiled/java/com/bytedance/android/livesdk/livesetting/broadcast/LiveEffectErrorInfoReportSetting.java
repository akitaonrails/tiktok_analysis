package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_effect_errorinfo_report")
public final class LiveEffectErrorInfoReportSetting {
    public static final int DEFAULT = 0;
    public static final LiveEffectErrorInfoReportSetting INSTANCE = new LiveEffectErrorInfoReportSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("enable_effect_errorinfo_report", DEFAULT) > 0;
    }
}
