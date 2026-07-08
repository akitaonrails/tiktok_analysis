package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_safe_cancel_subscribe_animator_set")
public final class LiveFansClubAnimationProtectionSetting {
    public static final int DEFAULT = 1;
    public static final LiveFansClubAnimationProtectionSetting INSTANCE = new LiveFansClubAnimationProtectionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_fans_club_safe_cancel_subscribe_animator_set", DEFAULT);
    }

    public final boolean changeAnimationOrder() {
        return getValue() == 3;
    }

    public final boolean enableCatch() {
        return getValue() == 2;
    }

    public final boolean safeCancelAnimatorSet() {
        return getValue() == 1;
    }
}
