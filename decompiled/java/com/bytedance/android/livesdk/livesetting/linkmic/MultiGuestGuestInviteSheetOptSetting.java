package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guest_invite_sheet_opt")
public final class MultiGuestGuestInviteSheetOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuestInviteSheetOptSetting INSTANCE = new MultiGuestGuestInviteSheetOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guest_invite_sheet_opt", DEFAULT);
    }
}
