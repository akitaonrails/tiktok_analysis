package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guide_enable_invite_component")
public final class MultiGuestGuideEnableInviteComponentSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestGuideEnableInviteComponentSetting INSTANCE = new MultiGuestGuideEnableInviteComponentSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guide_enable_invite_component", DEFAULT);
    }
}
