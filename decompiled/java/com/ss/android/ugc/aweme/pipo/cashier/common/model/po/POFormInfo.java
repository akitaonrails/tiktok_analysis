package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POFormInfo {

    @C09CT("auto_fill_info")
    public final POFormAutoFillInfo autoFillInfo;

    @C09CT("elements")
    public final List<Element> elements;

    @C09CT("needed_elements")
    public final List<Element> neededElements;

    public POFormInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POFormInfo)) {
            return false;
        }
        POFormInfo pOFormInfo = (POFormInfo) obj;
        return Intrinsics.LJFF(this.elements, pOFormInfo.elements) && Intrinsics.LJFF(this.neededElements, pOFormInfo.neededElements) && Intrinsics.LJFF(this.autoFillInfo, pOFormInfo.autoFillInfo);
    }

    public final int hashCode() {
        List<Element> list = this.elements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Element> list2 = this.neededElements;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        POFormAutoFillInfo pOFormAutoFillInfo = this.autoFillInfo;
        return iHashCode2 + (pOFormAutoFillInfo != null ? pOFormAutoFillInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POFormInfo(elements=");
        sbLIZ.append(this.elements);
        sbLIZ.append(", neededElements=");
        sbLIZ.append(this.neededElements);
        sbLIZ.append(", autoFillInfo=");
        sbLIZ.append(this.autoFillInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POFormInfo(List<Element> list, List<Element> list2, POFormAutoFillInfo pOFormAutoFillInfo) {
        this.elements = list;
        this.neededElements = list2;
        this.autoFillInfo = pOFormAutoFillInfo;
    }
}
