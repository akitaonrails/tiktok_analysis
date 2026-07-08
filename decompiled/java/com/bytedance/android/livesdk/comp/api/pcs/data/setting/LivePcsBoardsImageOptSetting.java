package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_pcs_boards_image_opt_setting")
public final class LivePcsBoardsImageOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsBoardsImageOptSetting INSTANCE = new LivePcsBoardsImageOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_boards_image_opt_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
