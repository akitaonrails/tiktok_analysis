package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("is_match_count_down_invitee_fix_enable")
public final class LiveMatchCountDownInviteeFixEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchCountDownInviteeFixEnableSetting INSTANCE = new LiveMatchCountDownInviteeFixEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("is_match_count_down_invitee_fix_enable", DEFAULT);
    }
}
