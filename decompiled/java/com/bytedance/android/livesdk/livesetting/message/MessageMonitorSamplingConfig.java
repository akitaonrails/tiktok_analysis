package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MessageMonitorSamplingConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("log_sampling")
    public double logSamplingRate;

    @C09CT("zstd_compress_samping")
    public double zstdSamplingRate;

    static {
        NormalGson.singleton();
        ADAPTER = new MessageMonitorSamplingConfig_OptTypeAdapter();
    }

    public MessageMonitorSamplingConfig() {
        this(0.001d, 1.0d);
    }

    public final double getLogSamplingRate() {
        return this.logSamplingRate;
    }

    public final double getZstdSamplingRate() {
        return this.zstdSamplingRate;
    }

    public final void setLogSamplingRate(double d) {
        this.logSamplingRate = d;
    }

    public final void setZstdSamplingRate(double d) {
        this.zstdSamplingRate = d;
    }

    public MessageMonitorSamplingConfig(double d, double d2) {
        this.zstdSamplingRate = d;
        this.logSamplingRate = d2;
    }
}
