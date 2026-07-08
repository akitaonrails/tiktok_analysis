package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.AbstractC1174304ib;
import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@C09CS(FrameDeserializer.class)
public final class Frame {

    @C09CT("graphType")
    public final Integer graphType;

    @C09CT("left")
    public final AbstractC1174304ib left;

    @C09CT("right")
    public final AbstractC1174304ib right;

    @C09CT("time")
    public final Long time;

    @C09CT("value")
    public final List<Double> value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        return Intrinsics.LJFF(this.time, frame.time) && Intrinsics.LJFF(this.value, frame.value) && Intrinsics.LJFF(this.graphType, frame.graphType) && Intrinsics.LJFF(this.left, frame.left) && Intrinsics.LJFF(this.right, frame.right);
    }

    public final int hashCode() {
        Long l = this.time;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Double> list = this.value;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.graphType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AbstractC1174304ib abstractC1174304ib = this.left;
        int iHashCode4 = (iHashCode3 + (abstractC1174304ib == null ? 0 : abstractC1174304ib.hashCode())) * 31;
        AbstractC1174304ib abstractC1174304ib2 = this.right;
        return iHashCode4 + (abstractC1174304ib2 != null ? abstractC1174304ib2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Frame(time=");
        sbLIZ.append(this.time);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", graphType=");
        sbLIZ.append(this.graphType);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Frame(Long l, List<Double> list, Integer num, AbstractC1174304ib abstractC1174304ib, AbstractC1174304ib abstractC1174304ib2) {
        this.time = l;
        this.value = list;
        this.graphType = num;
        this.left = abstractC1174304ib;
        this.right = abstractC1174304ib2;
    }
}
