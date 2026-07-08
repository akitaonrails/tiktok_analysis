package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_meanwhile_invite_fix")
public final class LiveMatchMeanwhileInviteFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchMeanwhileInviteFixSetting INSTANCE = new LiveMatchMeanwhileInviteFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_meanwhile_invite_fix", DEFAULT);
    }
}
