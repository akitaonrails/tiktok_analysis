package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "audience_list_promote_awareness_type")
public final class AudienceListPromoteAwarenessTypeSetting {
    public static final int DEFAULT = 0;
    public static final AudienceListPromoteAwarenessTypeSetting INSTANCE = new AudienceListPromoteAwarenessTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("audience_list_promote_awareness_type", DEFAULT);
    }

    public final boolean enableCoolDown() {
        return getValue() >= 3;
    }

    public final boolean enablePromote() {
        return getValue() > 0;
    }
}
