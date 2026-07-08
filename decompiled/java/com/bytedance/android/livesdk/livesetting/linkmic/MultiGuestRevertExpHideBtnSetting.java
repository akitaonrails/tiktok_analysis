package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_revert_exp_hide_btn")
public final class MultiGuestRevertExpHideBtnSetting {
    public static final MultiGuestRevertExpHideBtnSetting INSTANCE = new MultiGuestRevertExpHideBtnSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_revert_exp_hide_btn", DEFAULT);
    }
}
