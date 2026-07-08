package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetailItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceDescDetail implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("price_desc_detail_items")
    public List<PriceDescDetailItem> priceDescDetailItems;
    public static final Parcelable.Creator<PriceDescDetail> CREATOR = new Parcelable.Creator<PriceDescDetail>() { // from class: X.02Hm
        @Override // android.os.Parcelable.Creator
        public final PriceDescDetail createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PriceDescDetailItem.CREATOR.createFromParcel(parcel));
            }
            return new PriceDescDetail(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDescDetail[] newArray(int i) {
            return new PriceDescDetail[i];
        }
    };
    public static final int $stable = 8;

    public PriceDescDetail() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDescDetail)) {
            return false;
        }
        PriceDescDetail priceDescDetail = (PriceDescDetail) obj;
        return Intrinsics.LJFF(this.daInfo, priceDescDetail.daInfo) && Intrinsics.LJFF(this.priceDescDetailItems, priceDescDetail.priceDescDetailItems);
    }

    public final int hashCode() {
        String str = this.daInfo;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.priceDescDetailItems.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceDescDetail(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", priceDescDetailItems=");
        sbLIZ.append(this.priceDescDetailItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.daInfo);
        List<PriceDescDetailItem> list = this.priceDescDetailItems;
        parcel.writeInt(list.size());
        Iterator<PriceDescDetailItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public PriceDescDetail(String str, List<PriceDescDetailItem> list) {
        this.daInfo = str;
        this.priceDescDetailItems = list;
    }
}
