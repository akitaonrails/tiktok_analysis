package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "persist_game_manual_definition_type")
public final class PersistGameManualDefinitionTypeSetting {
    public static final int DEFAULT = 0;
    public static final PersistGameManualDefinitionTypeSetting INSTANCE = new PersistGameManualDefinitionTypeSetting();
    public static final int MEMORY_CACHE = 1;

    public final boolean isDiskCache() {
        return SettingsManager.INSTANCE.getIntValue("persist_game_manual_definition_type", DEFAULT) == 0;
    }

    public final boolean isMemoryCache() {
        return SettingsManager.INSTANCE.getIntValue("persist_game_manual_definition_type", DEFAULT) == 1;
    }
}
