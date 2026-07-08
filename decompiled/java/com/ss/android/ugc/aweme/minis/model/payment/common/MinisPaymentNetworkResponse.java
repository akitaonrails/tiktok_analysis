package com.ss.android.ugc.aweme.minis.model.payment.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisPaymentNetworkResponse<T extends Parcelable> implements Parcelable {

    @C09CT("data")
    public final T data;

    @C09CT("errorCode")
    public Integer errorCode;
    public static final Parcelable.Creator<MinisPaymentNetworkResponse<?>> CREATOR = new Parcelable.Creator<MinisPaymentNetworkResponse<?>>() { // from class: X.0iMf
        @Override // android.os.Parcelable.Creator
        public final MinisPaymentNetworkResponse<?> createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Parcelable parcelable = parcel.readParcelable(MinisPaymentNetworkResponse.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisPaymentNetworkResponse<>(parcelable, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisPaymentNetworkResponse<?>[] newArray(int i) {
            return new MinisPaymentNetworkResponse[i];
        }
    };
    public static final int $stable = 8;

    public MinisPaymentNetworkResponse() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisPaymentNetworkResponse)) {
            return false;
        }
        MinisPaymentNetworkResponse minisPaymentNetworkResponse = (MinisPaymentNetworkResponse) obj;
        return Intrinsics.LJFF(this.data, minisPaymentNetworkResponse.data) && Intrinsics.LJFF(this.errorCode, minisPaymentNetworkResponse.errorCode);
    }

    public final int hashCode() {
        T t = this.data;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        Integer num = this.errorCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisPaymentNetworkResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.data, i);
        Integer num = this.errorCode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public MinisPaymentNetworkResponse(T t, Integer num) {
        this.data = t;
        this.errorCode = num;
    }
}
