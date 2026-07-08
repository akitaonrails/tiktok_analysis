package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionQueryRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokMinisSubscriptionQueryRequest implements Parcelable {

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("trade_order_id")
    public final String tradeOrderId;
    public static final Parcelable.Creator<TiktokMinisSubscriptionQueryRequest> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionQueryRequest>() { // from class: X.1B03
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionQueryRequest createFromParcel(Parcel parcel) {
            return new TiktokMinisSubscriptionQueryRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionQueryRequest[] newArray(int i) {
            return new TiktokMinisSubscriptionQueryRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisSubscriptionQueryRequest() {
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
        if (!(obj instanceof TiktokMinisSubscriptionQueryRequest)) {
            return false;
        }
        TiktokMinisSubscriptionQueryRequest tiktokMinisSubscriptionQueryRequest = (TiktokMinisSubscriptionQueryRequest) obj;
        return Intrinsics.LJFF(this.tradeOrderId, tiktokMinisSubscriptionQueryRequest.tradeOrderId) && Intrinsics.LJFF(this.flowId, tiktokMinisSubscriptionQueryRequest.flowId) && Intrinsics.LJFF(this.trackingId, tiktokMinisSubscriptionQueryRequest.trackingId);
    }

    public final int hashCode() {
        String str = this.tradeOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackingId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionQueryRequest(tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", flowId=");
        sbLIZ.append(this.flowId);
        sbLIZ.append(", trackingId=");
        sbLIZ.append(this.trackingId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeOrderId);
        parcel.writeString(this.flowId);
        parcel.writeString(this.trackingId);
    }

    public TiktokMinisSubscriptionQueryRequest(String str, String str2, String str3) {
        this.tradeOrderId = str;
        this.flowId = str2;
        this.trackingId = str3;
    }
}
