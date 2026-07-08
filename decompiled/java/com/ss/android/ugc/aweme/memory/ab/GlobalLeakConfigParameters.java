package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class GlobalLeakConfigParameters {
    public static final int $stable = 8;

    @C09CT("activityConfig")
    public final ActivityConfig activityConfig;

    @C09CT("forceGC")
    public final boolean forceGC;

    @C09CT("fragmentConfig")
    public final FragmentConfig fragmentConfig;

    @C09CT("lynxConfig")
    public final LynxViewConfig lynxConfig;

    @C09CT("maxGc")
    public final int maxGc;

    @C09CT("minDelay")
    public final long minDelay;

    @C09CT("sample")
    public final float sample;

    @C09CT("sceneFragmentConfig")
    public final SceneFragmentConfig sceneFragmentConfig;

    @C09CT("shortName")
    public final boolean shortName;

    @C09CT("timestamp")
    public final boolean timestamp;

    public GlobalLeakConfigParameters() {
        this(3.0E-4f, true, true, 1, false, 60000L, null, null, null, null);
    }

    public final GlobalLeakConfigParameters copy(float f, boolean z, boolean z2, int i, boolean z3, long j, ActivityConfig activityConfig, FragmentConfig fragmentConfig, SceneFragmentConfig sceneFragmentConfig, LynxViewConfig lynxViewConfig) {
        return new GlobalLeakConfigParameters(f, z, z2, i, z3, j, activityConfig, fragmentConfig, sceneFragmentConfig, lynxViewConfig);
    }

    public GlobalLeakConfigParameters(float f, boolean z, boolean z2, int i, boolean z3, long j, ActivityConfig activityConfig, FragmentConfig fragmentConfig, SceneFragmentConfig sceneFragmentConfig, LynxViewConfig lynxViewConfig) {
        this.sample = f;
        this.timestamp = z;
        this.shortName = z2;
        this.maxGc = i;
        this.forceGC = z3;
        this.minDelay = j;
        this.activityConfig = activityConfig;
        this.fragmentConfig = fragmentConfig;
        this.sceneFragmentConfig = sceneFragmentConfig;
        this.lynxConfig = lynxViewConfig;
    }
}
