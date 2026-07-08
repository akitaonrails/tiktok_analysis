package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_pipo_host")
public final class LivePipoHostSetting {
    public static final String DEFAULT = "";
    public static final LivePipoHostSetting INSTANCE = new LivePipoHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_pipo_host", DEFAULT);
    }
}
