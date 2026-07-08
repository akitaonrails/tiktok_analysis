package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionListRequest implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("tracking_id")
    public final String trackingId;
    public static final Parcelable.Creator<TiktokMinisSubscriptionListRequest> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionListRequest>() { // from class: X.0iBY
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionListRequest createFromParcel(Parcel parcel) {
            return new TiktokMinisSubscriptionListRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionListRequest[] newArray(int i) {
            return new TiktokMinisSubscriptionListRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisSubscriptionListRequest() {
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
        if (!(obj instanceof TiktokMinisSubscriptionListRequest)) {
            return false;
        }
        TiktokMinisSubscriptionListRequest tiktokMinisSubscriptionListRequest = (TiktokMinisSubscriptionListRequest) obj;
        return Intrinsics.LJFF(this.clientKey, tiktokMinisSubscriptionListRequest.clientKey) && Intrinsics.LJFF(this.flowId, tiktokMinisSubscriptionListRequest.flowId) && Intrinsics.LJFF(this.trackingId, tiktokMinisSubscriptionListRequest.trackingId);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackingId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionListRequest(clientKey=");
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
        parcel.writeString(this.clientKey);
        parcel.writeString(this.flowId);
        parcel.writeString(this.trackingId);
    }

    public TiktokMinisSubscriptionListRequest(String str, String str2, String str3) {
        this.clientKey = str;
        this.flowId = str2;
        this.trackingId = str3;
    }
}
