package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyTogether;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LazyLoadInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyLoadInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LazyLoadInfo> CREATOR = new Parcelable.Creator<LazyLoadInfo>() { // from class: X.03z1
        @Override // android.os.Parcelable.Creator
        public final LazyLoadInfo createFromParcel(Parcel parcel) {
            BuyTogether buyTogetherCreateFromParcel;
            if (parcel.readInt() == 0) {
                buyTogetherCreateFromParcel = null;
            } else {
                buyTogetherCreateFromParcel = BuyTogether.CREATOR.createFromParcel(parcel);
            }
            return new LazyLoadInfo(buyTogetherCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LazyLoadInfo[] newArray(int i) {
            return new LazyLoadInfo[i];
        }
    };

    @C09CT("buy_together_brief")
    public final BuyTogether buyTogether;

    public LazyLoadInfo() {
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
        return (obj instanceof LazyLoadInfo) && Intrinsics.LJFF(this.buyTogether, ((LazyLoadInfo) obj).buyTogether);
    }

    public final int hashCode() {
        BuyTogether buyTogether = this.buyTogether;
        if (buyTogether == null) {
            return 0;
        }
        return buyTogether.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyLoadInfo(buyTogether=");
        sbLIZ.append(this.buyTogether);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BuyTogether buyTogether = this.buyTogether;
        if (buyTogether == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyTogether.writeToParcel(parcel, i);
        }
    }

    public LazyLoadInfo(BuyTogether buyTogether) {
        this.buyTogether = buyTogether;
    }
}
