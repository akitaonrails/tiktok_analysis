package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_consuming_fun_opt")
public final class LiveConsumingFunOpt {
    public static final LiveConsumingFunOptConfig DEFAULT;
    public static final LiveConsumingFunOpt INSTANCE = new LiveConsumingFunOpt();
    public static final LiveConsumingFunOptConfig _value;

    static {
        LiveConsumingFunOptConfig liveConsumingFunOptConfig = new LiveConsumingFunOptConfig(false, false);
        DEFAULT = liveConsumingFunOptConfig;
        LiveConsumingFunOptConfig liveConsumingFunOptConfig2 = (LiveConsumingFunOptConfig) SettingsManager.INSTANCE.getValueSafely("live_consuming_fun_opt", liveConsumingFunOptConfig);
        if (liveConsumingFunOptConfig2 != null) {
            liveConsumingFunOptConfig = liveConsumingFunOptConfig2;
        }
        _value = liveConsumingFunOptConfig;
    }

    public static final boolean enableInboxCacheOpt() {
        return _value.getInboxCacheOpt();
    }

    public static final boolean enableSettingRawOpt() {
        return _value.getSettingRawOpt();
    }
}
