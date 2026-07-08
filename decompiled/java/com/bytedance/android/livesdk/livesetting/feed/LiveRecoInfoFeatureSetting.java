package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_reco_info_feature_config_v1")
public final class LiveRecoInfoFeatureSetting {
    public static final LiveRecoInfoFeatureSetting INSTANCE = new LiveRecoInfoFeatureSetting();
    public static final LiveRecoInfoFeatureConfig DEFAULT = new LiveRecoInfoFeatureConfig(false, false, new ArrayList(), new ArrayList());

    private final LiveRecoInfoFeatureConfig getFeatureConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRecoInfoFeatureConfig liveRecoInfoFeatureConfig = DEFAULT;
        LiveRecoInfoFeatureConfig liveRecoInfoFeatureConfig2 = (LiveRecoInfoFeatureConfig) settingsManager.getValueSafely("live_reco_info_feature_config_v1", liveRecoInfoFeatureConfig);
        return liveRecoInfoFeatureConfig2 != null ? liveRecoInfoFeatureConfig2 : liveRecoInfoFeatureConfig;
    }

    public final boolean enableForInnerFlow() {
        return getFeatureConfig().getEnableForInnerFlow();
    }

    public final boolean enableForPreview() {
        return getFeatureConfig().getEnableForPreview();
    }

    public final List<RecoInfoFeatureSaveConfig> getInnerFlowRecoInfoSaveConfig() {
        return getFeatureConfig().getInnerFlowRecoInfoSaveConfigs();
    }

    public final List<RecoInfoFeatureSaveConfig> getPreviewRecoInfoSaveConfig() {
        return getFeatureConfig().getPreviewRecoInfoSaveConfigs();
    }

    public static final class LiveRecoInfoFeatureConfig {
        public static final TypeAdapter ADAPTER = new LiveRecoInfoFeatureSetting_LiveRecoInfoFeatureConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_for_inner_flow")
        public boolean enableForInnerFlow;

        @C09CT("enable_for_preview")
        public boolean enableForPreview;

        @C09CT("inner_flow_reco_info_save_config")
        public List<RecoInfoFeatureSaveConfig> innerFlowRecoInfoSaveConfigs;

        @C09CT("preview_reco_info_save_config")
        public List<RecoInfoFeatureSaveConfig> previewRecoInfoSaveConfigs;

        public LiveRecoInfoFeatureConfig() {
            this(false, false, new ArrayList(), new ArrayList());
        }

        public final boolean getEnableForInnerFlow() {
            return this.enableForInnerFlow;
        }

        public final boolean getEnableForPreview() {
            return this.enableForPreview;
        }

        public final List<RecoInfoFeatureSaveConfig> getInnerFlowRecoInfoSaveConfigs() {
            return this.innerFlowRecoInfoSaveConfigs;
        }

        public final List<RecoInfoFeatureSaveConfig> getPreviewRecoInfoSaveConfigs() {
            return this.previewRecoInfoSaveConfigs;
        }

        public final void setEnableForInnerFlow(boolean z) {
            this.enableForInnerFlow = z;
        }

        public final void setEnableForPreview(boolean z) {
            this.enableForPreview = z;
        }

        public final void setInnerFlowRecoInfoSaveConfigs(List<RecoInfoFeatureSaveConfig> list) {
            this.innerFlowRecoInfoSaveConfigs = list;
        }

        public final void setPreviewRecoInfoSaveConfigs(List<RecoInfoFeatureSaveConfig> list) {
            this.previewRecoInfoSaveConfigs = list;
        }

        public LiveRecoInfoFeatureConfig(boolean z, boolean z2, List<RecoInfoFeatureSaveConfig> list, List<RecoInfoFeatureSaveConfig> list2) {
            this.enableForInnerFlow = z;
            this.enableForPreview = z2;
            this.previewRecoInfoSaveConfigs = list;
            this.innerFlowRecoInfoSaveConfigs = list2;
        }
    }

    public static final class RecoInfoFeatureSaveConfig {
        public static final TypeAdapter ADAPTER = new LiveRecoInfoFeatureSetting_RecoInfoFeatureSaveConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("feature_save_enable")
        public boolean featureSaveEnable;

        @C09CT("reco_info_key")
        public String recoInfoKey;

        @C09CT("sub_feature_save_list")
        public List<String> subFeatureSaveList;

        public RecoInfoFeatureSaveConfig() {
            this(false, null, null, 7, null);
        }

        public final boolean getFeatureSaveEnable() {
            return this.featureSaveEnable;
        }

        public final String getRecoInfoKey() {
            return this.recoInfoKey;
        }

        public final List<String> getSubFeatureSaveList() {
            return this.subFeatureSaveList;
        }

        public final void setFeatureSaveEnable(boolean z) {
            this.featureSaveEnable = z;
        }

        public final void setRecoInfoKey(String str) {
            this.recoInfoKey = str;
        }

        public final void setSubFeatureSaveList(List<String> list) {
            this.subFeatureSaveList = list;
        }

        public RecoInfoFeatureSaveConfig(boolean z, String str, List<String> list) {
            this.featureSaveEnable = z;
            this.recoInfoKey = str;
            this.subFeatureSaveList = list;
        }

        public RecoInfoFeatureSaveConfig(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
