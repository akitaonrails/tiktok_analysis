package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_match_invite_creator_num_change_config")
public final class LiveMatchInvite4029011FixSetting {
    public static final LiveMatchInvite4029011FixSetting INSTANCE = new LiveMatchInvite4029011FixSetting();
    public static final LiveMatchInvite4029011FixData DEFAULT = new LiveMatchInvite4029011FixData(false, 1500);

    public final LiveMatchInvite4029011FixData getValue() {
        LiveMatchInvite4029011FixData liveMatchInvite4029011FixData = (LiveMatchInvite4029011FixData) SettingsManager.INSTANCE.getValueSafely(LiveMatchInvite4029011FixSetting.class);
        return liveMatchInvite4029011FixData == null ? DEFAULT : liveMatchInvite4029011FixData;
    }

    public final long getDelayMs() {
        long j = getValue().delay;
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    public final boolean isEnabled() {
        return getValue().enabled;
    }

    public final LiveMatchInvite4029011FixData getDEFAULT() {
        return DEFAULT;
    }
}
