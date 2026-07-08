package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HorizonLeftRightItemDO extends BaseWidgetDO {

    @C09CT("align")
    public final String align;

    @C09CT("left")
    public final List<CompoundComponentDO> left;

    @C09CT("prefer")
    public final String prefer;

    @C09CT("right")
    public final List<CompoundComponentDO> right;

    public HorizonLeftRightItemDO() {
        this(null, null, null, null);
    }

    public final HorizonLeftRightItemDO copy(List<CompoundComponentDO> list, List<CompoundComponentDO> list2, String str, String str2) {
        return new HorizonLeftRightItemDO(list, list2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizonLeftRightItemDO)) {
            return false;
        }
        HorizonLeftRightItemDO horizonLeftRightItemDO = (HorizonLeftRightItemDO) obj;
        return Intrinsics.LJFF(this.left, horizonLeftRightItemDO.left) && Intrinsics.LJFF(this.right, horizonLeftRightItemDO.right) && Intrinsics.LJFF(this.align, horizonLeftRightItemDO.align) && Intrinsics.LJFF(this.prefer, horizonLeftRightItemDO.prefer);
    }

    public int hashCode() {
        List<CompoundComponentDO> list = this.left;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CompoundComponentDO> list2 = this.right;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.align;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prefer;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizonLeftRightItemDO(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", align=");
        sbLIZ.append(this.align);
        sbLIZ.append(", prefer=");
        sbLIZ.append(this.prefer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAlign() {
        return this.align;
    }

    public final List<CompoundComponentDO> getLeft() {
        return this.left;
    }

    public final String getPrefer() {
        return this.prefer;
    }

    public final List<CompoundComponentDO> getRight() {
        return this.right;
    }

    public HorizonLeftRightItemDO(List<CompoundComponentDO> list, List<CompoundComponentDO> list2, String str, String str2) {
        super(null, null, 1, null, null);
        this.left = list;
        this.right = list2;
        this.align = str;
        this.prefer = str2;
    }
}
