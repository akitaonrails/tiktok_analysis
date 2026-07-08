package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Promotion implements Parcelable {

    @C09CT("promotion_id")
    public String promotionId;
    public static final Parcelable.Creator<Promotion> CREATOR = new Parcelable.Creator<Promotion>() { // from class: X.02Hs
        @Override // android.os.Parcelable.Creator
        public final Promotion createFromParcel(Parcel parcel) {
            return new Promotion(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Promotion[] newArray(int i) {
            return new Promotion[i];
        }
    };
    public static final int $stable = 8;

    public Promotion() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Promotion) && Intrinsics.LJFF(this.promotionId, ((Promotion) obj).promotionId);
    }

    public final int hashCode() {
        String str = this.promotionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Promotion(promotionId=");
        sbLIZ.append(this.promotionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promotionId);
    }

    public Promotion(String str) {
        this.promotionId = str;
    }
}
