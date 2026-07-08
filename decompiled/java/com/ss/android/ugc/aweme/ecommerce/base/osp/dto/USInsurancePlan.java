package com.ss.android.ugc.aweme.ecommerce.base.osp.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.USInsurancePlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.USInsurancePlanDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USInsurancePlan implements Parcelable {

    @C09CT("insurance_plan_detail")
    public List<USInsurancePlanDetail> insurancePlanDetail;

    @C09CT("insurance_token")
    public String insuranceToken;

    @C09CT("power_by")
    public String powerBy;

    @C09CT("power_by_icon")
    public Icon powerByIcon;

    @C09CT("product_id")
    public Long productId;

    @C09CT("sku_id")
    public Long skuId;
    public static final Parcelable.Creator<USInsurancePlan> CREATOR = new Parcelable.Creator<USInsurancePlan>() { // from class: X.02Hj
        @Override // android.os.Parcelable.Creator
        public final USInsurancePlan createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            Icon icon = (Icon) parcel.readParcelable(USInsurancePlan.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(USInsurancePlanDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new USInsurancePlan(lValueOf, lValueOf2, icon, string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final USInsurancePlan[] newArray(int i) {
            return new USInsurancePlan[i];
        }
    };
    public static final int $stable = 8;

    public USInsurancePlan() {
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
        if (!(obj instanceof USInsurancePlan)) {
            return false;
        }
        USInsurancePlan uSInsurancePlan = (USInsurancePlan) obj;
        return Intrinsics.LJFF(this.skuId, uSInsurancePlan.skuId) && Intrinsics.LJFF(this.productId, uSInsurancePlan.productId) && Intrinsics.LJFF(this.powerByIcon, uSInsurancePlan.powerByIcon) && Intrinsics.LJFF(this.powerBy, uSInsurancePlan.powerBy) && Intrinsics.LJFF(this.insurancePlanDetail, uSInsurancePlan.insurancePlanDetail) && Intrinsics.LJFF(this.insuranceToken, uSInsurancePlan.insuranceToken);
    }

    public final int hashCode() {
        Long l = this.skuId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.productId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Icon icon = this.powerByIcon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.powerBy;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<USInsurancePlanDetail> list = this.insurancePlanDetail;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.insuranceToken;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USInsurancePlan(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", powerByIcon=");
        sbLIZ.append(this.powerByIcon);
        sbLIZ.append(", powerBy=");
        sbLIZ.append(this.powerBy);
        sbLIZ.append(", insurancePlanDetail=");
        sbLIZ.append(this.insurancePlanDetail);
        sbLIZ.append(", insuranceToken=");
        sbLIZ.append(this.insuranceToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.skuId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.productId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeParcelable(this.powerByIcon, i);
        parcel.writeString(this.powerBy);
        List<USInsurancePlanDetail> list = this.insurancePlanDetail;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<USInsurancePlanDetail> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.insuranceToken);
    }

    public USInsurancePlan(Long l, Long l2, Icon icon, String str, List<USInsurancePlanDetail> list, String str2) {
        this.skuId = l;
        this.productId = l2;
        this.powerByIcon = icon;
        this.powerBy = str;
        this.insurancePlanDetail = list;
        this.insuranceToken = str2;
    }
}
