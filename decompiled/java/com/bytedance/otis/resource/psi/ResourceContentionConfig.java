package com.bytedance.otis.resource.psi;

import X.C2214681Bm6;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public final class ResourceContentionConfig {
    public final boolean autoInstallDispatchHook;
    public final boolean backgroundEnabled;
    public final long backgroundWindowMs;
    public final float busyGateRatio;
    public final long dispatchFilterThresholdMs;
    public final boolean foregroundOnly;
    public final boolean gcUnionEnabled;
    public final boolean globalEnabled;
    public final long globalWindowMs;
    public final Set<String> sceneAllowList;
    public final boolean sceneEnabled;
    public final long sceneMaxMs;

    public static C2214681Bm6 builder() {
        return new C2214681Bm6();
    }

    public static ResourceContentionConfig defaults() {
        C2214681Bm6 c2214681Bm6Builder = builder();
        c2214681Bm6Builder.getClass();
        return new ResourceContentionConfig(c2214681Bm6Builder);
    }

    public ResourceContentionConfig(C2214681Bm6 c2214681Bm6) {
        long jMax = Math.max(1L, c2214681Bm6.LIZ);
        this.globalWindowMs = jMax;
        this.globalEnabled = c2214681Bm6.LIZIZ;
        this.sceneEnabled = c2214681Bm6.LIZJ;
        this.backgroundEnabled = c2214681Bm6.LIZLLL;
        long j = c2214681Bm6.LJ;
        this.backgroundWindowMs = Math.max(1L, j > 0 ? j : jMax);
        this.busyGateRatio = 0.02f;
        this.foregroundOnly = c2214681Bm6.LJFF;
        this.sceneMaxMs = Math.max(1L, 60000L);
        this.gcUnionEnabled = c2214681Bm6.LJI;
        this.autoInstallDispatchHook = false;
        this.dispatchFilterThresholdMs = Math.max(0L, 5L);
        this.sceneAllowList = c2214681Bm6.LJII;
    }
}
