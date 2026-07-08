package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enable_persist_game_manual_definition")
public final class EnablePersistGameManualDefinitionSetting {
    public static final int DEFAULT = 0;
    public static final EnablePersistGameManualDefinitionSetting INSTANCE = new EnablePersistGameManualDefinitionSetting();
    public static final int PERSIST = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("enable_persist_game_manual_definition", DEFAULT) == 1;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_persist_game_manual_definition", DEFAULT);
    }
}
