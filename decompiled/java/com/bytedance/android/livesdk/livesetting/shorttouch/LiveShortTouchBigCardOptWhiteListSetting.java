package com.bytedance.android.livesdk.livesetting.shorttouch;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_short_touch_big_card_optimus_whitelist")
public final class LiveShortTouchBigCardOptWhiteListSetting {
    public static final LiveShortTouchBigCardOptWhiteListSetting INSTANCE = new LiveShortTouchBigCardOptWhiteListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_short_touch_big_card_optimus_whitelist", DEFAULT);
    }

    public static final boolean contains(String str) {
        if (str == null || !LiveShortTouchBigCardOptSetting.INSTANCE.enable() || !C13LQ.LJIILLIIL(str, INSTANCE.getValue())) {
            return false;
        }
        return true;
    }
}
