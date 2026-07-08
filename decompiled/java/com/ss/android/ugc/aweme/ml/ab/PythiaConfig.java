package com.ss.android.ugc.aweme.ml.ab;

import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class PythiaConfig {
    public final int engineType;
    public final long minInterval;
    public final long minTiggerEventPeriod;
    public final boolean monitorFeatures;
    public final int monitorInterval;
    public final float monitorRate;
    public final boolean monitroScore;
    public final boolean open;
    public final int recentPoolSize;
    public final int stableWindowSize;
    public final HashSet<String> triggerEvents;
    public final HashSet<String> triggerEventsForBusiness;
    public final long triggerPeriod;

    public PythiaConfig() {
        this(false, 0, 10000L, 30000L, new HashSet(), 10000L, new HashSet(), 10, 150, 0.1f, 30000, true, true);
    }

    public PythiaConfig(boolean z, int i, long j, long j2, HashSet<String> hashSet, long j3, HashSet<String> hashSet2, int i2, int i3, float f, int i4, boolean z2, boolean z3) {
        this.open = z;
        this.engineType = i;
        this.minInterval = j;
        this.triggerPeriod = j2;
        this.triggerEvents = hashSet;
        this.minTiggerEventPeriod = j3;
        this.triggerEventsForBusiness = hashSet2;
        this.recentPoolSize = i2;
        this.stableWindowSize = i3;
        this.monitorRate = f;
        this.monitorInterval = i4;
        this.monitorFeatures = z2;
        this.monitroScore = z3;
    }
}
