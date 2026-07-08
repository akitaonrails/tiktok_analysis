package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_opt_effectmanager")
public final class LiveBroadcastEffectManagerOpt {
    public static final OptLiveDownloadResourceConfig DEFAULT;
    public static final LiveBroadcastEffectManagerOpt INSTANCE = new LiveBroadcastEffectManagerOpt();
    public static final OptLiveDownloadResourceConfig value;

    static {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = new OptLiveDownloadResourceConfig();
        DEFAULT = optLiveDownloadResourceConfig;
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig2 = (OptLiveDownloadResourceConfig) SettingsManager.INSTANCE.getValueSafely("live_broadcast_opt_effectmanager", optLiveDownloadResourceConfig);
        if (optLiveDownloadResourceConfig2 != null) {
            optLiveDownloadResourceConfig = optLiveDownloadResourceConfig2;
        }
        value = optLiveDownloadResourceConfig;
    }

    public static final boolean enableLiveEp() {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = value;
        return optLiveDownloadResourceConfig.enable && optLiveDownloadResourceConfig.enableLiveEp;
    }

    public static final boolean enableOptSoundDownload() {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = value;
        return optLiveDownloadResourceConfig.enable && optLiveDownloadResourceConfig.enableOptSoundDownload;
    }

    public static final long epCacheSize() {
        return value.cacheSize * 1048576;
    }

    public static final boolean forbidVoicePreload() {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = value;
        return optLiveDownloadResourceConfig.enable && optLiveDownloadResourceConfig.forbidVoicePreload;
    }

    public static final long usedEffectExpiredTime() {
        return value.usedEffectExpiredTime * 86400000;
    }

    public static final int preloadSize(int i) {
        OptLiveDownloadResourceConfig optLiveDownloadResourceConfig = value;
        int i2 = optLiveDownloadResourceConfig.preloadSize;
        if (1 <= i2 && i2 < i && optLiveDownloadResourceConfig.enable) {
            return i2;
        }
        return i;
    }
}
