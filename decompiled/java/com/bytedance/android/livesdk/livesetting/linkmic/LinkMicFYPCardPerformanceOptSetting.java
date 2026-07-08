package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_fyp_card_performance_opt")
public final class LinkMicFYPCardPerformanceOptSetting {
    public static final LinkMicFYPCardPerformanceOptSetting INSTANCE = new LinkMicFYPCardPerformanceOptSetting();
    public static final FypCardOptSetting DEFAULT = new FypCardOptSetting(false, false, false, false, 300, false, 6.0f);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(99));

    private final FypCardOptSetting getValue() {
        return (FypCardOptSetting) value$delegate.getValue();
    }

    public final boolean asyncPreloadOptEnable() {
        return getValue().asyncPreloadOptEnable;
    }

    public final long getCacheExpireTime() {
        return getValue().cacheExpireTime;
    }

    public final boolean layoutOptEnable() {
        return getValue().layoutOptEnable;
    }

    public final boolean preloadOptEnable() {
        return getValue().preloadOptEnable;
    }

    public final boolean pullPreloadOptEnable() {
        return getValue().pullPreloadOptEnable;
    }

    public final boolean isHitLowPerformanceAnimateOpt(float f) {
        if (getValue().lowPerformanceAnimateOptEnable && f > 0.0f && f <= getValue().lowPerformanceScore) {
            return true;
        }
        return false;
    }
}
