package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("live_message_received_sampling")
public final class LiveMessageReceiveSamplingConfig {
    public static final LiveMessageReceiveTrackConfig DEFAULT;
    public static final LiveMessageReceiveSamplingConfig INSTANCE = new LiveMessageReceiveSamplingConfig();
    public static LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig;

    static {
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig2 = new LiveMessageReceiveTrackConfig(0.0d, 0.0d, null, null, 15, null);
        DEFAULT = liveMessageReceiveTrackConfig2;
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig3 = (LiveMessageReceiveTrackConfig) SettingsManager.INSTANCE.getValueSafely("live_message_received_sampling", liveMessageReceiveTrackConfig2);
        if (liveMessageReceiveTrackConfig3 != null) {
            liveMessageReceiveTrackConfig2 = liveMessageReceiveTrackConfig3;
        }
        liveMessageReceiveTrackConfig = liveMessageReceiveTrackConfig2;
    }

    public final double commonSamplingRate() {
        return liveMessageReceiveTrackConfig.getSamplingRate();
    }

    public final List<String> getAllowedMethods() {
        return liveMessageReceiveTrackConfig.getAllowedMethods();
    }

    public final List<String> getAllowedP2PMethods() {
        return liveMessageReceiveTrackConfig.getAllowedP2PMethods();
    }

    public final double p2pSamplingRate() {
        return liveMessageReceiveTrackConfig.getP2pFullSampling();
    }

    public final LiveMessageReceiveTrackConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveMessageReceiveTrackConfig getValue() {
        return liveMessageReceiveTrackConfig;
    }
}
