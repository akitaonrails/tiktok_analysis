package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.CancelSubscriptionOrderResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCancelResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionCancelResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisSubscriptionCancelResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionCancelResponse>() { // from class: X.0iBV
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCancelResponse createFromParcel(Parcel parcel) {
            CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                cancelSubscriptionOrderResponseDataCreateFromParcel = null;
            } else {
                cancelSubscriptionOrderResponseDataCreateFromParcel = CancelSubscriptionOrderResponseData.CREATOR.createFromParcel(parcel);
            }
            CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseData = cancelSubscriptionOrderResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionCancelResponse(cancelSubscriptionOrderResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCancelResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionCancelResponse[i];
        }
    };

    @C09CT("data")
    public final CancelSubscriptionOrderResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisSubscriptionCancelResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionCancelResponse)) {
            return false;
        }
        TiktokMinisSubscriptionCancelResponse tiktokMinisSubscriptionCancelResponse = (TiktokMinisSubscriptionCancelResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionCancelResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionCancelResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionCancelResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionCancelResponse.statusMsg);
    }

    public final int hashCode() {
        CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseData = this.data;
        int iHashCode = (cancelSubscriptionOrderResponseData == null ? 0 : cancelSubscriptionOrderResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionCancelResponse(data=");
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
        CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseData = this.data;
        if (cancelSubscriptionOrderResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cancelSubscriptionOrderResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisSubscriptionCancelResponse(CancelSubscriptionOrderResponseData cancelSubscriptionOrderResponseData, String str, Integer num, String str2) {
        this.data = cancelSubscriptionOrderResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
