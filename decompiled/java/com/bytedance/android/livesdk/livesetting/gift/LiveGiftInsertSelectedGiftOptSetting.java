package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_insert_selected_gift_opt")
public final class LiveGiftInsertSelectedGiftOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftInsertSelectedGiftOptSetting INSTANCE = new LiveGiftInsertSelectedGiftOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_insert_selected_gift_opt", DEFAULT);
    }
}
