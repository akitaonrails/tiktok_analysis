package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HorizonLeftRightDO extends BaseWidgetDO {

    @C09CT("component_list")
    public final List<HorizonLeftRightItemDO> itemList;

    public HorizonLeftRightDO() {
        this(null, 1, null);
    }

    public final HorizonLeftRightDO copy(List<HorizonLeftRightItemDO> list) {
        return new HorizonLeftRightDO(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HorizonLeftRightDO) && Intrinsics.LJFF(this.itemList, ((HorizonLeftRightDO) obj).itemList);
    }

    public int hashCode() {
        return this.itemList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizonLeftRightDO(itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<HorizonLeftRightItemDO> getItemList() {
        return this.itemList;
    }

    public HorizonLeftRightDO(List<HorizonLeftRightItemDO> list) {
        super(null, null, 1, null, null);
        this.itemList = list;
    }

    public HorizonLeftRightDO(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
