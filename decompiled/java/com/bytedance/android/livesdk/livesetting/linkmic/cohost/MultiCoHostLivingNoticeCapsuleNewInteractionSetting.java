package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "living_notice_capsule_new_interaction")
public final class MultiCoHostLivingNoticeCapsuleNewInteractionSetting {
    public static final boolean DEFAULT = false;
    public static final MultiCoHostLivingNoticeCapsuleNewInteractionSetting INSTANCE = new MultiCoHostLivingNoticeCapsuleNewInteractionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("living_notice_capsule_new_interaction", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
