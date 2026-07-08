package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_treasure_box_push_into_lottie_enable")
public final class TreasureBoxPushIntoUIUpdate {
    public static final boolean DEFAULT = false;
    public static final TreasureBoxPushIntoUIUpdate INSTANCE = new TreasureBoxPushIntoUIUpdate();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_treasure_box_push_into_lottie_enable", DEFAULT);
    }
}
