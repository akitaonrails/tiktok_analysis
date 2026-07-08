package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_recharge_hit_cache")
public final class LiveRechargeHitCacheOptimizationSetting {
    public static final LiveRechargeHitCacheOptimizationSetting INSTANCE = new LiveRechargeHitCacheOptimizationSetting();
    public static final LiveRechargeHitCacheSettings DEFAULT = new LiveRechargeHitCacheSettings();

    public static final class LiveRechargeHitCacheSettings {
        public static final TypeAdapter ADAPTER = new LiveRechargeHitCacheOptimizationSetting_LiveRechargeHitCacheSettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable = true;

        @C09CT("threshold")
        public int coinsThreshold = 5;

        @C09CT("prefetch_diamond_effect_days")
        public int prefetchDiamondEffectDays = 5;
    }

    public final LiveRechargeHitCacheSettings getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRechargeHitCacheSettings liveRechargeHitCacheSettings = DEFAULT;
        LiveRechargeHitCacheSettings liveRechargeHitCacheSettings2 = (LiveRechargeHitCacheSettings) settingsManager.getValueSafely("live_recharge_hit_cache", liveRechargeHitCacheSettings);
        return liveRechargeHitCacheSettings2 != null ? liveRechargeHitCacheSettings2 : liveRechargeHitCacheSettings;
    }
}
