package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ChangeSubscriptionOrderResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionChangeResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionChangeResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisSubscriptionChangeResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionChangeResponse>() { // from class: X.0iBn
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionChangeResponse createFromParcel(Parcel parcel) {
            ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                changeSubscriptionOrderResponseDataCreateFromParcel = null;
            } else {
                changeSubscriptionOrderResponseDataCreateFromParcel = ChangeSubscriptionOrderResponseData.CREATOR.createFromParcel(parcel);
            }
            ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseData = changeSubscriptionOrderResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionChangeResponse(changeSubscriptionOrderResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionChangeResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionChangeResponse[i];
        }
    };

    @C09CT("data")
    public final ChangeSubscriptionOrderResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisSubscriptionChangeResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionChangeResponse)) {
            return false;
        }
        TiktokMinisSubscriptionChangeResponse tiktokMinisSubscriptionChangeResponse = (TiktokMinisSubscriptionChangeResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionChangeResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionChangeResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionChangeResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionChangeResponse.statusMsg);
    }

    public final int hashCode() {
        ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseData = this.data;
        int iHashCode = (changeSubscriptionOrderResponseData == null ? 0 : changeSubscriptionOrderResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionChangeResponse(data=");
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
        ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseData = this.data;
        if (changeSubscriptionOrderResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            changeSubscriptionOrderResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisSubscriptionChangeResponse(ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseData, String str, Integer num, String str2) {
        this.data = changeSubscriptionOrderResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
