package com.bytedance.android.livesdk.model.message.ext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionView implements Parcelable, Serializable {
    public static final Parcelable.Creator<PromotionView> CREATOR = new Parcelable.Creator<PromotionView>() { // from class: X.02Zh
        @Override // android.os.Parcelable.Creator
        public final PromotionView createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PromotionItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new PromotionView(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionView[] newArray(int i) {
            return new PromotionView[i];
        }
    };

    @C09CT("coupon_schema")
    public String coupon_schema;

    @C09CT("promotion_items")
    public List<PromotionItem> promotion_items;

    public PromotionView() {
        this(null, null);
    }

    public final PromotionView copy(List<PromotionItem> list, String str) {
        return new PromotionView(list, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionView)) {
            return false;
        }
        PromotionView promotionView = (PromotionView) obj;
        return Intrinsics.LJFF(this.promotion_items, promotionView.promotion_items) && Intrinsics.LJFF(this.coupon_schema, promotionView.coupon_schema);
    }

    public int hashCode() {
        List<PromotionItem> list = this.promotion_items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.coupon_schema;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionView(promotion_items=");
        sbLIZ.append(this.promotion_items);
        sbLIZ.append(", coupon_schema=");
        sbLIZ.append(this.coupon_schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PromotionItem> list = this.promotion_items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.coupon_schema);
    }

    public final String getCoupon_schema() {
        return this.coupon_schema;
    }

    public final List<PromotionItem> getPromotion_items() {
        return this.promotion_items;
    }

    public PromotionView(List<PromotionItem> list, String str) {
        this.promotion_items = list;
        this.coupon_schema = str;
    }
}
