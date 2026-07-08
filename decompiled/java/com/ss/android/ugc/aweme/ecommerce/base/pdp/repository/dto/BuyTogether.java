package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyTogether;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BuyTogether implements Parcelable {

    @C09CT("position")
    public final Integer position;

    @C09CT("show")
    public final boolean show;
    public static final Parcelable.Creator<BuyTogether> CREATOR = new Parcelable.Creator<BuyTogether>() { // from class: X.03z2
        @Override // android.os.Parcelable.Creator
        public final BuyTogether createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BuyTogether(z, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BuyTogether[] newArray(int i) {
            return new BuyTogether[i];
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
        if (!(obj instanceof BuyTogether)) {
            return false;
        }
        BuyTogether buyTogether = (BuyTogether) obj;
        return this.show == buyTogether.show && Intrinsics.LJFF(this.position, buyTogether.position);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.show) * 31;
        Integer num = this.position;
        return iZ2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BuyTogether(show=");
        sbLIZ.append(this.show);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.show ? 1 : 0);
        Integer num = this.position;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BuyTogether(boolean z, Integer num) {
        this.show = z;
        this.position = num;
    }
}
