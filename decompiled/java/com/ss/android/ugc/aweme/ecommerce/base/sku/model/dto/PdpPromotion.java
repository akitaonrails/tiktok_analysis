package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPromotion implements Parcelable {

    @C09CT("promotion_items")
    public List<PromotionItem> promotionItems;
    public static final Parcelable.Creator<PdpPromotion> CREATOR = new Parcelable.Creator<PdpPromotion>() { // from class: X.02Zi
        @Override // android.os.Parcelable.Creator
        public final PdpPromotion createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PdpPromotion.class.getClassLoader()));
                }
            }
            return new PdpPromotion(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpPromotion[] newArray(int i) {
            return new PdpPromotion[i];
        }
    };
    public static final int $stable = 8;

    public PdpPromotion() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PdpPromotion) && Intrinsics.LJFF(this.promotionItems, ((PdpPromotion) obj).promotionItems);
    }

    public final int hashCode() {
        List<PromotionItem> list = this.promotionItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpPromotion(promotionItems=");
        sbLIZ.append(this.promotionItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PromotionItem> list = this.promotionItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PromotionItem> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public PdpPromotion(List<PromotionItem> list) {
        this.promotionItems = list;
    }
}
