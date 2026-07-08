package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "enable_pre_connect_live_domain")
public final class LiveDomainPreConnectSetting {
    public static final SuccessRateOptConfig DEFAULT;
    public static final LiveDomainPreConnectSetting INSTANCE = new LiveDomainPreConnectSetting();
    public static final SuccessRateOptConfig value;

    public final boolean enable() {
        return false;
    }

    static {
        SuccessRateOptConfig successRateOptConfig = new SuccessRateOptConfig(false, false, false);
        DEFAULT = successRateOptConfig;
        value = successRateOptConfig;
    }

    public final boolean enableByPredict() {
        return enable() && value.predictionEnabled;
    }

    public final boolean isAllPreConn() {
        return enable() && value.isAllPreConn;
    }
}
