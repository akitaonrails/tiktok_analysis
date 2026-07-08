package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ListSubscriptionResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisSubscriptionListResponse implements Parcelable {

    @C09CT("data")
    public final ListSubscriptionResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<TiktokMinisSubscriptionListResponse> CREATOR = new Parcelable.Creator<TiktokMinisSubscriptionListResponse>() { // from class: X.0iB5
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionListResponse createFromParcel(Parcel parcel) {
            ListSubscriptionResponseData listSubscriptionResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                listSubscriptionResponseDataCreateFromParcel = null;
            } else {
                listSubscriptionResponseDataCreateFromParcel = ListSubscriptionResponseData.CREATOR.createFromParcel(parcel);
            }
            ListSubscriptionResponseData listSubscriptionResponseData = listSubscriptionResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisSubscriptionListResponse(listSubscriptionResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisSubscriptionListResponse[] newArray(int i) {
            return new TiktokMinisSubscriptionListResponse[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisSubscriptionListResponse() {
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
        if (!(obj instanceof TiktokMinisSubscriptionListResponse)) {
            return false;
        }
        TiktokMinisSubscriptionListResponse tiktokMinisSubscriptionListResponse = (TiktokMinisSubscriptionListResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisSubscriptionListResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisSubscriptionListResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisSubscriptionListResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisSubscriptionListResponse.statusMsg);
    }

    public final int hashCode() {
        ListSubscriptionResponseData listSubscriptionResponseData = this.data;
        int iHashCode = (listSubscriptionResponseData == null ? 0 : listSubscriptionResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisSubscriptionListResponse(data=");
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
        ListSubscriptionResponseData listSubscriptionResponseData = this.data;
        if (listSubscriptionResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listSubscriptionResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisSubscriptionListResponse(ListSubscriptionResponseData listSubscriptionResponseData, String str, Integer num, String str2) {
        this.data = listSubscriptionResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
