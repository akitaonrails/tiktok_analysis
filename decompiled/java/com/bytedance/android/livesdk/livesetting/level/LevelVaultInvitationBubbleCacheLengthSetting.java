package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_vault_invitation_cache_length")
public final class LevelVaultInvitationBubbleCacheLengthSetting {
    public static final int DEFAULT = 70;
    public static final LevelVaultInvitationBubbleCacheLengthSetting INSTANCE = new LevelVaultInvitationBubbleCacheLengthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_vault_invitation_cache_length", DEFAULT);
    }
}
