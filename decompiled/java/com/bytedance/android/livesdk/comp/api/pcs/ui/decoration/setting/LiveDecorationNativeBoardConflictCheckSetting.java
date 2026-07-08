package com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_decoration_native_board_conflict_check")
public final class LiveDecorationNativeBoardConflictCheckSetting {
    public static final boolean DEFAULT = false;
    public static final LiveDecorationNativeBoardConflictCheckSetting INSTANCE = new LiveDecorationNativeBoardConflictCheckSetting();
    public static final boolean ENABLE = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_decoration_native_board_conflict_check", DEFAULT);
    }
}
