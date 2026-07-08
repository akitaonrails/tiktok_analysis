package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdownItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TotalAmountInnerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentBreakdownItem implements Parcelable {
    public String image;

    @C09CT("installment_amount_inner_item")
    public TotalAmountInnerItem installmentAmountInnerItem;

    @C09CT("plan")
    public InstallmentPlan plan;

    @C09CT("product_name")
    public String productName;

    @C09CT("quantity")
    public Integer quantity;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sku_pic")
    public String skuPic;
    public static final Parcelable.Creator<InstallmentBreakdownItem> CREATOR = new Parcelable.Creator<InstallmentBreakdownItem>() { // from class: X.02pX
        @Override // android.os.Parcelable.Creator
        public final InstallmentBreakdownItem createFromParcel(Parcel parcel) {
            InstallmentPlan installmentPlanCreateFromParcel;
            Integer numValueOf;
            String string = parcel.readString();
            TotalAmountInnerItem totalAmountInnerItemCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                installmentPlanCreateFromParcel = null;
            } else {
                installmentPlanCreateFromParcel = InstallmentPlan.CREATOR.createFromParcel(parcel);
            }
            InstallmentPlan installmentPlan = installmentPlanCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                totalAmountInnerItemCreateFromParcel = TotalAmountInnerItem.CREATOR.createFromParcel(parcel);
            }
            return new InstallmentBreakdownItem(string, installmentPlan, numValueOf, totalAmountInnerItemCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentBreakdownItem[] newArray(int i) {
            return new InstallmentBreakdownItem[i];
        }
    };
    public static final int $stable = 8;

    public InstallmentBreakdownItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentBreakdownItem)) {
            return false;
        }
        InstallmentBreakdownItem installmentBreakdownItem = (InstallmentBreakdownItem) obj;
        return Intrinsics.LJFF(this.skuId, installmentBreakdownItem.skuId) && Intrinsics.LJFF(this.plan, installmentBreakdownItem.plan) && Intrinsics.LJFF(this.quantity, installmentBreakdownItem.quantity) && Intrinsics.LJFF(this.installmentAmountInnerItem, installmentBreakdownItem.installmentAmountInnerItem) && Intrinsics.LJFF(this.productName, installmentBreakdownItem.productName) && Intrinsics.LJFF(this.skuPic, installmentBreakdownItem.skuPic) && Intrinsics.LJFF(this.image, installmentBreakdownItem.image);
    }

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InstallmentPlan installmentPlan = this.plan;
        int iHashCode2 = (iHashCode + (installmentPlan == null ? 0 : installmentPlan.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TotalAmountInnerItem totalAmountInnerItem = this.installmentAmountInnerItem;
        int iHashCode4 = (iHashCode3 + (totalAmountInnerItem == null ? 0 : totalAmountInnerItem.hashCode())) * 31;
        String str2 = this.productName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuPic;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstallmentBreakdownItem(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", plan=");
        sbLIZ.append(this.plan);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(", installmentAmountInnerItem=");
        sbLIZ.append(this.installmentAmountInnerItem);
        sbLIZ.append(", productName=");
        sbLIZ.append(this.productName);
        sbLIZ.append(", skuPic=");
        sbLIZ.append(this.skuPic);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skuId);
        InstallmentPlan installmentPlan = this.plan;
        if (installmentPlan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentPlan.writeToParcel(parcel, i);
        }
        Integer num = this.quantity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        TotalAmountInnerItem totalAmountInnerItem = this.installmentAmountInnerItem;
        if (totalAmountInnerItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            totalAmountInnerItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.productName);
        parcel.writeString(this.skuPic);
        parcel.writeString(this.image);
    }

    public InstallmentBreakdownItem(String str, InstallmentPlan installmentPlan, Integer num, TotalAmountInnerItem totalAmountInnerItem, String str2, String str3, String str4) {
        this.skuId = str;
        this.plan = installmentPlan;
        this.quantity = num;
        this.installmentAmountInnerItem = totalAmountInnerItem;
        this.productName = str2;
        this.skuPic = str3;
        this.image = str4;
    }
}
