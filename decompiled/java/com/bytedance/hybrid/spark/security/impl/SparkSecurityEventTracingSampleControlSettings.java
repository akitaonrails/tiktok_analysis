package com.bytedance.hybrid.spark.security.impl;

import X.C09CT;
import X.C0C64;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityEventTracingSampleControlSettings {
    public static final SparkSecurityEventTracingSampleControlModel LIZ = new SparkSecurityEventTracingSampleControlModel(new SampleConfig(1, C2097608Jq.LJ(), C2097608Jq.LJ()), new SampleConfig(1, C2097608Jq.LJ(), C2097608Jq.LJ()));
    public static SparkSecurityEventTracingSampleControlModel LIZIZ;

    public static final class SparkSecurityEventTracingSampleControlModel {

        @C09CT("event_handle")
        public final SampleConfig event_handle_sample;

        @C09CT("pipeline")
        public final SampleConfig pipeline_sample;

        public SparkSecurityEventTracingSampleControlModel() {
            this(new SampleConfig(1, C2097608Jq.LJ(), C2097608Jq.LJ()), new SampleConfig(1, C2097608Jq.LJ(), C2097608Jq.LJ()));
        }

        public SparkSecurityEventTracingSampleControlModel(SampleConfig sampleConfig, SampleConfig sampleConfig2) {
            this.event_handle_sample = sampleConfig;
            this.pipeline_sample = sampleConfig2;
        }
    }

    public static final SparkSecurityEventTracingSampleControlModel LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (SparkSecurityEventTracingSampleControlModel) C0C64.LJIILLIIL().LJJII(SparkSecurityEventTracingSampleControlModel.class, LIZ, "spark_security_event_tracing_sample_control", true);
        }
        SparkSecurityEventTracingSampleControlModel sparkSecurityEventTracingSampleControlModel = LIZIZ;
        return sparkSecurityEventTracingSampleControlModel == null ? LIZ : sparkSecurityEventTracingSampleControlModel;
    }

    public static final class SampleConfig {

        @C09CT("overall_sample_rate")
        public final int overall_sample_rate;

        @C09CT("sample_apis")
        public final Map<String, Integer> sample_apis;

        @C09CT("sample_channels")
        public final Map<String, Integer> sample_channels;

        public SampleConfig() {
            this(1, C2097608Jq.LJ(), C2097608Jq.LJ());
        }

        public SampleConfig(int i, Map<String, Integer> map, Map<String, Integer> map2) {
            this.overall_sample_rate = i;
            this.sample_apis = map;
            this.sample_channels = map2;
        }
    }
}
