package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_linked_guest_cnt_opt")
public final class MultiGuestLinkedGuestCntOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestLinkedGuestCntOptSetting INSTANCE = new MultiGuestLinkedGuestCntOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_linked_guest_cnt_opt", DEFAULT);
    }
}
