package com.ss.android.ugc.aweme.memory;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes34.dex */
public final class MemoryOptWhenAnrABParameters {
    public static final int $stable = 0;

    @C09CT("availMem")
    public final int availMem;

    @C09CT("blockGcCount")
    public final int blockGcCount;

    @C09CT("blockGcTime")
    public final int blockGcTime;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("javaHeapRate")
    public final double javaHeapRate;

    @C09CT("majorFault")
    public final int majorFault;

    @C09CT("totalPss")
    public final int totalPss;

    public MemoryOptWhenAnrABParameters() {
        this(false, 0.75d, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 500, 100, 100, 200);
    }

    public MemoryOptWhenAnrABParameters(boolean z, double d, int i, int i2, int i3, int i4, int i5) {
        this.enable = z;
        this.javaHeapRate = d;
        this.totalPss = i;
        this.availMem = i2;
        this.majorFault = i3;
        this.blockGcCount = i4;
        this.blockGcTime = i5;
    }
}
