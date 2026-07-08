package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SaleDetailInfo {

    @C09CT("content")
    public final ECRichText content;

    @C09CT("type")
    public final String type;

    public SaleDetailInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleDetailInfo)) {
            return false;
        }
        SaleDetailInfo saleDetailInfo = (SaleDetailInfo) obj;
        return Intrinsics.LJFF(this.type, saleDetailInfo.type) && Intrinsics.LJFF(this.content, saleDetailInfo.content);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.content;
        return iHashCode + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaleDetailInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SaleDetailInfo(String str, ECRichText eCRichText) {
        this.type = str;
        this.content = eCRichText;
    }
}
