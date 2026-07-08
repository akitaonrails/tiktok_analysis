package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ai_live_summary")
public final class AiLiveSummarySetting {
    public static final boolean DEFAULT = false;
    public static final AiLiveSummarySetting INSTANCE = new AiLiveSummarySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ai_live_summary", DEFAULT);
    }
}
