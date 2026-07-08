package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcCombineSummaryShowTypeModel {

    @C09CT("source_page_type_allow_list")
    public final List<String> allowList;

    @C09CT("type")
    public final Integer type;

    public EcCombineSummaryShowTypeModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcCombineSummaryShowTypeModel)) {
            return false;
        }
        EcCombineSummaryShowTypeModel ecCombineSummaryShowTypeModel = (EcCombineSummaryShowTypeModel) obj;
        return Intrinsics.LJFF(this.type, ecCombineSummaryShowTypeModel.type) && Intrinsics.LJFF(this.allowList, ecCombineSummaryShowTypeModel.allowList);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.allowList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcCombineSummaryShowTypeModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcCombineSummaryShowTypeModel(Integer num, List<String> list) {
        this.type = num;
        this.allowList = list;
    }
}
