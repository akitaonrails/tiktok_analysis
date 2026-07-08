package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_enable_invite_list_switch_by_capsule")
public final class MultiGuestEnableInviteListSwitchByCapsuleSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestEnableInviteListSwitchByCapsuleSetting INSTANCE = new MultiGuestEnableInviteListSwitchByCapsuleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_enable_invite_list_switch_by_capsule", DEFAULT);
    }
}
