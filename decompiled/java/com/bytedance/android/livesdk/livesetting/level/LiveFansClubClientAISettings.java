package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_guide_client_ai_settings")
public final class LiveFansClubClientAISettings {
    public static final FansClubGuideClientAI DEFAULT;
    public static final LiveFansClubClientAISettings INSTANCE = new LiveFansClubClientAISettings();
    public static final FansClubGuideClientAI value;

    static {
        FansClubGuideClientAI fansClubGuideClientAI = new FansClubGuideClientAI(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        DEFAULT = fansClubGuideClientAI;
        FansClubGuideClientAI fansClubGuideClientAI2 = (FansClubGuideClientAI) SettingsManager.INSTANCE.getValueSafely("live_fans_club_guide_client_ai_settings", fansClubGuideClientAI);
        if (fansClubGuideClientAI2 != null) {
            fansClubGuideClientAI = fansClubGuideClientAI2;
        }
        value = fansClubGuideClientAI;
    }

    public final FansClubGuideClientAI getDEFAULT() {
        return DEFAULT;
    }

    public final FansClubGuideClientAI getValue() {
        return value;
    }
}
