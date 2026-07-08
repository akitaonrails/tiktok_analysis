package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class LowMemoryKillParameters {
    public static final int $stable = 0;

    @C09CT("checkTimes")
    public final int checkTimes;

    @C09CT("minAudioTimes")
    public final int minAudioTimes;

    @C09CT("minBgSec")
    public final long minBgSec;

    @C09CT("minJavaLevel")
    public final int minJavaLevel;

    @C09CT("minKillHour")
    public final long minKillHour;

    @C09CT("minLaunchSec")
    public final long minLaunchSec;

    @C09CT("minLevel")
    public final int minLevel;

    @C09CT("resumeFeed")
    public final boolean resumeFeed;

    @C09CT("totalCheckSec")
    public final long totalCheckSec;

    @C09CT("type")
    public final int type;

    public LowMemoryKillParameters() {
        this(0, 4, 4, 360L, 6, 3, 600L, 60L, 0L, true);
    }

    public LowMemoryKillParameters(int i, int i2, int i3, long j, int i4, int i5, long j2, long j3, long j4, boolean z) {
        this.type = i;
        this.minLevel = i2;
        this.minJavaLevel = i3;
        this.totalCheckSec = j;
        this.checkTimes = i4;
        this.minAudioTimes = i5;
        this.minLaunchSec = j2;
        this.minBgSec = j3;
        this.minKillHour = j4;
        this.resumeFeed = z;
    }
}
