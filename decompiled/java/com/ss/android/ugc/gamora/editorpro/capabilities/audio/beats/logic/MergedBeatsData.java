package com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MergedBeatsData {

    @C09CT("energy")
    public final List<Float> energy;

    @C09CT("time")
    public final List<Integer> time;

    @C09CT("value")
    public final List<Integer> value;

    public MergedBeatsData() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergedBeatsData)) {
            return false;
        }
        MergedBeatsData mergedBeatsData = (MergedBeatsData) obj;
        return Intrinsics.LJFF(this.time, mergedBeatsData.time) && Intrinsics.LJFF(this.value, mergedBeatsData.value) && Intrinsics.LJFF(this.energy, mergedBeatsData.energy);
    }

    public final int hashCode() {
        return (((this.time.hashCode() * 31) + this.value.hashCode()) * 31) + this.energy.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergedBeatsData(time=");
        sbLIZ.append(this.time);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", energy=");
        sbLIZ.append(this.energy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MergedBeatsData(List<Integer> list, List<Integer> list2, List<Float> list3) {
        this.time = list;
        this.value = list2;
        this.energy = list3;
    }

    public MergedBeatsData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
