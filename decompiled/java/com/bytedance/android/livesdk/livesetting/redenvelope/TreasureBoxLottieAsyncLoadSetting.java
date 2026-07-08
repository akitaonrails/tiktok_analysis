package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_treasure_box_push_into_lottie_async_load_enable")
public final class TreasureBoxLottieAsyncLoadSetting {
    public static final boolean DEFAULT = false;
    public static final TreasureBoxLottieAsyncLoadSetting INSTANCE = new TreasureBoxLottieAsyncLoadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_treasure_box_push_into_lottie_async_load_enable", DEFAULT);
    }
}
