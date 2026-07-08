package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_multiple_playersetting")
public final class LiveGiftMultiplePlayerSetting {
    public static final LiveGiftMultiplePlayerConfig DEFAULT;
    public static final LiveGiftMultiplePlayerSetting INSTANCE = new LiveGiftMultiplePlayerSetting();
    public static final LiveGiftMultiplePlayerConfig config;

    public static final class LiveGiftMultiplePlayerConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftMultiplePlayerSetting_LiveGiftMultiplePlayerConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("batch_resources_cache_dir")
        public String batchResourcesCacheDir;

        @C09CT("is_enable")
        public boolean isEnable;

        @C09CT("is_enable_mock_videos")
        public boolean isEnableMockVideos;

        @C09CT("is_enable_player_log")
        public boolean isEnablePlayerLog;

        @C09CT("player_preload_threshold_percent")
        public int playerPreloadThresholdPercent;

        @C09CT("player_version")
        public int playerVersion;

        @C09CT("support_video_format")
        public List<String> supportVideoFormats;

        public LiveGiftMultiplePlayerConfig() {
            this(true, false, false, 2, 50, "assets_batch", C1697810uHb.LJIIJJI("h264", "480p"));
        }

        public LiveGiftMultiplePlayerConfig(boolean z, boolean z2, boolean z3, int i, int i2, String str, List<String> list) {
            this.isEnable = z;
            this.isEnablePlayerLog = z2;
            this.isEnableMockVideos = z3;
            this.playerVersion = i;
            this.playerPreloadThresholdPercent = i2;
            this.batchResourcesCacheDir = str;
            this.supportVideoFormats = list;
        }
    }

    static {
        LiveGiftMultiplePlayerConfig liveGiftMultiplePlayerConfig = new LiveGiftMultiplePlayerConfig(true, false, false, 2, 50, "assets_batch", C1697810uHb.LJIIJJI("h264", "480p"));
        DEFAULT = liveGiftMultiplePlayerConfig;
        LiveGiftMultiplePlayerConfig liveGiftMultiplePlayerConfig2 = (LiveGiftMultiplePlayerConfig) SettingsManager.INSTANCE.getValueSafely("live_gift_multiple_playersetting", liveGiftMultiplePlayerConfig);
        if (liveGiftMultiplePlayerConfig2 != null) {
            liveGiftMultiplePlayerConfig = liveGiftMultiplePlayerConfig2;
        }
        config = liveGiftMultiplePlayerConfig;
    }

    public final String getBatchResourcesCacheDir() {
        return config.batchResourcesCacheDir;
    }

    public final int getPlayerPreloadThresholdPercent() {
        return config.playerPreloadThresholdPercent;
    }

    public final List<String> getSupportVideoFormats() {
        return config.supportVideoFormats;
    }

    public final boolean isEnable() {
        return config.isEnable;
    }

    public final boolean isEnableMockVideos() {
        return config.isEnableMockVideos;
    }

    public final boolean isEnablePlayerLog() {
        return config.isEnablePlayerLog;
    }

    public final boolean isPlayerV1() {
        return config.playerVersion == 1;
    }

    public final boolean isPlayerV2() {
        return config.playerVersion == 2;
    }

    public final boolean isPlayerV3() {
        return config.playerVersion == 3;
    }

    public final boolean isTargetVF480p() {
        return config.supportVideoFormats.contains("480p");
    }

    public final boolean isTargetVF480pBvc1() {
        return config.supportVideoFormats.contains("480p_bvc1");
    }

    public final boolean isTargetVFBytevc1() {
        return config.supportVideoFormats.contains("bytevc1");
    }

    public final boolean isTargetVFBytevc1Opt() {
        return config.supportVideoFormats.contains("bytevc1opt");
    }

    public final boolean isTargetVFCropBvc1() {
        return config.supportVideoFormats.contains("crop_bvc1");
    }

    public final boolean isTargetVFH264() {
        return config.supportVideoFormats.contains("h264");
    }

    public final boolean isTargetVFTrantor() {
        return config.supportVideoFormats.contains("trantor_bvc1");
    }

    public final boolean isTargetVFTrantorCrop() {
        return config.supportVideoFormats.contains("trantor_crop_bvc1");
    }

    public final LiveGiftMultiplePlayerConfig getDEFAULT() {
        return DEFAULT;
    }
}
