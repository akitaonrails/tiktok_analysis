package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "widget_batch_unload_opt")
public final class LivePwrOptV3Setting {
    public static final LivePwrOptV3Setting INSTANCE = new LivePwrOptV3Setting();
    public static final BatchUnloadConfig DEFAULT = new BatchUnloadConfig(false, 0, 0, null, false, 0, 0, 0, 0, 511, null);

    public static final boolean enableBatchOpt() {
        return INSTANCE.getConfig().enableBatchOpt;
    }

    public static final boolean enableV2() {
        return INSTANCE.getConfig().enableV2;
    }

    public static final long getBatchMs() {
        return INSTANCE.getConfig().batchMs;
    }

    private final BatchUnloadConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BatchUnloadConfig batchUnloadConfig = DEFAULT;
        BatchUnloadConfig batchUnloadConfig2 = (BatchUnloadConfig) settingsManager.getValueSafely("widget_batch_unload_opt", batchUnloadConfig);
        return batchUnloadConfig2 != null ? batchUnloadConfig2 : batchUnloadConfig;
    }

    public static final List<String> getDynamicWhiteList() {
        return INSTANCE.getConfig().whiteListWidgets;
    }

    public static final int getFirstBatchSize() {
        return INSTANCE.getConfig().firstBatchSize;
    }

    public static final long getLoopInterval() {
        return INSTANCE.getConfig().loopInterval;
    }

    public static final long getMaxDelayMs() {
        return INSTANCE.getConfig().delayMs;
    }

    public static final int getQuickScrollVelocityThreshold() {
        return INSTANCE.getConfig().quickScrollVelocity;
    }

    public static final int getWidgetLoadDelay() {
        return INSTANCE.getConfig().loadDelayInt;
    }
}
