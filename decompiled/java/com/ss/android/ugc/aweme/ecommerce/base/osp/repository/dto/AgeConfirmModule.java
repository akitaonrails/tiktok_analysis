package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AgeConfirmModule {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("is_confirmed")
    public Boolean isConfirmed;

    @C09CT("need_to_confirm_text")
    public ECRichText needToConfirmText;

    @C09CT("text")
    public ECRichText text;

    public AgeConfirmModule() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeConfirmModule)) {
            return false;
        }
        AgeConfirmModule ageConfirmModule = (AgeConfirmModule) obj;
        return Intrinsics.LJFF(this.text, ageConfirmModule.text) && Intrinsics.LJFF(this.needToConfirmText, ageConfirmModule.needToConfirmText) && Intrinsics.LJFF(this.isConfirmed, ageConfirmModule.isConfirmed) && Intrinsics.LJFF(this.daInfo, ageConfirmModule.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.needToConfirmText;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Boolean bool = this.isConfirmed;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeConfirmModule(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", needToConfirmText=");
        sbLIZ.append(this.needToConfirmText);
        sbLIZ.append(", isConfirmed=");
        sbLIZ.append(this.isConfirmed);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AgeConfirmModule(ECRichText eCRichText, ECRichText eCRichText2, Boolean bool, String str) {
        this.text = eCRichText;
        this.needToConfirmText = eCRichText2;
        this.isConfirmed = bool;
        this.daInfo = str;
    }
}
