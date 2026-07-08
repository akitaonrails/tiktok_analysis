package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("game_guessing_v3")
public final class GameGuessingSchemaV3 {
    public static final GameGuessingSchemaV3 INSTANCE = new GameGuessingSchemaV3();
    public static final SchemaData DEFAULT = new SchemaData();

    public final SchemaData getValue() {
        SchemaData schemaData = (SchemaData) SettingsManager.INSTANCE.getValueSafely(GameGuessingSchemaV3.class);
        return schemaData == null ? DEFAULT : schemaData;
    }
}
