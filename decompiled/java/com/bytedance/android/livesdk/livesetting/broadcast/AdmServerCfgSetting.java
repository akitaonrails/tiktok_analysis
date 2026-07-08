package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("adm_server_cfg")
public final class AdmServerCfgSetting {
    public static final String DEFAULT = "";
    public static final AdmServerCfgSetting INSTANCE = new AdmServerCfgSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("adm_server_cfg", DEFAULT);
    }
}
