package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_dialog_leak")
public final class MultiGuestFixDialogLeakSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixDialogLeakSetting INSTANCE = new MultiGuestFixDialogLeakSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_dialog_leak", DEFAULT);
    }
}
