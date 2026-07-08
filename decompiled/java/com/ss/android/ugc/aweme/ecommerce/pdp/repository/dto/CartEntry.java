package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CartEntry implements Parcelable {
    public static final Parcelable.Creator<CartEntry> CREATOR = new Parcelable.Creator<CartEntry>() { // from class: X.0vT3
        @Override // android.os.Parcelable.Creator
        public final CartEntry createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new CartEntry(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CartEntry[] newArray(int i) {
            return new CartEntry[i];
        }
    };

    @C09CT("item_count")
    public final Integer itemCount;

    @C09CT("link")
    public final String link;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        return Intrinsics.LJFF(this.link, cartEntry.link) && Intrinsics.LJFF(this.itemCount, cartEntry.itemCount);
    }

    public final int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemCount;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CartEntry(link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.itemCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.link);
        Integer num = this.itemCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public CartEntry(String str, Integer num) {
        this.link = str;
        this.itemCount = num;
    }
}
