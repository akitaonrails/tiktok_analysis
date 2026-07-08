package com.ss.lyrax.video;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRenderConfig implements Serializable {

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_delay_init")
    public boolean enableDelayInit;

    @C09CT("init_delay_time")
    public long initDelayTime;

    @C09CT("support_hw_decoder")
    public boolean supportHwDecoder;

    public NativeRenderConfig() {
        this.initDelayTime = 10000L;
    }

    public NativeRenderConfig(boolean z, boolean z2, long j, boolean z3) {
        this.enable = z;
        this.enableDelayInit = z2;
        this.initDelayTime = j;
        this.supportHwDecoder = z3;
    }
}
