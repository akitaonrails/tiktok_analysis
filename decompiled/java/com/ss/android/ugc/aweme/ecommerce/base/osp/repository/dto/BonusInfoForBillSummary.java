package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class BonusInfoForBillSummary {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("earn_amount")
    public String earnAmount;

    @C09CT("earn_title")
    public ECRichText earnTitle;

    public BonusInfoForBillSummary() {
    }

    public final int hashCode() {
        ECRichText eCRichText = this.earnTitle;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.earnAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public BonusInfoForBillSummary(ECRichText eCRichText, String str, String str2) {
        this.earnTitle = eCRichText;
        this.earnAmount = str;
        this.daInfo = str2;
    }
}
