package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("collaborative_gift_end_asset_timeout_ms")
public final class GiftCollaborateGiftingEndAssetTimeoutSetting {
    public static final GiftCollaborateGiftingEndAssetTimeoutSetting INSTANCE = new GiftCollaborateGiftingEndAssetTimeoutSetting();
    public static final long DEFAULT = Mp4ScreenVideoLoadTimeout.CONTROL;
    public static final long timeoutMs = SettingsManager.INSTANCE.getLongValue("collaborative_gift_end_asset_timeout_ms", Mp4ScreenVideoLoadTimeout.CONTROL);

    public final long getDEFAULT() {
        return DEFAULT;
    }

    public final long getTimeoutMs() {
        return timeoutMs;
    }
}
