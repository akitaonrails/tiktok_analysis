package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_invite_mock")
public final class LiveMatchInviteMockSetting {
    public static final LiveMatchInviteMockSetting INSTANCE = new LiveMatchInviteMockSetting();
    public static final LiveMatchInviteMockConfig DEFAULT = new LiveMatchInviteMockConfig(false, false, false);

    public final LiveMatchInviteMockConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchInviteMockConfig liveMatchInviteMockConfig = DEFAULT;
        LiveMatchInviteMockConfig liveMatchInviteMockConfig2 = (LiveMatchInviteMockConfig) settingsManager.getValueSafely("live_match_invite_mock", liveMatchInviteMockConfig);
        return liveMatchInviteMockConfig2 != null ? liveMatchInviteMockConfig2 : liveMatchInviteMockConfig;
    }

    public final boolean isDuplicateInviteEnabled() {
        return getConfig().duplicateInvite;
    }

    public final boolean isOrphanBattleEnabled() {
        return getConfig().orphanBattle;
    }

    public final boolean isVmClearedEnabled() {
        return getConfig().vmCleared;
    }
}
