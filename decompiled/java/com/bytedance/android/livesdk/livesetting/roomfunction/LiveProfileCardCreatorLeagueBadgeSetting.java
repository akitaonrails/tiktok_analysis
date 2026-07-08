package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_profile_card_badge_refactorization")
public final class LiveProfileCardCreatorLeagueBadgeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveProfileCardCreatorLeagueBadgeSetting INSTANCE = new LiveProfileCardCreatorLeagueBadgeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_profile_card_badge_refactorization", DEFAULT);
    }
}
