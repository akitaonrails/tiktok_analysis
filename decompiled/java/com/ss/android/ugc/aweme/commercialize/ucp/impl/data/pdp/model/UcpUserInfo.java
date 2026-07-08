package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpUserInfo {

    @C09CT("email")
    public final String email;

    @C09CT("gaid")
    public final String gaid;

    @C09CT("locale")
    public final String locale;

    @C09CT("phone_number")
    public final String phoneNumber;

    @C09CT("ttclid")
    public final String ttclid;

    @C09CT("user_agent")
    public final String userAgent;

    public UcpUserInfo() {
        this(null, null, null, null, null, "en_US");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpUserInfo)) {
            return false;
        }
        UcpUserInfo ucpUserInfo = (UcpUserInfo) obj;
        return Intrinsics.LJFF(this.ttclid, ucpUserInfo.ttclid) && Intrinsics.LJFF(this.email, ucpUserInfo.email) && Intrinsics.LJFF(this.phoneNumber, ucpUserInfo.phoneNumber) && Intrinsics.LJFF(this.userAgent, ucpUserInfo.userAgent) && Intrinsics.LJFF(this.gaid, ucpUserInfo.gaid) && Intrinsics.LJFF(this.locale, ucpUserInfo.locale);
    }

    public final int hashCode() {
        String str = this.ttclid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userAgent;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gaid;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.locale.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpUserInfo(ttclid=");
        sbLIZ.append(this.ttclid);
        sbLIZ.append(", email=");
        sbLIZ.append(this.email);
        sbLIZ.append(", phoneNumber=");
        sbLIZ.append(this.phoneNumber);
        sbLIZ.append(", userAgent=");
        sbLIZ.append(this.userAgent);
        sbLIZ.append(", gaid=");
        sbLIZ.append(this.gaid);
        sbLIZ.append(", locale=");
        sbLIZ.append(this.locale);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpUserInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.ttclid = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.userAgent = str4;
        this.gaid = str5;
        this.locale = str6;
    }
}
