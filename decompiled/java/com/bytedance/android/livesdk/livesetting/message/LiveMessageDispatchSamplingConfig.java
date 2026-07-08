package com.bytedance.android.livesdk.livesetting.message;

import X.C001A;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("live_message_dispatch_sampling")
public final class LiveMessageDispatchSamplingConfig {
    public static final LiveIMMessageTrackConfig DEFAULT;
    public static final LiveMessageDispatchSamplingConfig INSTANCE = new LiveMessageDispatchSamplingConfig();
    public static LiveIMMessageTrackConfig liveIMMessageTrackConfig;

    static {
        LiveIMMessageTrackConfig liveIMMessageTrackConfig2 = new LiveIMMessageTrackConfig(1.0E-4d, 1.0d, C1697810uHb.LJIIJJI(C001A.GIFT.wsMethod, C001A.DOODLE_GIFT.wsMethod, C001A.FREE_CELL_GIFT_MESSAGE.wsMethod, C001A.ASSET_MESSAGE.wsMethod, C001A.BINDING_GIFT_MESSAGE.wsMethod, C001A.TRAY_MESSAGE.wsMethod, C001A.GIFT_GLOBAL_MESSAGE.wsMethod), C1697810uHb.LJIIJJI(C001A.LINK_MIC.wsMethod, C001A.LINK_MESSAGE.wsMethod));
        DEFAULT = liveIMMessageTrackConfig2;
        LiveIMMessageTrackConfig liveIMMessageTrackConfig3 = (LiveIMMessageTrackConfig) SettingsManager.INSTANCE.getValueSafely("live_message_dispatch_sampling", liveIMMessageTrackConfig2);
        if (liveIMMessageTrackConfig3 != null) {
            liveIMMessageTrackConfig2 = liveIMMessageTrackConfig3;
        }
        liveIMMessageTrackConfig = liveIMMessageTrackConfig2;
    }

    public final double commonSamplingRate() {
        return liveIMMessageTrackConfig.getSamplingRate();
    }

    public final List<String> getAllowedMethods() {
        return liveIMMessageTrackConfig.getAllowedMethods();
    }

    public final List<String> getAllowedP2PMethods() {
        return liveIMMessageTrackConfig.getAllowedP2PMethods();
    }

    public final double p2pSamplingRate() {
        return liveIMMessageTrackConfig.getP2pFullSampling();
    }

    public final LiveIMMessageTrackConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveIMMessageTrackConfig getValue() {
        return liveIMMessageTrackConfig;
    }
}
