package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("board_dsl_enabled_min_version")
public final class BoardDslEnabledMinVersionSetting {
    public static final int DEFAULT = 0;
    public static final BoardDslEnabledMinVersionSetting INSTANCE = new BoardDslEnabledMinVersionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("board_dsl_enabled_min_version", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
