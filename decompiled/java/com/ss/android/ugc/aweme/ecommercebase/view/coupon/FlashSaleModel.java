package com.ss.android.ugc.aweme.ecommercebase.view.coupon;

import X.C09CT;
import X.C18QH;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleModel implements Parcelable {

    @C09CT("countdown")
    public final String countdown;
    public static final C18QH Companion = new Object() { // from class: X.18QH
    };
    public static final Parcelable.Creator<FlashSaleModel> CREATOR = new Parcelable.Creator<FlashSaleModel>() { // from class: X.18QG
        @Override // android.os.Parcelable.Creator
        public final FlashSaleModel createFromParcel(Parcel parcel) {
            return new FlashSaleModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlashSaleModel[] newArray(int i) {
            return new FlashSaleModel[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashSaleModel) && Intrinsics.LJFF(this.countdown, ((FlashSaleModel) obj).countdown);
    }

    public final int hashCode() {
        String str = this.countdown;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleModel(countdown=");
        sbLIZ.append(this.countdown);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.countdown);
    }

    public FlashSaleModel(String str) {
        this.countdown = str;
    }
}
