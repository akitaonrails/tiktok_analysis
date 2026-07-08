package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_disable_alpha_change_for_battle_start")
public final class CohostWithGuestDisableAlphaChangeForBattleStart {
    public static final CohostWithGuestDisableAlphaChangeForBattleStart INSTANCE = new CohostWithGuestDisableAlphaChangeForBattleStart();
    public static final int DEFAULT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_with_guest_disable_alpha_change_for_battle_start", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
