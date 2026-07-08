package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceSubText {

    @C09CT("installment_tenure")
    public String installmentTenure;

    @C09CT("rich_text")
    public ECRichText richText;

    @C09CT("sub_text_type")
    public Integer subTextType;

    public PriceSubText() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceSubText)) {
            return false;
        }
        PriceSubText priceSubText = (PriceSubText) obj;
        return Intrinsics.LJFF(this.subTextType, priceSubText.subTextType) && Intrinsics.LJFF(this.richText, priceSubText.richText) && Intrinsics.LJFF(this.installmentTenure, priceSubText.installmentTenure);
    }

    public final int hashCode() {
        Integer num = this.subTextType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ECRichText eCRichText = this.richText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.installmentTenure;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceSubText(subTextType=");
        sbLIZ.append(this.subTextType);
        sbLIZ.append(", richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", installmentTenure=");
        sbLIZ.append(this.installmentTenure);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceSubText(Integer num, ECRichText eCRichText, String str) {
        this.subTextType = num;
        this.richText = eCRichText;
        this.installmentTenure = str;
    }
}
