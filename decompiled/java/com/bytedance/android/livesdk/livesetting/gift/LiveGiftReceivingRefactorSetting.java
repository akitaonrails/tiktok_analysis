package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_receiving_refactor")
public final class LiveGiftReceivingRefactorSetting {
    public static final LiveGiftReceivingRefactorConfig DEFAULT;
    public static final LiveGiftReceivingRefactorSetting INSTANCE = new LiveGiftReceivingRefactorSetting();
    public static final LiveGiftReceivingRefactorConfig config;

    static {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = new LiveGiftReceivingRefactorConfig(false, true, true, true, true, true, true, true, true, true, 800, 400, 200L, 100);
        DEFAULT = liveGiftReceivingRefactorConfig;
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig2 = (LiveGiftReceivingRefactorConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftReceivingRefactorSetting.class);
        if (liveGiftReceivingRefactorConfig2 != null) {
            liveGiftReceivingRefactorConfig = liveGiftReceivingRefactorConfig2;
        }
        config = liveGiftReceivingRefactorConfig;
    }

    public final long insertionInterval() {
        return config.insertionInterval;
    }

    public final boolean isAsyncQueue() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isAsyncQueue;
    }

    public final boolean isEnable() {
        return config.isEnable;
    }

    public final boolean isEnableCacheThreadSafe() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isCacheThreadSafe;
    }

    public final boolean isEnableQueue() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isEnableQueue;
    }

    public final boolean isEnableWidget() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isEnableWidget;
    }

    public final boolean isForceUpdateAsset() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isForceUpdateAsset;
    }

    public final boolean isOptBadgeProcess() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isOptBadgeProcess;
    }

    public final boolean isOptBundleAssets() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isOptBundleAssets;
    }

    public final boolean isOptComboEnd() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isOptComboEnd;
    }

    public final boolean isOptDirectShow() {
        LiveGiftReceivingRefactorConfig liveGiftReceivingRefactorConfig = config;
        return liveGiftReceivingRefactorConfig.isEnable && liveGiftReceivingRefactorConfig.isOptDirectShow;
    }

    public final int lowPriceThreshold() {
        return config.lowPriceThreshold;
    }

    public final int maxMusicRenderLength() {
        return config.maxMusicRenderLength;
    }

    public final int maxStickerRenderLength() {
        return config.maxStickerRenderLength;
    }

    public final LiveGiftReceivingRefactorConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class LiveGiftReceivingRefactorConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftReceivingRefactorSetting_LiveGiftReceivingRefactorConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("insertion_interval")
        public long insertionInterval;

        @C09CT("is_async_queue")
        public boolean isAsyncQueue;

        @C09CT("is_cache_thread_safe")
        public boolean isCacheThreadSafe;

        @C09CT("is_enable")
        public boolean isEnable;

        @C09CT("is_queue")
        public boolean isEnableQueue;

        @C09CT("is_widget")
        public boolean isEnableWidget;

        @C09CT("is_force_update_asset")
        public boolean isForceUpdateAsset;

        @C09CT("is_opt_badge_process")
        public boolean isOptBadgeProcess;

        @C09CT("is_opt_bundle_assets")
        public boolean isOptBundleAssets;

        @C09CT("is_opt_combo_end")
        public boolean isOptComboEnd;

        @C09CT("is_opt_direct_show")
        public boolean isOptDirectShow;

        @C09CT("low_price_threshold")
        public int lowPriceThreshold;

        @C09CT("max_music_render_length")
        public int maxMusicRenderLength;

        @C09CT("max_sticker_render_length")
        public int maxStickerRenderLength;

        public LiveGiftReceivingRefactorConfig() {
            this(false, true, true, true, true, true, true, true, true, true, 800, 400, 200L, 100);
        }

        public LiveGiftReceivingRefactorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, int i2, long j, int i3) {
            this.isEnable = z;
            this.isEnableWidget = z2;
            this.isEnableQueue = z3;
            this.isCacheThreadSafe = z4;
            this.isOptBundleAssets = z5;
            this.isOptBadgeProcess = z6;
            this.isOptDirectShow = z7;
            this.isOptComboEnd = z8;
            this.isAsyncQueue = z9;
            this.isForceUpdateAsset = z10;
            this.maxStickerRenderLength = i;
            this.maxMusicRenderLength = i2;
            this.insertionInterval = j;
            this.lowPriceThreshold = i3;
        }
    }
}
