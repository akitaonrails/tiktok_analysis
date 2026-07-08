package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_anchor_ping_push_stream ")
public final class LiveAnchorPingPushStreamSetting {
    public static final LiveAnchorPingPushStreamSetting INSTANCE = new LiveAnchorPingPushStreamSetting();
    public static final LiveAnchorPingPushStreamConfig DEFAULT = new LiveAnchorPingPushStreamConfig(0, false, 0.0f, 0);

    public final LiveAnchorPingPushStreamConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveAnchorPingPushStreamConfig liveAnchorPingPushStreamConfig = DEFAULT;
        LiveAnchorPingPushStreamConfig liveAnchorPingPushStreamConfig2 = (LiveAnchorPingPushStreamConfig) settingsManager.getValueSafely("live_anchor_ping_push_stream ", liveAnchorPingPushStreamConfig);
        return liveAnchorPingPushStreamConfig2 != null ? liveAnchorPingPushStreamConfig2 : liveAnchorPingPushStreamConfig;
    }

    public final float getPingAnchorGap() {
        return getSettingValue().pingAnchorGap;
    }

    public final int getPingAnchorTime() {
        return getSettingValue().pingAnchorTime;
    }

    public final int getPingStreamTryCount() {
        return getSettingValue().pingStreamTryCount;
    }

    public final boolean hasPingStreamEndLiveAlert() {
        return getSettingValue().pingStreamEndLiveAlert;
    }
}
