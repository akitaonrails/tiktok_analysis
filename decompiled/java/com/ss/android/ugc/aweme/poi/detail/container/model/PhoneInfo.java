package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PhoneInfo implements Serializable {

    @C09CT("country_calling_code")
    public final String countryCallingCode;

    @C09CT("phone_number")
    public final String phoneNumber;

    @C09CT("phone_prefix")
    public final String phonePrefix;

    public PhoneInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneInfo)) {
            return false;
        }
        PhoneInfo phoneInfo = (PhoneInfo) obj;
        return Intrinsics.LJFF(this.phoneNumber, phoneInfo.phoneNumber) && Intrinsics.LJFF(this.phonePrefix, phoneInfo.phonePrefix) && Intrinsics.LJFF(this.countryCallingCode, phoneInfo.countryCallingCode);
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phonePrefix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCallingCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneInfo(phoneNumber=");
        sbLIZ.append(this.phoneNumber);
        sbLIZ.append(", phonePrefix=");
        sbLIZ.append(this.phonePrefix);
        sbLIZ.append(", countryCallingCode=");
        sbLIZ.append(this.countryCallingCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhoneInfo(String str, String str2, String str3) {
        this.phoneNumber = str;
        this.phonePrefix = str2;
        this.countryCallingCode = str3;
    }
}
