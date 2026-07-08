package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rust_audience_enable_setting")
public final class MtLinkMicRustAudienceSetting {
    public static final boolean DEFAULT = false;
    public static final MtLinkMicRustAudienceSetting INSTANCE = new MtLinkMicRustAudienceSetting();

    public final boolean isAudienceEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_rust_audience_enable_setting", DEFAULT);
    }
}
