package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneCredit {

    @C09CT("country_code")
    public String countryCode;

    @C09CT("hint")
    public String hint;

    @C09CT("phone_number")
    public String phoneNumber;

    @C09CT("sample_num")
    public String sampleNum;

    public PhoneCredit() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneCredit)) {
            return false;
        }
        PhoneCredit phoneCredit = (PhoneCredit) obj;
        return Intrinsics.LJFF(this.countryCode, phoneCredit.countryCode) && Intrinsics.LJFF(this.phoneNumber, phoneCredit.phoneNumber) && Intrinsics.LJFF(this.hint, phoneCredit.hint) && Intrinsics.LJFF(this.sampleNum, phoneCredit.sampleNum);
    }

    public final int hashCode() {
        String str = this.countryCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sampleNum;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public PhoneCredit(String str, String str2, String str3, String str4) {
        this.countryCode = str;
        this.phoneNumber = str2;
        this.hint = str3;
        this.sampleNum = str4;
    }
}
