package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class JitCompilerConfig {

    @C09CT("compile")
    public final int compileThreshold;

    @C09CT("transition")
    public final int invokeTransitionWeight;

    @C09CT("osr")
    public final int osrThreshold;

    @C09CT("priority")
    public final int priorityThreadWeight;

    @C09CT("warmup")
    public final int warmupThreshold;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JitCompilerConfig)) {
            return false;
        }
        JitCompilerConfig jitCompilerConfig = (JitCompilerConfig) obj;
        return this.compileThreshold == jitCompilerConfig.compileThreshold && this.warmupThreshold == jitCompilerConfig.warmupThreshold && this.osrThreshold == jitCompilerConfig.osrThreshold && this.priorityThreadWeight == jitCompilerConfig.priorityThreadWeight && this.invokeTransitionWeight == jitCompilerConfig.invokeTransitionWeight;
    }

    public JitCompilerConfig() {
        this(10240, 5120, 20480, 5, 10);
    }

    public JitCompilerConfig(int i, int i2, int i3, int i4, int i5) {
        this.compileThreshold = i;
        this.warmupThreshold = i2;
        this.osrThreshold = i3;
        this.priorityThreadWeight = i4;
        this.invokeTransitionWeight = i5;
    }
}
