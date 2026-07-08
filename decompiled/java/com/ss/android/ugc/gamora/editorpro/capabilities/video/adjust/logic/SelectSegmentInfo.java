package com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectSegmentInfo {
    public static final int $stable = 8;
    public long dropTime;
    public long duration;
    public long end;
    public final int height;
    public boolean isSelect;
    public final String key;
    public final String path;
    public float speed;
    public long start;
    public final int width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSegmentInfo)) {
            return false;
        }
        SelectSegmentInfo selectSegmentInfo = (SelectSegmentInfo) obj;
        return Intrinsics.LJFF(this.key, selectSegmentInfo.key) && Intrinsics.LJFF(this.path, selectSegmentInfo.path) && this.start == selectSegmentInfo.start && this.end == selectSegmentInfo.end && this.duration == selectSegmentInfo.duration && Float.compare(this.speed, selectSegmentInfo.speed) == 0 && this.width == selectSegmentInfo.width && this.height == selectSegmentInfo.height && this.isSelect == selectSegmentInfo.isSelect && this.dropTime == selectSegmentInfo.dropTime;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectSegmentInfo(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.isSelect);
        sbLIZ.append(", dropTime=");
        sbLIZ.append(this.dropTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SelectSegmentInfo() {
        this("", "", 0L, 0L, 0L, 1.0f, 0, 0, false, 0L);
    }

    public int hashCode() {
        return (((((((((((((((((this.key.hashCode() * 31) + this.path.hashCode()) * 31) + C786410Ut5.Y2(this.start)) * 31) + C786410Ut5.Y2(this.end)) * 31) + C786410Ut5.Y2(this.duration)) * 31) + Float.floatToIntBits(this.speed)) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Z2(this.isSelect)) * 31) + C786410Ut5.Y2(this.dropTime);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setDropTime(long j) {
        this.dropTime = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public SelectSegmentInfo(String str, String str2, long j, long j2, long j3, float f, int i, int i2, boolean z, long j4) {
        this.key = str;
        this.path = str2;
        this.start = j;
        this.end = j2;
        this.duration = j3;
        this.speed = f;
        this.width = i;
        this.height = i2;
        this.isSelect = z;
        this.dropTime = j4;
    }
}
