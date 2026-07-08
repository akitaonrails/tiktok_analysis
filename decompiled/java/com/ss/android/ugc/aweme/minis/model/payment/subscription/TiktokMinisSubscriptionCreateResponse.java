package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.CreateSubscriptionOrderResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCreateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionCreateResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisSubscriptionCreateResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionCreateResponse>() { // from class: X.0iBt
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCreateResponse createFromParcel(Parcel parcel) {
            CreateSubscriptionOrderResponseData createSubscriptionOrderResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                createSubscriptionOrderResponseDataCreateFromParcel = null;
            } else {
                createSubscriptionOrderResponseDataCreateFromParcel = CreateSubscriptionOrderResponseData.CREATOR.createFromParcel(parcel);
            }
            CreateSubscriptionOrderResponseData createSubscriptionOrderResponseData = createSubscriptionOrderResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionCreateResponse(createSubscriptionOrderResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionCreateResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionCreateResponse[i];
        }
    };

    @C09CT("data")
    public final CreateSubscriptionOrderResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisSubscriptionCreateResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionCreateResponse)) {
            return false;
        }
        TiktokMinisSubscriptionCreateResponse tiktokMinisSubscriptionCreateResponse = (TiktokMinisSubscriptionCreateResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionCreateResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionCreateResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionCreateResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionCreateResponse.statusMsg);
    }

    public final int hashCode() {
        CreateSubscriptionOrderResponseData createSubscriptionOrderResponseData = this.data;
        int iHashCode = (createSubscriptionOrderResponseData == null ? 0 : createSubscriptionOrderResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionCreateResponse(data=");
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
        CreateSubscriptionOrderResponseData createSubscriptionOrderResponseData = this.data;
        if (createSubscriptionOrderResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createSubscriptionOrderResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisSubscriptionCreateResponse(CreateSubscriptionOrderResponseData createSubscriptionOrderResponseData, String str, Integer num, String str2) {
        this.data = createSubscriptionOrderResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
