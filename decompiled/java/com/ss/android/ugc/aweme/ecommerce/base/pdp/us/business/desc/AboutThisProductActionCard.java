package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AboutThisProductActionCard {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("right_icon")
    public final Icon rightIcon;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final AboutThisProductActionCardStyle style;

    @C09CT("title")
    public final ECRichText title;

    public AboutThisProductActionCard() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutThisProductActionCard)) {
            return false;
        }
        AboutThisProductActionCard aboutThisProductActionCard = (AboutThisProductActionCard) obj;
        return Intrinsics.LJFF(this.title, aboutThisProductActionCard.title) && Intrinsics.LJFF(this.rightIcon, aboutThisProductActionCard.rightIcon) && Intrinsics.LJFF(this.schema, aboutThisProductActionCard.schema) && Intrinsics.LJFF(this.style, aboutThisProductActionCard.style) && Intrinsics.LJFF(this.daInfo, aboutThisProductActionCard.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.rightIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.schema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AboutThisProductActionCardStyle aboutThisProductActionCardStyle = this.style;
        int iHashCode4 = (iHashCode3 + (aboutThisProductActionCardStyle == null ? 0 : aboutThisProductActionCardStyle.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductActionCard(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", rightIcon=");
        sbLIZ.append(this.rightIcon);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AboutThisProductActionCard(ECRichText eCRichText, Icon icon, String str, AboutThisProductActionCardStyle aboutThisProductActionCardStyle, String str2) {
        this.title = eCRichText;
        this.rightIcon = icon;
        this.schema = str;
        this.style = aboutThisProductActionCardStyle;
        this.daInfo = str2;
    }
}
