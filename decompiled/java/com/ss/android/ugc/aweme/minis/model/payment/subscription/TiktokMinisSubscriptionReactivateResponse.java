package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ReactivateSubscriptionOrderResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionReactivateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionReactivateResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisSubscriptionReactivateResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionReactivateResponse>() { // from class: X.0iBl
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionReactivateResponse createFromParcel(Parcel parcel) {
            ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                reactivateSubscriptionOrderResponseDataCreateFromParcel = null;
            } else {
                reactivateSubscriptionOrderResponseDataCreateFromParcel = ReactivateSubscriptionOrderResponseData.CREATOR.createFromParcel(parcel);
            }
            ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseData = reactivateSubscriptionOrderResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionReactivateResponse(reactivateSubscriptionOrderResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionReactivateResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionReactivateResponse[i];
        }
    };

    @C09CT("data")
    public final ReactivateSubscriptionOrderResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisSubscriptionReactivateResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionReactivateResponse)) {
            return false;
        }
        TiktokMinisSubscriptionReactivateResponse tiktokMinisSubscriptionReactivateResponse = (TiktokMinisSubscriptionReactivateResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionReactivateResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionReactivateResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionReactivateResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionReactivateResponse.statusMsg);
    }

    public final int hashCode() {
        ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseData = this.data;
        int iHashCode = (reactivateSubscriptionOrderResponseData == null ? 0 : reactivateSubscriptionOrderResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionReactivateResponse(data=");
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
        ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseData = this.data;
        if (reactivateSubscriptionOrderResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reactivateSubscriptionOrderResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisSubscriptionReactivateResponse(ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseData, String str, Integer num, String str2) {
        this.data = reactivateSubscriptionOrderResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
