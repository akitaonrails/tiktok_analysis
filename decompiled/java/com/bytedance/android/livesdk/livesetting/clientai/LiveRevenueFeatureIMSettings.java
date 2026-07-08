package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_revenue_feature_im_config")
public final class LiveRevenueFeatureIMSettings {
    public static final LiveRevenueFeatureIMSettings INSTANCE = new LiveRevenueFeatureIMSettings();
    public static final ImConfig DEFAULT = new ImConfig(false, 0, null, false, null, 31, null);

    private final ImConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ImConfig imConfig = DEFAULT;
        ImConfig imConfig2 = (ImConfig) settingsManager.getValueSafely("live_revenue_feature_im_config", imConfig);
        return imConfig2 != null ? imConfig2 : imConfig;
    }

    public final long frequencyMs() {
        return ((long) getConfig().frequency) * 1000;
    }

    public final List<String> imList() {
        return getConfig().enableList;
    }

    public final List<String> noFreqList() {
        return getConfig().imNoFreqAllowList;
    }

    public final boolean enabled(boolean z) {
        if (!z) {
            return getConfig().enable;
        }
        if (getConfig().enable && getConfig().anchorSideEnable) {
            return true;
        }
        return false;
    }
}
