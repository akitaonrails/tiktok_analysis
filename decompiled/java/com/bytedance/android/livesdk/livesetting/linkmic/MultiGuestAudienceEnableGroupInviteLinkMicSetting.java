package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_enable_group_push_add_linkmic_action")
public final class MultiGuestAudienceEnableGroupInviteLinkMicSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestAudienceEnableGroupInviteLinkMicSetting INSTANCE = new MultiGuestAudienceEnableGroupInviteLinkMicSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_enable_group_push_add_linkmic_action", DEFAULT);
    }
}
