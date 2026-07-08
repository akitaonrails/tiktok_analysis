package com.bytedance.android.livesdk.setting;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "load_more_retry_setting")
public final class LoadMoreRetrySetting {
    public static final LoadMoreRetryConfig DEFAULT;
    public static final LoadMoreRetrySetting INSTANCE = new LoadMoreRetrySetting();
    public static final LoadMoreRetryConfig config;

    static {
        LoadMoreRetryConfig loadMoreRetryConfig = new LoadMoreRetryConfig(false, C1697810uHb.LJIIJJI("homepage_hot_live_cell", "homepage_hot_video_head"), false, false, 0, 0L, 0, 0L, false, 0L);
        DEFAULT = loadMoreRetryConfig;
        LoadMoreRetryConfig loadMoreRetryConfig2 = (LoadMoreRetryConfig) SettingsManager.INSTANCE.getValueSafely("load_more_retry_setting", loadMoreRetryConfig);
        if (loadMoreRetryConfig2 != null) {
            loadMoreRetryConfig = loadMoreRetryConfig2;
        }
        config = loadMoreRetryConfig;
    }

    public final long backupDataDelay() {
        return config.backupDataDelay;
    }

    public final boolean expandParams() {
        return config.expandParams;
    }

    public final int minNetworkQuality() {
        return config.minNetworkQuality;
    }

    public final int retryCount() {
        return config.retryCount;
    }

    public final long retryInterval() {
        return config.retryInterval;
    }

    public final boolean retryWhenTimeout() {
        return config.retryWhenTimeout;
    }

    public final long timeout() {
        return config.timeout;
    }

    public final boolean useBackupData() {
        return config.useBackupData;
    }

    public final LoadMoreRetryConfig getConfig() {
        return config;
    }

    public final boolean enable(String str) {
        LoadMoreRetryConfig loadMoreRetryConfig = config;
        if (loadMoreRetryConfig.enable) {
            if (loadMoreRetryConfig.entrances.isEmpty() || loadMoreRetryConfig.entrances.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
