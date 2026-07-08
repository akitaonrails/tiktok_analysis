package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_zero_claim_fix")
public final class FansClubZeroClaimAnimFixSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubZeroClaimAnimFixSetting INSTANCE = new FansClubZeroClaimAnimFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_zero_claim_fix", DEFAULT);
    }
}
