package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class CpcTime {

    @C09CT("apiCallLastTime")
    public long apiCallLastTime;

    @C09CT("lastShowingTime")
    public long lastShowingTime;

    @C09CT("scene1LastTime")
    public long scene1LastTime;

    @C09CT("scene2LastTime")
    public long scene2LastTime;

    @C09CT("scene3LastTime")
    public long scene3LastTime;

    public CpcTime() {
        this(0L, 0L, 0L, 0L, 0L);
    }

    public static CpcTime LIZ(CpcTime cpcTime, long j, long j2, int i) {
        long j3;
        long j4;
        long j5;
        long j6 = j2;
        long j7 = j;
        if ((i & 1) != 0) {
            j7 = cpcTime.lastShowingTime;
        }
        if ((i & 2) != 0) {
            j3 = cpcTime.scene1LastTime;
        } else {
            j3 = 0;
        }
        if ((i & 4) != 0) {
            j4 = cpcTime.scene2LastTime;
        } else {
            j4 = 0;
        }
        if ((i & 8) != 0) {
            j5 = cpcTime.scene3LastTime;
        } else {
            j5 = 0;
        }
        if ((i & 16) != 0) {
            j6 = cpcTime.apiCallLastTime;
        }
        return new CpcTime(j7, j3, j4, j5, j6);
    }

    public CpcTime(long j, long j2, long j3, long j4, long j5) {
        this.lastShowingTime = j;
        this.scene1LastTime = j2;
        this.scene2LastTime = j3;
        this.scene3LastTime = j4;
        this.apiCallLastTime = j5;
    }
}
