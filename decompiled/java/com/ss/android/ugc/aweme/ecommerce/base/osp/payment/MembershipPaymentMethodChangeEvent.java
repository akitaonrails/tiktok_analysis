package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MembershipPaymentMethodChangeEvent {

    @C09CT("dark_icon_url")
    public final String darkIconUrl;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipPaymentMethodChangeEvent)) {
            return false;
        }
        MembershipPaymentMethodChangeEvent membershipPaymentMethodChangeEvent = (MembershipPaymentMethodChangeEvent) obj;
        return Intrinsics.LJFF(this.type, membershipPaymentMethodChangeEvent.type) && Intrinsics.LJFF(this.paymentMethodId, membershipPaymentMethodChangeEvent.paymentMethodId) && Intrinsics.LJFF(this.paymentMethodToken, membershipPaymentMethodChangeEvent.paymentMethodToken) && Intrinsics.LJFF(this.displayName, membershipPaymentMethodChangeEvent.displayName) && Intrinsics.LJFF(this.iconUrl, membershipPaymentMethodChangeEvent.iconUrl) && Intrinsics.LJFF(this.darkIconUrl, membershipPaymentMethodChangeEvent.darkIconUrl);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.darkIconUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MembershipPaymentMethodChangeEvent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", paymentMethodId=");
        sbLIZ.append(this.paymentMethodId);
        sbLIZ.append(", paymentMethodToken=");
        sbLIZ.append(this.paymentMethodToken);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", darkIconUrl=");
        sbLIZ.append(this.darkIconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MembershipPaymentMethodChangeEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.paymentMethodId = str2;
        this.paymentMethodToken = str3;
        this.displayName = str4;
        this.iconUrl = str5;
        this.darkIconUrl = str6;
    }
}
