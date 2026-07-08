package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pcs_font_download_on_demand")
public final class LivePcsFontDownloadOnDemandSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsFontDownloadOnDemandSetting INSTANCE = new LivePcsFontDownloadOnDemandSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_font_download_on_demand", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
