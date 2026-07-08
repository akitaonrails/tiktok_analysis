package com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class NleClipTimeAdjustData {
    public static final int $stable = 8;
    public long duration;
    public long endTime;
    public String id;
    public float speed;
    public long startTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NleClipTimeAdjustData)) {
            return false;
        }
        NleClipTimeAdjustData nleClipTimeAdjustData = (NleClipTimeAdjustData) obj;
        return Intrinsics.LJFF(this.id, nleClipTimeAdjustData.id) && this.startTime == nleClipTimeAdjustData.startTime && this.endTime == nleClipTimeAdjustData.endTime && Float.compare(this.speed, nleClipTimeAdjustData.speed) == 0 && this.duration == nleClipTimeAdjustData.duration;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleClipTimeAdjustData(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + Float.floatToIntBits(this.speed)) * 31) + C786410Ut5.Y2(this.duration);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public NleClipTimeAdjustData(String str, long j, long j2, float f, long j3) {
        this.id = str;
        this.startTime = j;
        this.endTime = j2;
        this.speed = f;
        this.duration = j3;
    }
}
