package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_entities_iteration_enabled")
public final class PlaybookEntitiesIterationEnabledSetting {
    public static final boolean DEFAULT = true;
    public static final PlaybookEntitiesIterationEnabledSetting INSTANCE = new PlaybookEntitiesIterationEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("playbook_entities_iteration_enabled", DEFAULT);
    }
}
