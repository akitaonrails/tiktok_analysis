package com.ss.android.ugc.aweme.ecommerce.image.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class EcOperationResourceData {

    @C09CT("concurrency")
    public final int concurrency;

    @C09CT("debug")
    public final int debug;

    @C09CT("delay_time")
    public final int delayTime;

    @C09CT("enable")
    public final int enable;

    @C09CT("frequency")
    public final int frequency;

    @C09CT("interval_time")
    public final int intervalTime;

    public EcOperationResourceData() {
        this(0, 720, 2, 0, 0, 0);
    }

    public EcOperationResourceData(int i, int i2, int i3, int i4, int i5, int i6) {
        this.enable = i;
        this.frequency = i2;
        this.concurrency = i3;
        this.delayTime = i4;
        this.intervalTime = i5;
        this.debug = i6;
    }
}
