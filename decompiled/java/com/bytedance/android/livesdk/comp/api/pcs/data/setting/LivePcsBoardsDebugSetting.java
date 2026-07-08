package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C1338270kvh;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pcs_debug_boards_setting")
public final class LivePcsBoardsDebugSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsBoardsDebugSetting INSTANCE = new LivePcsBoardsDebugSetting();

    private final boolean getValue() {
        if (!SettingsManager.INSTANCE.getBooleanValue("live_pcs_debug_boards_setting", DEFAULT)) {
            return false;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        return false;
    }

    public final boolean isDebugGroup() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
