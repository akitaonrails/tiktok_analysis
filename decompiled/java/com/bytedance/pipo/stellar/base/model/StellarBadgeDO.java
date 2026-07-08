package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarBadgeDO {

    @C09CT("height")
    public final Integer height;

    @C09CT("offset_x")
    public final Integer offsetX;

    @C09CT("offset_y")
    public final Integer offsetY;

    @C09CT("size")
    public final Integer size;

    @C09CT("width")
    public final Integer width;

    public StellarBadgeDO() {
        this(0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarBadgeDO)) {
            return false;
        }
        StellarBadgeDO stellarBadgeDO = (StellarBadgeDO) obj;
        return Intrinsics.LJFF(this.size, stellarBadgeDO.size) && Intrinsics.LJFF(this.offsetX, stellarBadgeDO.offsetX) && Intrinsics.LJFF(this.offsetY, stellarBadgeDO.offsetY) && Intrinsics.LJFF(this.width, stellarBadgeDO.width) && Intrinsics.LJFF(this.height, stellarBadgeDO.height);
    }

    public final int hashCode() {
        Integer num = this.size;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.offsetX;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.offsetY;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.width;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.height;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StellarBadgeDO(size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StellarBadgeDO(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.size = num;
        this.offsetX = num2;
        this.offsetY = num3;
        this.width = num4;
        this.height = num5;
    }
}
