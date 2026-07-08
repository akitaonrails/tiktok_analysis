package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rust_live_studio_audience")
public final class MtLinkMicRustLiveStudioAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final MtLinkMicRustLiveStudioAudienceSetting INSTANCE = new MtLinkMicRustLiveStudioAudienceSetting();

    public static final boolean isLinkerEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_rust_live_studio_audience", DEFAULT);
    }
}
