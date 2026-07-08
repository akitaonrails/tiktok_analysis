package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("pcs_service_plus_alog_enable")
public final class PcsServicePlusALogEnableSetting {
    public static final boolean DEFAULT = true;
    public static final PcsServicePlusALogEnableSetting INSTANCE = new PcsServicePlusALogEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("pcs_service_plus_alog_enable", DEFAULT);
    }
}
