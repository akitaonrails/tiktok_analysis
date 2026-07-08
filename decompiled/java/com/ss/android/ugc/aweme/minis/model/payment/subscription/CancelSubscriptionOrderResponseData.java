package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.CancelSubscriptionOrderResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CancelSubscriptionOrderResponseData implements Parcelable {

    @C09CT("already_succeeded")
    public final Boolean alreadySucceeded;

    @C09CT("is_sandbox")
    public final Boolean isSandbox;

    @C09CT("subscription_id")
    public final String subscriptionId;
    public static final Parcelable.Creator<CancelSubscriptionOrderResponseData> CREATOR = new Parcelable.Creator<CancelSubscriptionOrderResponseData>() { // from class: X.0iBW
        @Override // android.os.Parcelable.Creator
        public final CancelSubscriptionOrderResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new CancelSubscriptionOrderResponseData(string, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final CancelSubscriptionOrderResponseData[] newArray(int i) {
            return new CancelSubscriptionOrderResponseData[i];
        }
    };
    public static final int $stable = 8;

    public CancelSubscriptionOrderResponseData() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelSubscriptionOrderResponseData)) {
            return false;
        }
        CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseData = (CancelSubscriptionOrderResponseData) obj;
        return Intrinsics.LJFF(this.subscriptionId, cancelSubscriptionOrderResponseData.subscriptionId) && Intrinsics.LJFF(this.isSandbox, cancelSubscriptionOrderResponseData.isSandbox) && Intrinsics.LJFF(this.alreadySucceeded, cancelSubscriptionOrderResponseData.alreadySucceeded);
    }

    public final int hashCode() {
        String str = this.subscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isSandbox;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.alreadySucceeded;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelSubscriptionOrderResponseData(subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(", isSandbox=");
        sbLIZ.append(this.isSandbox);
        sbLIZ.append(", alreadySucceeded=");
        sbLIZ.append(this.alreadySucceeded);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subscriptionId);
        Boolean bool = this.isSandbox;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.alreadySucceeded;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public CancelSubscriptionOrderResponseData(String str, Boolean bool, Boolean bool2) {
        this.subscriptionId = str;
        this.isSandbox = bool;
        this.alreadySucceeded = bool2;
    }
}
