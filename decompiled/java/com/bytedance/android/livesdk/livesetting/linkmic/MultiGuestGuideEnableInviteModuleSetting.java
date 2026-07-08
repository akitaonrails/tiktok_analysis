package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guide_enable_invite_module")
public final class MultiGuestGuideEnableInviteModuleSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuideEnableInviteModuleSetting INSTANCE = new MultiGuestGuideEnableInviteModuleSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guide_enable_invite_module", DEFAULT);
    }
}
