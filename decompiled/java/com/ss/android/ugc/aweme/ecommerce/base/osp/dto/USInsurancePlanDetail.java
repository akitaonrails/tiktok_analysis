package com.ss.android.ugc.aweme.ecommerce.base.osp.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.USInsurancePlanDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USInsurancePlanDetail implements Parcelable {

    @C09CT("description")
    public String description;

    @C09CT("insurance_product_infos")
    public List<InsuranceInfo> insuranceProductInfos;

    @C09CT("insurance_protection_code")
    public String insuranceProtectionCode;

    @C09CT("insurance_protection_type")
    public String insuranceProtectionType;

    @C09CT("what_is_covered")
    public String whatIsCovered;

    @C09CT("what_is_covered_url")
    public String whatIsCoveredUrl;
    public static final Parcelable.Creator<USInsurancePlanDetail> CREATOR = new Parcelable.Creator<USInsurancePlanDetail>() { // from class: X.02Hk
        @Override // android.os.Parcelable.Creator
        public final USInsurancePlanDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new USInsurancePlanDetail(string, string2, string3, string4, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final USInsurancePlanDetail[] newArray(int i) {
            return new USInsurancePlanDetail[i];
        }
    };
    public static final int $stable = 8;

    public USInsurancePlanDetail() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USInsurancePlanDetail)) {
            return false;
        }
        USInsurancePlanDetail uSInsurancePlanDetail = (USInsurancePlanDetail) obj;
        return Intrinsics.LJFF(this.insuranceProtectionCode, uSInsurancePlanDetail.insuranceProtectionCode) && Intrinsics.LJFF(this.description, uSInsurancePlanDetail.description) && Intrinsics.LJFF(this.whatIsCovered, uSInsurancePlanDetail.whatIsCovered) && Intrinsics.LJFF(this.whatIsCoveredUrl, uSInsurancePlanDetail.whatIsCoveredUrl) && Intrinsics.LJFF(this.insuranceProductInfos, uSInsurancePlanDetail.insuranceProductInfos) && Intrinsics.LJFF(this.insuranceProtectionType, uSInsurancePlanDetail.insuranceProtectionType);
    }

    public final int hashCode() {
        String str = this.insuranceProtectionCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.whatIsCovered;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.whatIsCoveredUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<InsuranceInfo> list = this.insuranceProductInfos;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.insuranceProtectionType;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USInsurancePlanDetail(insuranceProtectionCode=");
        sbLIZ.append(this.insuranceProtectionCode);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", whatIsCovered=");
        sbLIZ.append(this.whatIsCovered);
        sbLIZ.append(", whatIsCoveredUrl=");
        sbLIZ.append(this.whatIsCoveredUrl);
        sbLIZ.append(", insuranceProductInfos=");
        sbLIZ.append(this.insuranceProductInfos);
        sbLIZ.append(", insuranceProtectionType=");
        sbLIZ.append(this.insuranceProtectionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.insuranceProtectionCode);
        parcel.writeString(this.description);
        parcel.writeString(this.whatIsCovered);
        parcel.writeString(this.whatIsCoveredUrl);
        List<InsuranceInfo> list = this.insuranceProductInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InsuranceInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeString(this.insuranceProtectionType);
    }

    public USInsurancePlanDetail(String str, String str2, String str3, String str4, List<InsuranceInfo> list, String str5) {
        this.insuranceProtectionCode = str;
        this.description = str2;
        this.whatIsCovered = str3;
        this.whatIsCoveredUrl = str4;
        this.insuranceProductInfos = list;
        this.insuranceProtectionType = str5;
    }
}
