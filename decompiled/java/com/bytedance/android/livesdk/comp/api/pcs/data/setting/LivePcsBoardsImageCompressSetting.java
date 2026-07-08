package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_pcs_boards_image_compress_setting")
public final class LivePcsBoardsImageCompressSetting {
    public static final LivePcsBoardsImageCompressSetting INSTANCE = new LivePcsBoardsImageCompressSetting();
    public static final int DEFAULT = 100;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_boards_image_compress_setting", DEFAULT);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
