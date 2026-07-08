package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_pre_invite_guest_params_enable")
public final class MultiGuestPreInviteGuestParamsEnableSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPreInviteGuestParamsEnableSetting INSTANCE = new MultiGuestPreInviteGuestParamsEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_pre_invite_guest_params_enable", DEFAULT);
    }
}
