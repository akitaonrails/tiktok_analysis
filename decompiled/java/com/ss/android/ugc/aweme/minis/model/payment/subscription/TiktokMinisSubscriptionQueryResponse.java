package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.SubscriptionTradeOrderObject;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionQueryResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionQueryResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisSubscriptionQueryResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionQueryResponse>() { // from class: X.0iBv
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionQueryResponse createFromParcel(Parcel parcel) {
            SubscriptionTradeOrderObject subscriptionTradeOrderObjectCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                subscriptionTradeOrderObjectCreateFromParcel = null;
            } else {
                subscriptionTradeOrderObjectCreateFromParcel = SubscriptionTradeOrderObject.CREATOR.createFromParcel(parcel);
            }
            SubscriptionTradeOrderObject subscriptionTradeOrderObject = subscriptionTradeOrderObjectCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionQueryResponse(subscriptionTradeOrderObject, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionQueryResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionQueryResponse[i];
        }
    };

    @C09CT("data")
    public final SubscriptionTradeOrderObject data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisSubscriptionQueryResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionQueryResponse)) {
            return false;
        }
        TiktokMinisSubscriptionQueryResponse tiktokMinisSubscriptionQueryResponse = (TiktokMinisSubscriptionQueryResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionQueryResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionQueryResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionQueryResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionQueryResponse.statusMsg);
    }

    public final int hashCode() {
        SubscriptionTradeOrderObject subscriptionTradeOrderObject = this.data;
        int iHashCode = (subscriptionTradeOrderObject == null ? 0 : subscriptionTradeOrderObject.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionQueryResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", starlingMsg=");
        sbLIZ.append(this.starlingMsg);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SubscriptionTradeOrderObject subscriptionTradeOrderObject = this.data;
        if (subscriptionTradeOrderObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subscriptionTradeOrderObject.writeToParcel(parcel, i);
        }
        parcel.writeString(this.starlingMsg);
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public TiktokMinisSubscriptionQueryResponse(SubscriptionTradeOrderObject subscriptionTradeOrderObject, String str, Integer num, String str2) {
        this.data = subscriptionTradeOrderObject;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
