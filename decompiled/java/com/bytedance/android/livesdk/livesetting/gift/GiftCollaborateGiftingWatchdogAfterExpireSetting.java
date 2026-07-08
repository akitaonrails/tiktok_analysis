package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("collaborative_gift_watchdog_after_expire_ms")
public final class GiftCollaborateGiftingWatchdogAfterExpireSetting {
    public static final GiftCollaborateGiftingWatchdogAfterExpireSetting INSTANCE = new GiftCollaborateGiftingWatchdogAfterExpireSetting();
    public static final long DEFAULT = Mp4ScreenVideoLoadTimeout.CONTROL;
    public static final long expireMs = SettingsManager.INSTANCE.getLongValue("collaborative_gift_watchdog_after_expire_ms", Mp4ScreenVideoLoadTimeout.CONTROL);

    public final long getDEFAULT() {
        return DEFAULT;
    }

    public final long getExpireMs() {
        return expireMs;
    }
}
