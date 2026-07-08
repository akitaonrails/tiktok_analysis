package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCancelRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionCancelRequest implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("tracking_id")
    public final String trackingId;
    public static final Parcelable.Creator<TiktokMinisSubscriptionCancelRequest> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionCancelRequest>() { // from class: X.0iBX
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCancelRequest createFromParcel(Parcel parcel) {
            return new TiktokMinisSubscriptionCancelRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCancelRequest[] newArray(int i) {
            return new TiktokMinisSubscriptionCancelRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisSubscriptionCancelRequest() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisSubscriptionCancelRequest)) {
            return false;
        }
        TiktokMinisSubscriptionCancelRequest tiktokMinisSubscriptionCancelRequest = (TiktokMinisSubscriptionCancelRequest) obj;
        return Intrinsics.LJFF(this.subscriptionId, tiktokMinisSubscriptionCancelRequest.subscriptionId) && Intrinsics.LJFF(this.clientKey, tiktokMinisSubscriptionCancelRequest.clientKey) && Intrinsics.LJFF(this.flowId, tiktokMinisSubscriptionCancelRequest.flowId) && Intrinsics.LJFF(this.trackingId, tiktokMinisSubscriptionCancelRequest.trackingId);
    }

    public final int hashCode() {
        String str = this.subscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flowId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackingId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionCancelRequest(subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", flowId=");
        sbLIZ.append(this.flowId);
        sbLIZ.append(", trackingId=");
        sbLIZ.append(this.trackingId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subscriptionId);
        parcel.writeString(this.clientKey);
        parcel.writeString(this.flowId);
        parcel.writeString(this.trackingId);
    }

    public TiktokMinisSubscriptionCancelRequest(String str, String str2, String str3, String str4) {
        this.subscriptionId = str;
        this.clientKey = str2;
        this.flowId = str3;
        this.trackingId = str4;
    }
}
