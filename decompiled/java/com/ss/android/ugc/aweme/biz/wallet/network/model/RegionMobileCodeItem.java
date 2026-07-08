package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import X.C1718040uoE;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RegionMobileCodeItem implements Parcelable, Serializable {
    public static final C1718040uoE CREATOR = new Parcelable.Creator<RegionMobileCodeItem>() { // from class: X.0uoE
        @Override // android.os.Parcelable.Creator
        public final RegionMobileCodeItem createFromParcel(Parcel parcel) {
            return new RegionMobileCodeItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RegionMobileCodeItem[] newArray(int i) {
            return new RegionMobileCodeItem[i];
        }
    };

    @C09CT("country_code_alpha2")
    public final String alpha2;

    @C09CT("mobile_code")
    public final String mobileCode;

    @C09CT("mobile_rule_list")
    public final ArrayList<PhoneRule> mobileRuleList;

    @C09CT("order_list")
    public ArrayList<String> orderList;

    public final RegionMobileCodeItem copy(ArrayList<String> arrayList, String str, String str2, ArrayList<PhoneRule> arrayList2) {
        return new RegionMobileCodeItem(arrayList, str, str2, arrayList2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionMobileCodeItem)) {
            return false;
        }
        RegionMobileCodeItem regionMobileCodeItem = (RegionMobileCodeItem) obj;
        return Intrinsics.LJFF(this.orderList, regionMobileCodeItem.orderList) && Intrinsics.LJFF(this.alpha2, regionMobileCodeItem.alpha2) && Intrinsics.LJFF(this.mobileCode, regionMobileCodeItem.mobileCode) && Intrinsics.LJFF(this.mobileRuleList, regionMobileCodeItem.mobileRuleList);
    }

    public int hashCode() {
        return (((((this.orderList.hashCode() * 31) + this.alpha2.hashCode()) * 31) + this.mobileCode.hashCode()) * 31) + this.mobileRuleList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegionMobileCodeItem(orderList=");
        sbLIZ.append(this.orderList);
        sbLIZ.append(", alpha2=");
        sbLIZ.append(this.alpha2);
        sbLIZ.append(", mobileCode=");
        sbLIZ.append(this.mobileCode);
        sbLIZ.append(", mobileRuleList=");
        sbLIZ.append(this.mobileRuleList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAlpha2() {
        return this.alpha2;
    }

    public final String getMobileCode() {
        return this.mobileCode;
    }

    public final ArrayList<PhoneRule> getMobileRuleList() {
        return this.mobileRuleList;
    }

    public final ArrayList<String> getOrderList() {
        return this.orderList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RegionMobileCodeItem(Parcel parcel) {
        ArrayList arrayList = parcel.readArrayList(String.class.getClassLoader());
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        this(arrayList, string, string2 != null ? string2 : "", parcel.readArrayList(PhoneRule.class.getClassLoader()));
    }

    public final void setOrderList(ArrayList<String> arrayList) {
        this.orderList = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.orderList);
        parcel.writeString(this.alpha2);
        parcel.writeString(this.mobileCode);
        parcel.writeList(this.mobileRuleList);
    }

    public RegionMobileCodeItem(ArrayList<String> arrayList, String str, String str2, ArrayList<PhoneRule> arrayList2) {
        this.orderList = arrayList;
        this.alpha2 = str;
        this.mobileCode = str2;
        this.mobileRuleList = arrayList2;
    }
}
