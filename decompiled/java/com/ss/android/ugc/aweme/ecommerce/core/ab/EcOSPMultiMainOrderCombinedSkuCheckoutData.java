package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOSPMultiMainOrderCombinedSkuCheckoutData {

    @C09CT("source_page_type_allow_list")
    public final List<String> allowList;

    @C09CT("source_page_type_block_list")
    public final List<String> blockList;

    @C09CT("enable")
    public final Boolean enable;

    public EcOSPMultiMainOrderCombinedSkuCheckoutData() {
        this(Boolean.FALSE, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcOSPMultiMainOrderCombinedSkuCheckoutData)) {
            return false;
        }
        EcOSPMultiMainOrderCombinedSkuCheckoutData ecOSPMultiMainOrderCombinedSkuCheckoutData = (EcOSPMultiMainOrderCombinedSkuCheckoutData) obj;
        return Intrinsics.LJFF(this.enable, ecOSPMultiMainOrderCombinedSkuCheckoutData.enable) && Intrinsics.LJFF(this.allowList, ecOSPMultiMainOrderCombinedSkuCheckoutData.allowList) && Intrinsics.LJFF(this.blockList, ecOSPMultiMainOrderCombinedSkuCheckoutData.blockList);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.allowList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.blockList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcOSPMultiMainOrderCombinedSkuCheckoutData(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcOSPMultiMainOrderCombinedSkuCheckoutData(Boolean bool, List<String> list, List<String> list2) {
        this.enable = bool;
        this.allowList = list;
        this.blockList = list2;
    }
}
