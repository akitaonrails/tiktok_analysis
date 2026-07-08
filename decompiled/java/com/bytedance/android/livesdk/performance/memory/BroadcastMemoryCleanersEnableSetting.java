package com.bytedance.android.livesdk.performance.memory;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_broadcast_memory_cleaners_enable_setting")
public final class BroadcastMemoryCleanersEnableSetting {
    public static final BroadcastMemoryCleanersEnableSetting INSTANCE = new BroadcastMemoryCleanersEnableSetting();
    public static final BroadcastMemoryCleanersEnableConfig DEFAULT = new BroadcastMemoryCleanersEnableConfig(false, 0, false, 0, 0, 0, false, 0, 0, 0, 0, false);

    private final BroadcastMemoryCleanersEnableConfig getConfig() {
        BroadcastMemoryCleanersEnableConfig broadcastMemoryCleanersEnableConfig = (BroadcastMemoryCleanersEnableConfig) SettingsManager.INSTANCE.getValueSafely(BroadcastMemoryCleanersEnableSetting.class);
        return broadcastMemoryCleanersEnableConfig == null ? DEFAULT : broadcastMemoryCleanersEnableConfig;
    }

    public static final boolean isClearCameraFilterCacheEnabled() {
        return INSTANCE.getConfig().getEnableClearCameraFilterCache();
    }

    public static final boolean isClearEffectAesCacheInCriticalEnabled() {
        int clearEffectAesCacheLevel = INSTANCE.getConfig().getClearEffectAesCacheLevel();
        return clearEffectAesCacheLevel == 2 || clearEffectAesCacheLevel == 3;
    }

    public static final boolean isClearEffectAesCacheInLowEnabled() {
        int clearEffectAesCacheLevel = INSTANCE.getConfig().getClearEffectAesCacheLevel();
        return clearEffectAesCacheLevel == 1 || clearEffectAesCacheLevel == 3;
    }

    public static final boolean isClearEffectChannelCacheInCriticalEnabled() {
        int clearEffectChannelCacheLevel = INSTANCE.getConfig().getClearEffectChannelCacheLevel();
        return clearEffectChannelCacheLevel == 2 || clearEffectChannelCacheLevel == 3;
    }

    public static final boolean isClearEffectChannelCacheInLowEnabled() {
        int clearEffectChannelCacheLevel = INSTANCE.getConfig().getClearEffectChannelCacheLevel();
        return clearEffectChannelCacheLevel == 1 || clearEffectChannelCacheLevel == 3;
    }

    public static final boolean isClearLiveCenterCacheEnabled() {
        return INSTANCE.getConfig().getEnableClearLiveCenterCache();
    }

    public static final boolean isClearModelConfigArbiterCacheInCriticalEnabled() {
        int clearModelConfigArbiterCacheLevel = INSTANCE.getConfig().getClearModelConfigArbiterCacheLevel();
        return clearModelConfigArbiterCacheLevel == 2 || clearModelConfigArbiterCacheLevel == 3;
    }

    public static final boolean isClearModelConfigArbiterCacheInLowEnabled() {
        int clearModelConfigArbiterCacheLevel = INSTANCE.getConfig().getClearModelConfigArbiterCacheLevel();
        return clearModelConfigArbiterCacheLevel == 1 || clearModelConfigArbiterCacheLevel == 3;
    }

    public static final boolean isClearMultiGuestCacheInCriticalEnabled() {
        int enableClearMultiGuestCache = INSTANCE.getConfig().getEnableClearMultiGuestCache();
        return enableClearMultiGuestCache == 2 || enableClearMultiGuestCache == 3;
    }

    public static final boolean isClearMultiGuestCacheInLowEnabled() {
        int enableClearMultiGuestCache = INSTANCE.getConfig().getEnableClearMultiGuestCache();
        return enableClearMultiGuestCache == 1 || enableClearMultiGuestCache == 3;
    }

    public static final boolean isClearNetDataPipelineCacheEnabledInLiveHost() {
        int enableClearNetDataPipelineCache = INSTANCE.getConfig().getEnableClearNetDataPipelineCache();
        return enableClearNetDataPipelineCache == 1 || enableClearNetDataPipelineCache == 3;
    }

    public static final boolean isClearNetDataPipelineCacheEnabledInLivePreview() {
        int enableClearNetDataPipelineCache = INSTANCE.getConfig().getEnableClearNetDataPipelineCache();
        return enableClearNetDataPipelineCache == 2 || enableClearNetDataPipelineCache == 3;
    }

    public static final boolean isClearSearchCacheInCriticalEnabled() {
        int enableClearSearchCache = INSTANCE.getConfig().getEnableClearSearchCache();
        return enableClearSearchCache == 2 || enableClearSearchCache == 3;
    }

    public static final boolean isClearSearchCacheInLowEnabled() {
        int enableClearSearchCache = INSTANCE.getConfig().getEnableClearSearchCache();
        return enableClearSearchCache == 1 || enableClearSearchCache == 3;
    }

    public static final boolean isClearStickerViewModelCacheInCriticalEnabled() {
        int clearStickerViewModelCacheLevel = INSTANCE.getConfig().getClearStickerViewModelCacheLevel();
        return clearStickerViewModelCacheLevel == 2 || clearStickerViewModelCacheLevel == 3;
    }

    public static final boolean isClearStickerViewModelCacheInLowEnabled() {
        int clearStickerViewModelCacheLevel = INSTANCE.getConfig().getClearStickerViewModelCacheLevel();
        return clearStickerViewModelCacheLevel == 1 || clearStickerViewModelCacheLevel == 3;
    }

    public static final boolean isFinishNonEssentialPagesEnabled() {
        return INSTANCE.getConfig().getEnableFinishNonEssentialPages();
    }

    public static final boolean isNotifyMemReliefEnabledInLow() {
        int enableNotifyMemRelief = INSTANCE.getConfig().getEnableNotifyMemRelief();
        return enableNotifyMemRelief == 1 || enableNotifyMemRelief == 3;
    }

    public static final boolean isPreloadAfterLiveEnabled() {
        return INSTANCE.getConfig().getEnablePreloadAfterLive();
    }

    public final boolean isNotifyMemReliefEnabledInCritical() {
        int enableNotifyMemRelief = getConfig().getEnableNotifyMemRelief();
        return enableNotifyMemRelief == 2 || enableNotifyMemRelief == 3;
    }
}
