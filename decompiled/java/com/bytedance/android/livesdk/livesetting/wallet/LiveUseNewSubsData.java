package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("use_new_subcription_query_data_structure")
public final class LiveUseNewSubsData {
    public static final boolean DEFAULT = true;
    public static final LiveUseNewSubsData INSTANCE = new LiveUseNewSubsData();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("use_new_subcription_query_data_structure", DEFAULT);
    }
}
