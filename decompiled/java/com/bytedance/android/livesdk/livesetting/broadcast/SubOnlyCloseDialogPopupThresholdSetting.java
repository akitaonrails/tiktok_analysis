package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_end_of_live_popup_ignore_times_to_slient")
public final class SubOnlyCloseDialogPopupThresholdSetting {
    public static final int DEFAULT = 0;
    public static final SubOnlyCloseDialogPopupThresholdSetting INSTANCE = new SubOnlyCloseDialogPopupThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("subscription_end_of_live_popup_ignore_times_to_slient", DEFAULT);
    }
}
