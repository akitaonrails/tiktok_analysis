package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1053504Ab;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageSkuItem implements InterfaceC1053504Ab, Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("minimum_buy_quantity")
    public final Integer minBuyQuantity;

    @C09CT("sale_prop_value_ids")
    public final String salePropValueIds;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_sale_props")
    public final List<SkuSaleProp> skuSalePropList;

    @C09CT("stock")
    public final Integer stockNum;
    public static final Parcelable.Creator<PageSkuItem> CREATOR = new Parcelable.Creator<PageSkuItem>() { // from class: X.02oW
        @Override // android.os.Parcelable.Creator
        public final PageSkuItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuSaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PageSkuItem(string, arrayList, string2, numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PageSkuItem[] newArray(int i) {
            return new PageSkuItem[i];
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
        if (!(obj instanceof PageSkuItem)) {
            return false;
        }
        PageSkuItem pageSkuItem = (PageSkuItem) obj;
        return Intrinsics.LJFF(this.skuId, pageSkuItem.skuId) && Intrinsics.LJFF(this.skuSalePropList, pageSkuItem.skuSalePropList) && Intrinsics.LJFF(this.salePropValueIds, pageSkuItem.salePropValueIds) && Intrinsics.LJFF(this.stockNum, pageSkuItem.stockNum) && Intrinsics.LJFF(this.minBuyQuantity, pageSkuItem.minBuyQuantity) && Intrinsics.LJFF(this.daInfo, pageSkuItem.daInfo);
    }

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SkuSaleProp> list = this.skuSalePropList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.salePropValueIds;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.stockNum;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minBuyQuantity;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSkuItem(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", skuSalePropList=");
        sbLIZ.append(this.skuSalePropList);
        sbLIZ.append(", salePropValueIds=");
        sbLIZ.append(this.salePropValueIds);
        sbLIZ.append(", stockNum=");
        sbLIZ.append(this.stockNum);
        sbLIZ.append(", minBuyQuantity=");
        sbLIZ.append(this.minBuyQuantity);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skuId);
        List<SkuSaleProp> list = this.skuSalePropList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuSaleProp> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.salePropValueIds);
        Integer num = this.stockNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.minBuyQuantity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    @Override // X.InterfaceC1053504Ab
    public final List<SkuSaleProp> LIZ() {
        return this.skuSalePropList;
    }

    @Override // X.InterfaceC1053504Ab
    public final Integer LIZIZ() {
        return this.stockNum;
    }

    @Override // X.InterfaceC1053504Ab
    public final String LIZJ() {
        return this.salePropValueIds;
    }

    @Override // X.InterfaceC1053504Ab
    public final Integer LIZLLL() {
        return this.minBuyQuantity;
    }

    @Override // X.InterfaceC1053504Ab
    public final String getDaInfo() {
        return this.daInfo;
    }

    @Override // X.InterfaceC1053504Ab
    public final String getSkuId() {
        return this.skuId;
    }

    public PageSkuItem(String str, List<SkuSaleProp> list, String str2, Integer num, Integer num2, String str3) {
        this.skuId = str;
        this.skuSalePropList = list;
        this.salePropValueIds = str2;
        this.stockNum = num;
        this.minBuyQuantity = num2;
        this.daInfo = str3;
    }
}
