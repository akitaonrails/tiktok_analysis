package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("game_guessing")
public final class GameGuessingSchema {
    public static final GameGuessingSchema INSTANCE = new GameGuessingSchema();
    public static final SchemaData DEFAULT = new SchemaData();

    public final SchemaData getValue() {
        SchemaData schemaData = (SchemaData) SettingsManager.INSTANCE.getValueSafely(GameGuessingSchema.class);
        return schemaData == null ? DEFAULT : schemaData;
    }
}
