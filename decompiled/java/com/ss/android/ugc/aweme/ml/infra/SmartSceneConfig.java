package com.ss.android.ugc.aweme.ml.infra;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class SmartSceneConfig {

    @C09CT("collect_timing")
    public final CollectingTimingConfig collectTiming;

    @C09CT("collect_upload_interval")
    public int collectUploadInterval;

    @C09CT("execution_gap")
    public int executionGap;

    @C09CT("features")
    public InputFeaturesConfig features;

    @C09CT("inference_config")
    public final InferenceConfig inferenceConfig;

    @C09CT("input_feature_set_name")
    public String inputFeatureSetName;

    @C09CT("monitor_config")
    public SmartSceneMonitorConfig monitorConfig;

    @C09CT("offloading_config")
    public SmartOffloadingConfig offloadingConfig;

    @C09CT("out_type")
    public String outType;

    @C09CT("output_feature_set_name")
    public String outputFeatureSetName;

    @C09CT("remove_zero")
    public final boolean removeZero;

    @C09CT(alternate = {"name"}, value = Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("sdk")
    public SmartSdkConfig sdkConfig;

    @C09CT("skip_count")
    public int skipCount;

    @C09CT("time_gap_limit")
    public long timeGapLimit;

    @C09CT("track")
    public OneSmartDataTrackConfig track;

    @C09CT("true_result_config")
    public final TruthConfig truthConfig;

    @C09CT("upload_timing")
    public final CollectingTimingConfig uploadTiming;

    @C09CT("upload_timing_list")
    public final List<CollectingTimingConfig> uploadTimingList;

    public String toString() {
        return super.toString();
    }

    public final CollectingTimingConfig getCollectTiming() {
        return this.collectTiming;
    }

    public final int getCollectUploadInterval() {
        return this.collectUploadInterval;
    }

    public final int getExecutionGap() {
        return this.executionGap;
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final InferenceConfig getInferenceConfig() {
        return this.inferenceConfig;
    }

    public final String getInputFeatureSetName() {
        return this.inputFeatureSetName;
    }

    public final SmartSceneMonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    public final SmartOffloadingConfig getOffloadingConfig() {
        return this.offloadingConfig;
    }

    public final String getOutputFeatureSetName() {
        return this.outputFeatureSetName;
    }

    public final boolean getRemoveZero() {
        return this.removeZero;
    }

    public final String getScene() {
        return this.scene;
    }

    public final SmartSdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final long getTimeGapLimit() {
        return this.timeGapLimit;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final TruthConfig getTruthConfig() {
        return this.truthConfig;
    }

    public final CollectingTimingConfig getUploadTiming() {
        return this.uploadTiming;
    }

    public final List<CollectingTimingConfig> getUploadTimingList() {
        return this.uploadTimingList;
    }

    public final void setCollectUploadInterval(int i) {
        this.collectUploadInterval = i;
    }

    public final void setExecutionGap(int i) {
        this.executionGap = i;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setInputFeatureSetName(String str) {
        this.inputFeatureSetName = str;
    }

    public final void setMonitorConfig(SmartSceneMonitorConfig smartSceneMonitorConfig) {
        this.monitorConfig = smartSceneMonitorConfig;
    }

    public final void setOffloadingConfig(SmartOffloadingConfig smartOffloadingConfig) {
        this.offloadingConfig = smartOffloadingConfig;
    }

    public final void setOutputFeatureSetName(String str) {
        this.outputFeatureSetName = str;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setSdkConfig(SmartSdkConfig smartSdkConfig) {
        this.sdkConfig = smartSdkConfig;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setTimeGapLimit(long j) {
        this.timeGapLimit = j;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
