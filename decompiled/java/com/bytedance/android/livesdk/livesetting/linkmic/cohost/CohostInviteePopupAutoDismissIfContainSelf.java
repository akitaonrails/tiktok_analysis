package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_auto_dismiss_invitee_pop_up_if_contain_self")
public final class CohostInviteePopupAutoDismissIfContainSelf {
    public static final boolean DEFAULT = true;
    public static final CohostInviteePopupAutoDismissIfContainSelf INSTANCE = new CohostInviteePopupAutoDismissIfContainSelf();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_auto_dismiss_invitee_pop_up_if_contain_self", DEFAULT);
    }
}
