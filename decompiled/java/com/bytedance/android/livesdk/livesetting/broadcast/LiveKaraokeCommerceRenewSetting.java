package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_commerce_renew")
public final class LiveKaraokeCommerceRenewSetting {
    public static final boolean DEFAULT = false;
    public static final LiveKaraokeCommerceRenewSetting INSTANCE = new LiveKaraokeCommerceRenewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_karaoke_commerce_renew", DEFAULT);
    }
}
