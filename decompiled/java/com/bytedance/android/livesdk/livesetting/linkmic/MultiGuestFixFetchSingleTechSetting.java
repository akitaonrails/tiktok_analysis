package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_fetch_single_tech")
public final class MultiGuestFixFetchSingleTechSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixFetchSingleTechSetting INSTANCE = new MultiGuestFixFetchSingleTechSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_fetch_single_tech", DEFAULT);
    }
}
