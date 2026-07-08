package com.bytedance.ies.cutsame.source.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessorConfig {
    public final String algorithm;
    public final String conf;
    public final int inputType;
    public final boolean needServer;
    public final int outputType;
    public final SpeedConfig speedConfig;

    public ProcessorConfig() {
        this("", 0, 0, "", false, new SpeedConfig(new ArrayList(), 0));
    }

    public ProcessorConfig(String str, int i, int i2, String str2, boolean z, SpeedConfig speedConfig) {
        this.algorithm = str;
        this.inputType = i;
        this.outputType = i2;
        this.conf = str2;
        this.needServer = z;
        this.speedConfig = speedConfig;
    }
}
