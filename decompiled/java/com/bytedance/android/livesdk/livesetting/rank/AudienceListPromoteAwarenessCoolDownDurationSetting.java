package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "audience_list_promote_awareness_cooldown_duration")
public final class AudienceListPromoteAwarenessCoolDownDurationSetting {
    public static final long DEFAULT = 300;
    public static final AudienceListPromoteAwarenessCoolDownDurationSetting INSTANCE = new AudienceListPromoteAwarenessCoolDownDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("audience_list_promote_awareness_cooldown_duration", DEFAULT);
    }
}
