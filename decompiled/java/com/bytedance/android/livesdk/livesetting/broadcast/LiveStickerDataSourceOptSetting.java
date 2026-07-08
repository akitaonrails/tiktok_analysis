package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_sticker_data_source_opt")
public final class LiveStickerDataSourceOptSetting {
    public static final LiveStickerDataSourceOptSetting INSTANCE = new LiveStickerDataSourceOptSetting();
    public static final int DEFAULT = 0;
    public static final int setting = SettingsManager.INSTANCE.getIntValue("live_sticker_data_source_opt", DEFAULT);

    public final boolean enable() {
        return setting == 1;
    }
}
