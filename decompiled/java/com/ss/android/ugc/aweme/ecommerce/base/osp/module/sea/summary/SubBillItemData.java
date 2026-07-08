package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SubBillItemData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubBillItemData implements Parcelable {
    public final String itemFee;
    public final Integer itemFeeColor;
    public final String itemName;
    public final String itemText;
    public final Integer itemTextColor;
    public final Integer itemType;
    public final String link;
    public final List<BillItem> subItems;
    public static final Parcelable.Creator<SubBillItemData> CREATOR = new Parcelable.Creator<SubBillItemData>() { // from class: X.02jl
        @Override // android.os.Parcelable.Creator
        public final SubBillItemData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BillItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new SubBillItemData(string, string2, numValueOf, string3, numValueOf2, numValueOf3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SubBillItemData[] newArray(int i) {
            return new SubBillItemData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubBillItemData)) {
            return false;
        }
        SubBillItemData subBillItemData = (SubBillItemData) obj;
        return Intrinsics.LJFF(this.itemName, subBillItemData.itemName) && Intrinsics.LJFF(this.itemFee, subBillItemData.itemFee) && Intrinsics.LJFF(this.itemFeeColor, subBillItemData.itemFeeColor) && Intrinsics.LJFF(this.link, subBillItemData.link) && Intrinsics.LJFF(this.itemTextColor, subBillItemData.itemTextColor) && Intrinsics.LJFF(this.itemType, subBillItemData.itemType) && Intrinsics.LJFF(this.itemText, subBillItemData.itemText) && Intrinsics.LJFF(this.subItems, subBillItemData.subItems);
    }

    public final int hashCode() {
        String str = this.itemName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemFee;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.itemFeeColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.itemTextColor;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemType;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.itemText;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BillItem> list = this.subItems;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubBillItemData(itemName=");
        sbLIZ.append(this.itemName);
        sbLIZ.append(", itemFee=");
        sbLIZ.append(this.itemFee);
        sbLIZ.append(", itemFeeColor=");
        sbLIZ.append(this.itemFeeColor);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", itemTextColor=");
        sbLIZ.append(this.itemTextColor);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", itemText=");
        sbLIZ.append(this.itemText);
        sbLIZ.append(", subItems=");
        sbLIZ.append(this.subItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemName);
        parcel.writeString(this.itemFee);
        Integer num = this.itemFeeColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.link);
        Integer num2 = this.itemTextColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.itemType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.itemText);
        List<BillItem> list = this.subItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<BillItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public SubBillItemData(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, List<BillItem> list) {
        this.itemName = str;
        this.itemFee = str2;
        this.itemFeeColor = num;
        this.link = str3;
        this.itemTextColor = num2;
        this.itemType = num3;
        this.itemText = str4;
        this.subItems = list;
    }
}
