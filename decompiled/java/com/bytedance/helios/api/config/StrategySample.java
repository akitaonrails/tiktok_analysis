package com.bytedance.helios.api.config;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class StrategySample {

    @C09CT("extra_samples")
    public final Map<String, Double> extraSamples;

    @C09CT("sample")
    public final double sample;

    public StrategySample() {
        this(0.0d, C2097608Jq.LJ());
    }

    public StrategySample(double d, Map<String, Double> map) {
        this.sample = d;
        this.extraSamples = map;
    }
}
