package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C10311041l;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BnplInfo implements Parcelable {

    @C09CT("bnpl_promotion_tag_position")
    public final Integer bnplPromotionTagPosition;

    @C09CT("installment_plans")
    public final List<InstallmentPlan> installmentPlans;

    @C09CT("is_auth")
    public final Boolean isAuth;

    @C09CT("is_eligible_for_promo")
    public final Boolean isEligibleForPromo;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    @C09CT("title")
    public final String title;
    public static final C10311041l TagPosition = new Object() { // from class: X.041l
    };
    public static final Parcelable.Creator<BnplInfo> CREATOR = new Parcelable.Creator<BnplInfo>() { // from class: X.041k
        @Override // android.os.Parcelable.Creator
        public final BnplInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            boolean z2 = true;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InstallmentPlan.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BnplInfo(boolValueOf, string, string2, boolValueOf2, arrayList, string3, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BnplInfo[] newArray(int i) {
            return new BnplInfo[i];
        }
    };
    public static final int $stable = 8;

    public BnplInfo() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplInfo)) {
            return false;
        }
        BnplInfo bnplInfo = (BnplInfo) obj;
        return Intrinsics.LJFF(this.isAuth, bnplInfo.isAuth) && Intrinsics.LJFF(this.title, bnplInfo.title) && Intrinsics.LJFF(this.text, bnplInfo.text) && Intrinsics.LJFF(this.isEligibleForPromo, bnplInfo.isEligibleForPromo) && Intrinsics.LJFF(this.installmentPlans, bnplInfo.installmentPlans) && Intrinsics.LJFF(this.schema, bnplInfo.schema) && Intrinsics.LJFF(this.bnplPromotionTagPosition, bnplInfo.bnplPromotionTagPosition);
    }

    public final int hashCode() {
        Boolean bool = this.isAuth;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isEligibleForPromo;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<InstallmentPlan> list = this.installmentPlans;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.bnplPromotionTagPosition;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BnplInfo(isAuth=");
        sbLIZ.append(this.isAuth);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", isEligibleForPromo=");
        sbLIZ.append(this.isEligibleForPromo);
        sbLIZ.append(", installmentPlans=");
        sbLIZ.append(this.installmentPlans);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", bnplPromotionTagPosition=");
        sbLIZ.append(this.bnplPromotionTagPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAuth;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        Boolean bool2 = this.isEligibleForPromo;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<InstallmentPlan> list = this.installmentPlans;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InstallmentPlan> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.schema);
        Integer num = this.bnplPromotionTagPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public BnplInfo(Boolean bool, String str, String str2, Boolean bool2, List<InstallmentPlan> list, String str3, Integer num) {
        this.isAuth = bool;
        this.title = str;
        this.text = str2;
        this.isEligibleForPromo = bool2;
        this.installmentPlans = list;
        this.schema = str3;
        this.bnplPromotionTagPosition = num;
    }
}
