package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_companion_invite_diagnosis_enable")
public final class LiveCompanionInviteDiagnosisEnableSetting {
    public static final LiveCompanionInviteDiagnosisEnableSetting INSTANCE = new LiveCompanionInviteDiagnosisEnableSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_companion_invite_diagnosis_enable", DEFAULT);
    }
}
