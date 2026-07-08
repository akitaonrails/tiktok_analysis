package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ignore_whitebox_enter_report")
public final class LiveWbcSetting {
    public static final boolean DEFAULT = false;
    public static final LiveWbcSetting INSTANCE = new LiveWbcSetting();

    public final boolean enablePassThrough() {
        return !SettingsManager.INSTANCE.getBooleanValue("ignore_whitebox_enter_report", DEFAULT);
    }
}
