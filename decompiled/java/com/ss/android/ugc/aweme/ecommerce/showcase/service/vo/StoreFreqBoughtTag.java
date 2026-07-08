package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreFreqBoughtTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreFreqBoughtTag implements Parcelable {
    public static final Parcelable.Creator<StoreFreqBoughtTag> CREATOR = new Parcelable.Creator<StoreFreqBoughtTag>() { // from class: X.02UG
        @Override // android.os.Parcelable.Creator
        public final StoreFreqBoughtTag createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new StoreFreqBoughtTag(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreFreqBoughtTag[] newArray(int i) {
            return new StoreFreqBoughtTag[i];
        }
    };

    @C09CT("customer_count")
    public Integer customer_count;

    @C09CT("fmt_customer_count")
    public String fmt_customer_count;

    public StoreFreqBoughtTag() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreFreqBoughtTag)) {
            return false;
        }
        StoreFreqBoughtTag storeFreqBoughtTag = (StoreFreqBoughtTag) obj;
        return Intrinsics.LJFF(this.customer_count, storeFreqBoughtTag.customer_count) && Intrinsics.LJFF(this.fmt_customer_count, storeFreqBoughtTag.fmt_customer_count);
    }

    public final int hashCode() {
        Integer num = this.customer_count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fmt_customer_count;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreFreqBoughtTag(customer_count=");
        sbLIZ.append(this.customer_count);
        sbLIZ.append(", fmt_customer_count=");
        sbLIZ.append(this.fmt_customer_count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.customer_count;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.fmt_customer_count);
    }

    public StoreFreqBoughtTag(Integer num, String str) {
        this.customer_count = num;
        this.fmt_customer_count = str;
    }
}
