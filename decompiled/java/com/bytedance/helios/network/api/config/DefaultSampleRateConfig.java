package com.bytedance.helios.network.api.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultSampleRateConfig implements Serializable {

    @C09CT("intercept_error")
    public final double interceptError;

    @C09CT("local_sample_rate")
    public final double localSampleRate;

    @C09CT("monitor_error")
    public final double monitorError;

    @C09CT("monitor_normal")
    public final double monitorNormal;

    public DefaultSampleRateConfig() {
        this(0.0d, 0.01d, 1.0d, 1.0d);
    }

    public final double getInterceptError() {
        return this.interceptError;
    }

    public final double getLocalSampleRate() {
        return this.localSampleRate;
    }

    public final double getMonitorError() {
        return this.monitorError;
    }

    public final double getMonitorNormal() {
        return this.monitorNormal;
    }

    public DefaultSampleRateConfig(double d, double d2, double d3, double d4) {
        this.monitorNormal = d;
        this.monitorError = d2;
        this.interceptError = d3;
        this.localSampleRate = d4;
    }
}
