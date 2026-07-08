package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TotalAmountInnerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TotalAmountInnerItem implements Parcelable {

    @C09CT("key")
    public String key;

    @C09CT("value")
    public String value;
    public static final Parcelable.Creator<TotalAmountInnerItem> CREATOR = new Parcelable.Creator<TotalAmountInnerItem>() { // from class: X.02pZ
        @Override // android.os.Parcelable.Creator
        public final TotalAmountInnerItem createFromParcel(Parcel parcel) {
            return new TotalAmountInnerItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TotalAmountInnerItem[] newArray(int i) {
            return new TotalAmountInnerItem[i];
        }
    };
    public static final int $stable = 8;

    public TotalAmountInnerItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalAmountInnerItem)) {
            return false;
        }
        TotalAmountInnerItem totalAmountInnerItem = (TotalAmountInnerItem) obj;
        return Intrinsics.LJFF(this.key, totalAmountInnerItem.key) && Intrinsics.LJFF(this.value, totalAmountInnerItem.value);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TotalAmountInnerItem(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public TotalAmountInnerItem(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
