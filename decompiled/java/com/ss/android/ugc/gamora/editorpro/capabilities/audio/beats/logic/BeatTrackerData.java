package com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BeatTrackerData {

    @C09CT("time")
    public final List<Integer> time;

    @C09CT("value")
    public final List<Integer> value;

    public BeatTrackerData() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeatTrackerData)) {
            return false;
        }
        BeatTrackerData beatTrackerData = (BeatTrackerData) obj;
        return Intrinsics.LJFF(this.time, beatTrackerData.time) && Intrinsics.LJFF(this.value, beatTrackerData.value);
    }

    public final int hashCode() {
        return (this.time.hashCode() * 31) + this.value.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeatTrackerData(time=");
        sbLIZ.append(this.time);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BeatTrackerData(List<Integer> list, List<Integer> list2) {
        this.time = list;
        this.value = list2;
    }

    public BeatTrackerData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
