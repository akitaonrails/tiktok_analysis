package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_lynx_code_cache_optimize")
public final class LiveHybridLynxCodeCacheOptimizeSetting {
    public static final LiveHybridLynxCodeCacheOptimizeSetting INSTANCE = new LiveHybridLynxCodeCacheOptimizeSetting();
    public static final CodeCacheOptimizeConfig DEFAULT = new CodeCacheOptimizeConfig(false, false, false);

    private final CodeCacheOptimizeConfig getValue() {
        return (CodeCacheOptimizeConfig) SettingsManager.INSTANCE.getValueSafely(LiveHybridLynxCodeCacheOptimizeSetting.class);
    }

    public final boolean bannerEnable() {
        CodeCacheOptimizeConfig value = getValue();
        if (value != null) {
            return value.bannerEnable;
        }
        return false;
    }

    public final boolean middleTouchEnable() {
        CodeCacheOptimizeConfig value = getValue();
        if (value != null) {
            return value.middleTouchEnable;
        }
        return false;
    }

    public final boolean shortTouchEnable() {
        CodeCacheOptimizeConfig value = getValue();
        if (value != null) {
            return value.shortTouchEnable;
        }
        return false;
    }

    public static final class CodeCacheOptimizeConfig {
        public static final TypeAdapter ADAPTER = new LiveHybridLynxCodeCacheOptimizeSetting_CodeCacheOptimizeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("banner_enable")
        public boolean bannerEnable;

        @C09CT("middle_touch_enable")
        public boolean middleTouchEnable;

        @C09CT("short_touch_enable")
        public boolean shortTouchEnable;

        public CodeCacheOptimizeConfig() {
            this(false, false, false);
        }

        public CodeCacheOptimizeConfig(boolean z, boolean z2, boolean z3) {
            this.shortTouchEnable = z;
            this.middleTouchEnable = z2;
            this.bannerEnable = z3;
        }
    }
}
