package com.ss.lyrax.video;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHTarsSdkConfigs {

    @C09CT("disable_tars_inference")
    public boolean disableTarsInference;

    @C09CT("dump_image")
    public boolean dumpImage;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_game_detect")
    public boolean enableGameDetect;

    @C09CT("inference_report_interval")
    public double inferenceReportInterval;

    @C09CT("interval")
    public long interval;

    @C09CT("keep_same_ratio")
    public boolean keepSameRatio;

    @C09CT("model_name")
    public String modelName;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("task_names")
    public String[] taskNames;

    @C09CT("thresholds")
    public double[] thresholds;

    public TTLHTarsSdkConfigs() {
        this.interval = 1000L;
        this.scene = "tiktok_live_tns_adult_nudity";
        this.modelName = "tiktok_live_tns_adult_nudity";
        this.inferenceReportInterval = 5000.0d;
    }

    public TTLHTarsSdkConfigs(boolean z, long j, String str, String str2, String[] strArr, double[] dArr, boolean z2, double d, boolean z3, boolean z4, boolean z5) {
        this.enable = z;
        this.interval = j;
        this.scene = str;
        this.modelName = str2;
        this.taskNames = strArr;
        this.thresholds = dArr;
        this.dumpImage = z2;
        this.inferenceReportInterval = d;
        this.enableGameDetect = z3;
        this.disableTarsInference = z4;
        this.keepSameRatio = z5;
    }
}
