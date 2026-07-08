package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_invite_4004049_fix")
public final class LiveMatchInvite4004049FixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchInvite4004049FixSetting INSTANCE = new LiveMatchInvite4004049FixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_invite_4004049_fix", DEFAULT);
    }
}
