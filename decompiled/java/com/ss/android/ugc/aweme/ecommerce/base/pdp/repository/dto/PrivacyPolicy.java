package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivacyPolicy implements Parcelable {

    @C09CT("btn_text")
    public String buttonText;

    @C09CT("link")
    public String link;

    @C09CT("name_en")
    public String nameEn;

    @C09CT("privacy_policy_type")
    public Integer policyType;
    public static final Parcelable.Creator<PrivacyPolicy> CREATOR = new Parcelable.Creator<PrivacyPolicy>() { // from class: X.02XY
        @Override // android.os.Parcelable.Creator
        public final PrivacyPolicy createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PrivacyPolicy(numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyPolicy[] newArray(int i) {
            return new PrivacyPolicy[i];
        }
    };
    public static final int $stable = 8;

    public PrivacyPolicy() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyPolicy)) {
            return false;
        }
        PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
        return Intrinsics.LJFF(this.policyType, privacyPolicy.policyType) && Intrinsics.LJFF(this.buttonText, privacyPolicy.buttonText) && Intrinsics.LJFF(this.link, privacyPolicy.link) && Intrinsics.LJFF(this.nameEn, privacyPolicy.nameEn);
    }

    public final int hashCode() {
        Integer num = this.policyType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.buttonText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameEn;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyPolicy(policyType=");
        sbLIZ.append(this.policyType);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", nameEn=");
        sbLIZ.append(this.nameEn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.policyType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.link);
        parcel.writeString(this.nameEn);
    }

    public PrivacyPolicy(Integer num, String str, String str2, String str3) {
        this.policyType = num;
        this.buttonText = str;
        this.link = str2;
        this.nameEn = str3;
    }
}
