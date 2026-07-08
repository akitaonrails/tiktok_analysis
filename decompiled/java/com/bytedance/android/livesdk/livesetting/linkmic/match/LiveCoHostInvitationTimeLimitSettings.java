package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_invitation_text_status_group")
public final class LiveCoHostInvitationTimeLimitSettings {
    public static final int DEFAULT = 2;
    public static final LiveCoHostInvitationTimeLimitSettings INSTANCE = new LiveCoHostInvitationTimeLimitSettings();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_invitation_text_status_group", DEFAULT);
    }

    public final boolean blockThisLive() {
        return getValue() == 1;
    }

    public final boolean optionMerged() {
        return getValue() >= 1;
    }

    public final boolean timeLimited() {
        return getValue() == 2;
    }
}
