package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseMethodInfo implements Parcelable {

    @C09CT("item_list")
    public final List<PurchaseMethodItem> itemList;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<PurchaseMethodInfo> CREATOR = new Parcelable.Creator<PurchaseMethodInfo>() { // from class: X.03zZ
        @Override // android.os.Parcelable.Creator
        public final PurchaseMethodInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PurchaseMethodItem.CREATOR.createFromParcel(parcel));
            }
            return new PurchaseMethodInfo(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PurchaseMethodInfo[] newArray(int i) {
            return new PurchaseMethodInfo[i];
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
        if (!(obj instanceof PurchaseMethodInfo)) {
            return false;
        }
        PurchaseMethodInfo purchaseMethodInfo = (PurchaseMethodInfo) obj;
        return Intrinsics.LJFF(this.title, purchaseMethodInfo.title) && Intrinsics.LJFF(this.itemList, purchaseMethodInfo.itemList);
    }

    public final int hashCode() {
        String str = this.title;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.itemList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseMethodInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<PurchaseMethodItem> list = this.itemList;
        parcel.writeInt(list.size());
        Iterator<PurchaseMethodItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public PurchaseMethodInfo(String str, List<PurchaseMethodItem> list) {
        this.title = str;
        this.itemList = list;
    }
}
