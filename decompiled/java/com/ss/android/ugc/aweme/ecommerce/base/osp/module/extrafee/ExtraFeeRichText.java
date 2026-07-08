package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtraFeeRichText {

    @C09CT("popup")
    public ExtraFeeDialog dialog;

    @C09CT("is_third_party_link")
    public Boolean isThirdPartyLink;

    @C09CT("link")
    public String link;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public Integer type;

    public ExtraFeeRichText() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraFeeRichText)) {
            return false;
        }
        ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) obj;
        return Intrinsics.LJFF(this.type, extraFeeRichText.type) && Intrinsics.LJFF(this.text, extraFeeRichText.text) && Intrinsics.LJFF(this.dialog, extraFeeRichText.dialog) && Intrinsics.LJFF(this.link, extraFeeRichText.link) && Intrinsics.LJFF(this.isThirdPartyLink, extraFeeRichText.isThirdPartyLink);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExtraFeeDialog extraFeeDialog = this.dialog;
        int iHashCode3 = (iHashCode2 + (extraFeeDialog == null ? 0 : extraFeeDialog.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isThirdPartyLink;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraFeeRichText(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", dialog=");
        sbLIZ.append(this.dialog);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", isThirdPartyLink=");
        sbLIZ.append(this.isThirdPartyLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExtraFeeRichText(Integer num, String str, ExtraFeeDialog extraFeeDialog, String str2, Boolean bool) {
        this.type = num;
        this.text = str;
        this.dialog = extraFeeDialog;
        this.link = str2;
        this.isThirdPartyLink = bool;
    }
}
