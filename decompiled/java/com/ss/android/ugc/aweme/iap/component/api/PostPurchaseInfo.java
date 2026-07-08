package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PostPurchaseInfo {

    @C09CT("after_purchase_popup")
    public final String afterPurchasePopup;

    @C09CT("after_purchase_popup_redirect_url")
    public final String afterPurchasePopupRedirectUrl;

    @C09CT("after_purchase_redirect_type")
    public final Integer afterPurchaseRedirectType;

    @C09CT("after_purchase_toast")
    public final String afterPurchaseToast;

    @C09CT("after_purchase_toast_redirect_url")
    public final String afterPurchaseToastRedirectUrl;

    public PostPurchaseInfo() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPurchaseInfo)) {
            return false;
        }
        PostPurchaseInfo postPurchaseInfo = (PostPurchaseInfo) obj;
        return Intrinsics.LJFF(this.afterPurchasePopup, postPurchaseInfo.afterPurchasePopup) && Intrinsics.LJFF(this.afterPurchaseToast, postPurchaseInfo.afterPurchaseToast) && Intrinsics.LJFF(this.afterPurchaseToastRedirectUrl, postPurchaseInfo.afterPurchaseToastRedirectUrl) && Intrinsics.LJFF(this.afterPurchasePopupRedirectUrl, postPurchaseInfo.afterPurchasePopupRedirectUrl) && Intrinsics.LJFF(this.afterPurchaseRedirectType, postPurchaseInfo.afterPurchaseRedirectType);
    }

    public final int hashCode() {
        String str = this.afterPurchasePopup;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.afterPurchaseToast;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.afterPurchaseToastRedirectUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.afterPurchasePopupRedirectUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.afterPurchaseRedirectType;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPurchaseInfo(afterPurchasePopup=");
        sbLIZ.append(this.afterPurchasePopup);
        sbLIZ.append(", afterPurchaseToast=");
        sbLIZ.append(this.afterPurchaseToast);
        sbLIZ.append(", afterPurchaseToastRedirectUrl=");
        sbLIZ.append(this.afterPurchaseToastRedirectUrl);
        sbLIZ.append(", afterPurchasePopupRedirectUrl=");
        sbLIZ.append(this.afterPurchasePopupRedirectUrl);
        sbLIZ.append(", afterPurchaseRedirectType=");
        sbLIZ.append(this.afterPurchaseRedirectType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PostPurchaseInfo(String str, String str2, String str3, String str4, Integer num) {
        this.afterPurchasePopup = str;
        this.afterPurchaseToast = str2;
        this.afterPurchaseToastRedirectUrl = str3;
        this.afterPurchasePopupRedirectUrl = str4;
        this.afterPurchaseRedirectType = num;
    }
}
