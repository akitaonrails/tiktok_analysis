package com.bytedance.android.livesdk.livesetting.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlivesdk_pcs_event_dm_list")
public final class TTLivePcsEventDMListSetting {
    public static final TTLivePcsEventDMListSetting INSTANCE = new TTLivePcsEventDMListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("ttlivesdk_pcs_event_dm_list", DEFAULT);
    }
}
