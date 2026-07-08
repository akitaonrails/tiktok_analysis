package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.MinisTierInfo;
import com.ss.android.ugc.aweme.minis.model.payment.RecommendedTierInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class RecommendedTierInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RecommendedTierInfo> CREATOR = new Parcelable.Creator<RecommendedTierInfo>() { // from class: X.1Azz
        @Override // android.os.Parcelable.Creator
        public final RecommendedTierInfo createFromParcel(Parcel parcel) {
            return new RecommendedTierInfo(MinisTierInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendedTierInfo[] newArray(int i) {
            return new RecommendedTierInfo[i];
        }
    };

    @C09CT("nearest_price")
    public final MinisTierInfo nearestPrice;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendedTierInfo) && Intrinsics.LJFF(this.nearestPrice, ((RecommendedTierInfo) obj).nearestPrice);
    }

    public final int hashCode() {
        return this.nearestPrice.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendedTierInfo(nearestPrice=");
        sbLIZ.append(this.nearestPrice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.nearestPrice.writeToParcel(parcel, i);
    }

    public RecommendedTierInfo() {
        this(new MinisTierInfo("", "", 0L, "", "", "", "", "", "", "", ""));
    }

    public RecommendedTierInfo(MinisTierInfo minisTierInfo) {
        this.nearestPrice = minisTierInfo;
    }
}
