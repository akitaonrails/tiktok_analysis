package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionChangeRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokMinisSubscriptionChangeRequest implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("client_param")
    public final String clientParam;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("pay_region")
    public final String payRegion;

    @C09CT("pay_type")
    public final String payType;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("trade_order_id")
    public final String tradeOrderId;
    public static final Parcelable.Creator<TiktokMinisSubscriptionChangeRequest> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionChangeRequest>() { // from class: X.1B01
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionChangeRequest createFromParcel(Parcel parcel) {
            return new TiktokMinisSubscriptionChangeRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionChangeRequest[] newArray(int i) {
            return new TiktokMinisSubscriptionChangeRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisSubscriptionChangeRequest() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisSubscriptionChangeRequest)) {
            return false;
        }
        TiktokMinisSubscriptionChangeRequest tiktokMinisSubscriptionChangeRequest = (TiktokMinisSubscriptionChangeRequest) obj;
        return Intrinsics.LJFF(this.tradeOrderId, tiktokMinisSubscriptionChangeRequest.tradeOrderId) && Intrinsics.LJFF(this.payRegion, tiktokMinisSubscriptionChangeRequest.payRegion) && Intrinsics.LJFF(this.clientKey, tiktokMinisSubscriptionChangeRequest.clientKey) && Intrinsics.LJFF(this.enterFrom, tiktokMinisSubscriptionChangeRequest.enterFrom) && Intrinsics.LJFF(this.flowId, tiktokMinisSubscriptionChangeRequest.flowId) && Intrinsics.LJFF(this.trackingId, tiktokMinisSubscriptionChangeRequest.trackingId) && Intrinsics.LJFF(this.clientParam, tiktokMinisSubscriptionChangeRequest.clientParam) && Intrinsics.LJFF(this.payType, tiktokMinisSubscriptionChangeRequest.payType);
    }

    public final int hashCode() {
        String str = this.tradeOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payRegion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterFrom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flowId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trackingId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.clientParam;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payType;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionChangeRequest(tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", payRegion=");
        sbLIZ.append(this.payRegion);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", flowId=");
        sbLIZ.append(this.flowId);
        sbLIZ.append(", trackingId=");
        sbLIZ.append(this.trackingId);
        sbLIZ.append(", clientParam=");
        sbLIZ.append(this.clientParam);
        sbLIZ.append(", payType=");
        sbLIZ.append(this.payType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeOrderId);
        parcel.writeString(this.payRegion);
        parcel.writeString(this.clientKey);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.flowId);
        parcel.writeString(this.trackingId);
        parcel.writeString(this.clientParam);
        parcel.writeString(this.payType);
    }

    public TiktokMinisSubscriptionChangeRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.tradeOrderId = str;
        this.payRegion = str2;
        this.clientKey = str3;
        this.enterFrom = str4;
        this.flowId = str5;
        this.trackingId = str6;
        this.clientParam = str7;
        this.payType = str8;
    }
}
