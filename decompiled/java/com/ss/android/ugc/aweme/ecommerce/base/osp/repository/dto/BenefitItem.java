package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BenefitItem {

    @C09CT("benefit_rich_text")
    public ECRichText benefitRichText;

    @C09CT("icon")
    public Icon icon;

    public BenefitItem() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitItem)) {
            return false;
        }
        BenefitItem benefitItem = (BenefitItem) obj;
        return Intrinsics.LJFF(this.icon, benefitItem.icon) && Intrinsics.LJFF(this.benefitRichText, benefitItem.benefitRichText);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.benefitRichText;
        return iHashCode + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BenefitItem(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", benefitRichText=");
        sbLIZ.append(this.benefitRichText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BenefitItem(Icon icon, ECRichText eCRichText) {
        this.icon = icon;
        this.benefitRichText = eCRichText;
    }
}
