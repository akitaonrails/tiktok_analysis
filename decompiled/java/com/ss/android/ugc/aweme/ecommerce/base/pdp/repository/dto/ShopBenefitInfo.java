package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopBenefitInfo implements Parcelable {

    @C09CT("benefit_type")
    public Integer benefitType;

    @C09CT("normal_shop_benefit_details")
    public List<ShopBenefitDetail> normalBenefitDetails;
    public static final Parcelable.Creator<ShopBenefitInfo> CREATOR = new Parcelable.Creator<ShopBenefitInfo>() { // from class: X.02ZX
        @Override // android.os.Parcelable.Creator
        public final ShopBenefitInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ShopBenefitDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new ShopBenefitInfo(numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShopBenefitInfo[] newArray(int i) {
            return new ShopBenefitInfo[i];
        }
    };
    public static final int $stable = 8;

    public ShopBenefitInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBenefitInfo)) {
            return false;
        }
        ShopBenefitInfo shopBenefitInfo = (ShopBenefitInfo) obj;
        return Intrinsics.LJFF(this.benefitType, shopBenefitInfo.benefitType) && Intrinsics.LJFF(this.normalBenefitDetails, shopBenefitInfo.normalBenefitDetails);
    }

    public final int hashCode() {
        Integer num = this.benefitType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ShopBenefitDetail> list = this.normalBenefitDetails;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopBenefitInfo(benefitType=");
        sbLIZ.append(this.benefitType);
        sbLIZ.append(", normalBenefitDetails=");
        sbLIZ.append(this.normalBenefitDetails);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.benefitType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ShopBenefitDetail> list = this.normalBenefitDetails;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ShopBenefitDetail> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ShopBenefitInfo(Integer num, List<ShopBenefitDetail> list) {
        this.benefitType = num;
        this.normalBenefitDetails = list;
    }
}
