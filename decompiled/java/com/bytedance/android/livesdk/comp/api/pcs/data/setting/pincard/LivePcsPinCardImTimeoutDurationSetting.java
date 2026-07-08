package com.bytedance.android.livesdk.comp.api.pcs.data.setting.pincard;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pcs_pin_card_im_timeout_duration")
public final class LivePcsPinCardImTimeoutDurationSetting {
    public static final LivePcsPinCardImTimeoutDurationSetting INSTANCE = new LivePcsPinCardImTimeoutDurationSetting();
    public static final long DEFAULT = 10000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_pcs_pin_card_im_timeout_duration", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
