package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdownItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TotalAmountInnerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentBreakdown implements Parcelable {

    @C09CT("desc")
    public String desc;

    @C09CT("item")
    public List<InstallmentBreakdownItem> item;

    @C09CT("link_name")
    public String linkName;

    @C09CT("title")
    public String title;

    @C09CT("total_amount")
    public Integer totalAmount;

    @C09CT("total_amount_inner_item")
    public TotalAmountInnerItem totalAmountInnerItem;
    public static final Parcelable.Creator<InstallmentBreakdown> CREATOR = new Parcelable.Creator<InstallmentBreakdown>() { // from class: X.02pY
        @Override // android.os.Parcelable.Creator
        public final InstallmentBreakdown createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            String string = parcel.readString();
            TotalAmountInnerItem totalAmountInnerItemCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InstallmentBreakdownItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                totalAmountInnerItemCreateFromParcel = TotalAmountInnerItem.CREATOR.createFromParcel(parcel);
            }
            return new InstallmentBreakdown(string, arrayList, numValueOf, totalAmountInnerItemCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentBreakdown[] newArray(int i) {
            return new InstallmentBreakdown[i];
        }
    };
    public static final int $stable = 8;

    public InstallmentBreakdown() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentBreakdown)) {
            return false;
        }
        InstallmentBreakdown installmentBreakdown = (InstallmentBreakdown) obj;
        return Intrinsics.LJFF(this.title, installmentBreakdown.title) && Intrinsics.LJFF(this.item, installmentBreakdown.item) && Intrinsics.LJFF(this.totalAmount, installmentBreakdown.totalAmount) && Intrinsics.LJFF(this.totalAmountInnerItem, installmentBreakdown.totalAmountInnerItem) && Intrinsics.LJFF(this.linkName, installmentBreakdown.linkName) && Intrinsics.LJFF(this.desc, installmentBreakdown.desc);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InstallmentBreakdownItem> list = this.item;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.totalAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        TotalAmountInnerItem totalAmountInnerItem = this.totalAmountInnerItem;
        int iHashCode4 = (iHashCode3 + (totalAmountInnerItem == null ? 0 : totalAmountInnerItem.hashCode())) * 31;
        String str2 = this.linkName;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstallmentBreakdown(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", item=");
        sbLIZ.append(this.item);
        sbLIZ.append(", totalAmount=");
        sbLIZ.append(this.totalAmount);
        sbLIZ.append(", totalAmountInnerItem=");
        sbLIZ.append(this.totalAmountInnerItem);
        sbLIZ.append(", linkName=");
        sbLIZ.append(this.linkName);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<InstallmentBreakdownItem> list = this.item;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InstallmentBreakdownItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.totalAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        TotalAmountInnerItem totalAmountInnerItem = this.totalAmountInnerItem;
        if (totalAmountInnerItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            totalAmountInnerItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.linkName);
        parcel.writeString(this.desc);
    }

    public InstallmentBreakdown(String str, List<InstallmentBreakdownItem> list, Integer num, TotalAmountInnerItem totalAmountInnerItem, String str2, String str3) {
        this.title = str;
        this.item = list;
        this.totalAmount = num;
        this.totalAmountInnerItem = totalAmountInnerItem;
        this.linkName = str2;
        this.desc = str3;
    }
}
