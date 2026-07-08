package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_both_guest_cnt_opt")
public final class LiveMultiBothGuestCntOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMultiBothGuestCntOptSetting INSTANCE = new LiveMultiBothGuestCntOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_multi_both_guest_cnt_opt", DEFAULT);
    }
}
