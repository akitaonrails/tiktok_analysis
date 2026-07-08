package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_top_3_hybrid_container_dynamic_params_setting")
public final class LiveTop3HybridContainerDynamicParamsSetting {
    public static final LiveTop3HybridContainerDynamicParamsSetting INSTANCE = new LiveTop3HybridContainerDynamicParamsSetting();
    public static final Top3HybridContainerDynamicParams DEFAULT = new Top3HybridContainerDynamicParams(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());

    public static final class Top3HybridContainerDynamicParams {
        public static final TypeAdapter ADAPTER = new LiveTop3HybridContainerDynamicParamsSetting_Top3HybridContainerDynamicParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("banner_params")
        public Map<String, String> bannerParams;

        @C09CT("common_params")
        public Map<String, String> commonParams;

        @C09CT("middle_touch_params")
        public Map<String, String> middleTouchParams;

        @C09CT("short_touch_params")
        public Map<String, String> shortTouchParams;

        public Top3HybridContainerDynamicParams() {
            this(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        }

        public Top3HybridContainerDynamicParams(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
            this.commonParams = map;
            this.bannerParams = map2;
            this.middleTouchParams = map3;
            this.shortTouchParams = map4;
        }
    }

    public final Map<String, String> getBannerParams() {
        Top3HybridContainerDynamicParams top3HybridContainerDynamicParams = (Top3HybridContainerDynamicParams) SettingsManager.INSTANCE.getValueSafely("live_top_3_hybrid_container_dynamic_params_setting", DEFAULT);
        if (top3HybridContainerDynamicParams != null) {
            return top3HybridContainerDynamicParams.bannerParams;
        }
        return null;
    }

    public final Map<String, String> getCommonParams() {
        Top3HybridContainerDynamicParams top3HybridContainerDynamicParams = (Top3HybridContainerDynamicParams) SettingsManager.INSTANCE.getValueSafely("live_top_3_hybrid_container_dynamic_params_setting", DEFAULT);
        if (top3HybridContainerDynamicParams != null) {
            return top3HybridContainerDynamicParams.commonParams;
        }
        return null;
    }

    public final Map<String, String> getMiddleTouchParams() {
        Top3HybridContainerDynamicParams top3HybridContainerDynamicParams = (Top3HybridContainerDynamicParams) SettingsManager.INSTANCE.getValueSafely("live_top_3_hybrid_container_dynamic_params_setting", DEFAULT);
        if (top3HybridContainerDynamicParams != null) {
            return top3HybridContainerDynamicParams.middleTouchParams;
        }
        return null;
    }

    public final Map<String, String> getShortTouchParams() {
        Top3HybridContainerDynamicParams top3HybridContainerDynamicParams = (Top3HybridContainerDynamicParams) SettingsManager.INSTANCE.getValueSafely("live_top_3_hybrid_container_dynamic_params_setting", DEFAULT);
        if (top3HybridContainerDynamicParams != null) {
            return top3HybridContainerDynamicParams.shortTouchParams;
        }
        return null;
    }
}
