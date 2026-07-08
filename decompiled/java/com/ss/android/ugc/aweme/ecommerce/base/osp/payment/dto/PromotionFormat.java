package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionFormat implements Serializable {
    public static final int $stable = 0;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("icon_uri")
    public String iconUri;

    @C09CT("icon_uri_dark")
    public String iconUriDark;

    @C09CT("redirect_uri")
    public String redirectUri;

    public PromotionFormat() {
        this(null, null, null, null);
    }

    public int hashCode() {
        String str = this.iconUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUriDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redirectUri;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionFormat(iconUri=");
        sbLIZ.append(this.iconUri);
        sbLIZ.append(", iconUriDark=");
        sbLIZ.append(this.iconUriDark);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", redirectUri=");
        sbLIZ.append(this.redirectUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionFormat(String str, String str2, String str3, String str4) {
        this.iconUri = str;
        this.iconUriDark = str2;
        this.buttonText = str3;
        this.redirectUri = str4;
    }
}
