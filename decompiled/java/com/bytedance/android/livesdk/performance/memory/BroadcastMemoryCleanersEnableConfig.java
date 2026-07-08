package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class BroadcastMemoryCleanersEnableConfig {
    public static final TypeAdapter ADAPTER = new BroadcastMemoryCleanersEnableConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("clear_effect_aes_cache_level")
    public int clearEffectAesCacheLevel;

    @C09CT("clear_effect_channel_cache_level")
    public int clearEffectChannelCacheLevel;

    @C09CT("clear_model_config_arbiter_cache_level")
    public int clearModelConfigArbiterCacheLevel;

    @C09CT("clear_sticker_view_model_cache_level")
    public int clearStickerViewModelCacheLevel;

    @C09CT("enable_clear_camera_filter_cache")
    public boolean enableClearCameraFilterCache;

    @C09CT("enable_clear_live_center_cache")
    public boolean enableClearLiveCenterCache;

    @C09CT("enable_clear_multi_guest_cache")
    public int enableClearMultiGuestCache;

    @C09CT("enable_clear_net_data_pipeline_cache")
    public int enableClearNetDataPipelineCache;

    @C09CT("enable_clear_search_cache")
    public int enableClearSearchCache;

    @C09CT("enable_finish_non_essential_pages")
    public boolean enableFinishNonEssentialPages;

    @C09CT("enable_notify_mem_relief")
    public int enableNotifyMemRelief;

    @C09CT("enable_preload_after_live")
    public boolean enablePreloadAfterLive;

    public BroadcastMemoryCleanersEnableConfig() {
        this(false, 0, false, 0, 0, 0, false, 0, 0, 0, 0, false);
    }

    public final int getClearEffectAesCacheLevel() {
        return this.clearEffectAesCacheLevel;
    }

    public final int getClearEffectChannelCacheLevel() {
        return this.clearEffectChannelCacheLevel;
    }

    public final int getClearModelConfigArbiterCacheLevel() {
        return this.clearModelConfigArbiterCacheLevel;
    }

    public final int getClearStickerViewModelCacheLevel() {
        return this.clearStickerViewModelCacheLevel;
    }

    public final boolean getEnableClearCameraFilterCache() {
        return this.enableClearCameraFilterCache;
    }

    public final boolean getEnableClearLiveCenterCache() {
        return this.enableClearLiveCenterCache;
    }

    public final int getEnableClearMultiGuestCache() {
        return this.enableClearMultiGuestCache;
    }

    public final int getEnableClearNetDataPipelineCache() {
        return this.enableClearNetDataPipelineCache;
    }

    public final int getEnableClearSearchCache() {
        return this.enableClearSearchCache;
    }

    public final boolean getEnableFinishNonEssentialPages() {
        return this.enableFinishNonEssentialPages;
    }

    public final int getEnableNotifyMemRelief() {
        return this.enableNotifyMemRelief;
    }

    public final boolean getEnablePreloadAfterLive() {
        return this.enablePreloadAfterLive;
    }

    public final void setClearEffectAesCacheLevel(int i) {
        this.clearEffectAesCacheLevel = i;
    }

    public final void setClearEffectChannelCacheLevel(int i) {
        this.clearEffectChannelCacheLevel = i;
    }

    public final void setClearModelConfigArbiterCacheLevel(int i) {
        this.clearModelConfigArbiterCacheLevel = i;
    }

    public final void setClearStickerViewModelCacheLevel(int i) {
        this.clearStickerViewModelCacheLevel = i;
    }

    public final void setEnableClearCameraFilterCache(boolean z) {
        this.enableClearCameraFilterCache = z;
    }

    public final void setEnableClearLiveCenterCache(boolean z) {
        this.enableClearLiveCenterCache = z;
    }

    public final void setEnableClearMultiGuestCache(int i) {
        this.enableClearMultiGuestCache = i;
    }

    public final void setEnableClearNetDataPipelineCache(int i) {
        this.enableClearNetDataPipelineCache = i;
    }

    public final void setEnableClearSearchCache(int i) {
        this.enableClearSearchCache = i;
    }

    public final void setEnableFinishNonEssentialPages(boolean z) {
        this.enableFinishNonEssentialPages = z;
    }

    public final void setEnableNotifyMemRelief(int i) {
        this.enableNotifyMemRelief = i;
    }

    public final void setEnablePreloadAfterLive(boolean z) {
        this.enablePreloadAfterLive = z;
    }

    public BroadcastMemoryCleanersEnableConfig(boolean z, int i, boolean z2, int i2, int i3, int i4, boolean z3, int i5, int i6, int i7, int i8, boolean z4) {
        this.enableClearCameraFilterCache = z;
        this.enableClearNetDataPipelineCache = i;
        this.enableFinishNonEssentialPages = z2;
        this.enableNotifyMemRelief = i2;
        this.enableClearSearchCache = i3;
        this.enableClearMultiGuestCache = i4;
        this.enablePreloadAfterLive = z3;
        this.clearEffectAesCacheLevel = i5;
        this.clearModelConfigArbiterCacheLevel = i6;
        this.clearEffectChannelCacheLevel = i7;
        this.clearStickerViewModelCacheLevel = i8;
        this.enableClearLiveCenterCache = z4;
    }
}
