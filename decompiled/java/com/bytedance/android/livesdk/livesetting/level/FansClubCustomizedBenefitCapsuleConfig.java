package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("fans_club_customized_benefit_capsule_config")
public final class FansClubCustomizedBenefitCapsuleConfig {
    public static final int DEFAULT = 3;
    public static final FansClubCustomizedBenefitCapsuleConfig INSTANCE = new FansClubCustomizedBenefitCapsuleConfig();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fans_club_customized_benefit_capsule_config", DEFAULT);
    }
}
