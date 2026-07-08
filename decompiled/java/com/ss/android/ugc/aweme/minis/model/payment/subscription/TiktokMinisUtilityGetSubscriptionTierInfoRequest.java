package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokMinisUtilityGetSubscriptionTierInfoRequest implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("trade_order_id")
    public final String tradeOrderId;
    public static final Parcelable.Creator<TiktokMinisUtilityGetSubscriptionTierInfoRequest> CREATOR = new Parcelable.Creator<TiktokMinisUtilityGetSubscriptionTierInfoRequest>() { // from class: X.1B05
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisUtilityGetSubscriptionTierInfoRequest createFromParcel(Parcel parcel) {
            return new TiktokMinisUtilityGetSubscriptionTierInfoRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisUtilityGetSubscriptionTierInfoRequest[] newArray(int i) {
            return new TiktokMinisUtilityGetSubscriptionTierInfoRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisUtilityGetSubscriptionTierInfoRequest() {
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
        if (!(obj instanceof TiktokMinisUtilityGetSubscriptionTierInfoRequest)) {
            return false;
        }
        TiktokMinisUtilityGetSubscriptionTierInfoRequest tiktokMinisUtilityGetSubscriptionTierInfoRequest = (TiktokMinisUtilityGetSubscriptionTierInfoRequest) obj;
        return Intrinsics.LJFF(this.tradeOrderId, tiktokMinisUtilityGetSubscriptionTierInfoRequest.tradeOrderId) && Intrinsics.LJFF(this.flowId, tiktokMinisUtilityGetSubscriptionTierInfoRequest.flowId) && Intrinsics.LJFF(this.trackingId, tiktokMinisUtilityGetSubscriptionTierInfoRequest.trackingId) && Intrinsics.LJFF(this.clientKey, tiktokMinisUtilityGetSubscriptionTierInfoRequest.clientKey);
    }

    public final int hashCode() {
        String str = this.tradeOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flowId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackingId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientKey;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisUtilityGetSubscriptionTierInfoRequest(tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", flowId=");
        sbLIZ.append(this.flowId);
        sbLIZ.append(", trackingId=");
        sbLIZ.append(this.trackingId);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeOrderId);
        parcel.writeString(this.flowId);
        parcel.writeString(this.trackingId);
        parcel.writeString(this.clientKey);
    }

    public TiktokMinisUtilityGetSubscriptionTierInfoRequest(String str, String str2, String str3, String str4) {
        this.tradeOrderId = str;
        this.flowId = str2;
        this.trackingId = str3;
        this.clientKey = str4;
    }
}
