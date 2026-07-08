package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_auction_da_info_tracking_enable")
public final class LiveAuctionDaInfoTrackingEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveAuctionDaInfoTrackingEnableSetting INSTANCE = new LiveAuctionDaInfoTrackingEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_auction_da_info_tracking_enable", DEFAULT);
    }
}
