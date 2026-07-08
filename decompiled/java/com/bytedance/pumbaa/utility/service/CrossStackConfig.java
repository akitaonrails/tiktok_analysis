package com.bytedance.pumbaa.utility.service;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CrossStackConfig {

    @C09CT("enableCollectStack")
    public final boolean enableCollectStack;

    @C09CT("enableInjectPauseStatus")
    public final boolean enableInjectPauseStatus;

    @C09CT("enableReturnSampleStatus")
    public final boolean enableReturnSampleStatus;

    @C09CT("feedOptMode")
    public final int feedOptMode;

    @C09CT("feedSamplingRate")
    public final double feedSamplingRate;

    @C09CT("stackCollectMode")
    public final int stackCollectMode;

    @C09CT("stackMaxCount")
    public final int stackMaxCount;

    @C09CT("stackSamplingRate")
    public final double stackSamplingRate;

    @C09CT("stackSource")
    public final String stackSource;

    public CrossStackConfig() {
        this(false, 5, 0, 0.0d, null, false, false, 1.0d, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossStackConfig)) {
            return false;
        }
        CrossStackConfig crossStackConfig = (CrossStackConfig) obj;
        return this.enableCollectStack == crossStackConfig.enableCollectStack && this.stackMaxCount == crossStackConfig.stackMaxCount && this.stackCollectMode == crossStackConfig.stackCollectMode && Double.compare(this.stackSamplingRate, crossStackConfig.stackSamplingRate) == 0 && Intrinsics.LJFF(this.stackSource, crossStackConfig.stackSource) && this.enableReturnSampleStatus == crossStackConfig.enableReturnSampleStatus && this.enableInjectPauseStatus == crossStackConfig.enableInjectPauseStatus && Double.compare(this.feedSamplingRate, crossStackConfig.feedSamplingRate) == 0 && this.feedOptMode == crossStackConfig.feedOptMode;
    }

    public CrossStackConfig(boolean z, int i, int i2, double d, String str, boolean z2, boolean z3, double d2, int i3) {
        this.enableCollectStack = z;
        this.stackMaxCount = i;
        this.stackCollectMode = i2;
        this.stackSamplingRate = d;
        this.stackSource = str;
        this.enableReturnSampleStatus = z2;
        this.enableInjectPauseStatus = z3;
        this.feedSamplingRate = d2;
        this.feedOptMode = i3;
    }
}
