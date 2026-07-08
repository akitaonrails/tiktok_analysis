package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_invitee_cohost_list_remove_main_inviter")
public final class CohostWithGuestPhase2InviteeCohostListRemoveMainInviter {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestPhase2InviteeCohostListRemoveMainInviter INSTANCE = new CohostWithGuestPhase2InviteeCohostListRemoveMainInviter();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_phase2_invitee_cohost_list_remove_main_inviter", DEFAULT);
    }
}
