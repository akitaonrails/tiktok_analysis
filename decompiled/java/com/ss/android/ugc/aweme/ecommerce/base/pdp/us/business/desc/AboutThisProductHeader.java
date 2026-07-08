package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AboutThisProductHeader {

    @C09CT("collapse_icon")
    public final Icon collapseIcon;

    @C09CT("expand_icon")
    public final Icon expandIcon;

    @C09CT("title")
    public final ECRichText title;

    public AboutThisProductHeader() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutThisProductHeader)) {
            return false;
        }
        AboutThisProductHeader aboutThisProductHeader = (AboutThisProductHeader) obj;
        return Intrinsics.LJFF(this.title, aboutThisProductHeader.title) && Intrinsics.LJFF(this.expandIcon, aboutThisProductHeader.expandIcon) && Intrinsics.LJFF(this.collapseIcon, aboutThisProductHeader.collapseIcon);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.expandIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.collapseIcon;
        return iHashCode2 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductHeader(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", expandIcon=");
        sbLIZ.append(this.expandIcon);
        sbLIZ.append(", collapseIcon=");
        sbLIZ.append(this.collapseIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AboutThisProductHeader(ECRichText eCRichText, Icon icon, Icon icon2) {
        this.title = eCRichText;
        this.expandIcon = icon;
        this.collapseIcon = icon2;
    }
}
