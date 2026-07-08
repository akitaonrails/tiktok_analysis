package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_use_guest_request_id_opt")
public final class MultiTopLiveUseGuestRequestIdOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveUseGuestRequestIdOptSetting INSTANCE = new MultiTopLiveUseGuestRequestIdOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_use_guest_request_id_opt", DEFAULT);
    }
}
