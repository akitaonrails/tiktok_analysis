package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_toolbar_tips_check_short_interval")
public final class LiveToolbarTipsHandlerCheckShortIntervalRequestSetting {
    public static final boolean DEFAULT = false;
    public static final LiveToolbarTipsHandlerCheckShortIntervalRequestSetting INSTANCE = new LiveToolbarTipsHandlerCheckShortIntervalRequestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toolbar_tips_check_short_interval", DEFAULT);
    }
}
