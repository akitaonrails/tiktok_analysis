package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mult_guest_downgrade_disable_avatar")
public final class MultGuestDowngradeDisableAavatarSetting {
    public static final boolean DEFAULT = true;
    public static final MultGuestDowngradeDisableAavatarSetting INSTANCE = new MultGuestDowngradeDisableAavatarSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mult_guest_downgrade_disable_avatar", DEFAULT);
    }
}
