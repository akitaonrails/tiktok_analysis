package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.InnerGetSubscriptionTierInfoResponseData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisUtilityGetSubscriptionTierInfoResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisUtilityGetSubscriptionTierInfoResponse> CREATOR = new Parcelable.Creator<TiktokMinisUtilityGetSubscriptionTierInfoResponse>() { // from class: X.0iBp
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisUtilityGetSubscriptionTierInfoResponse createFromParcel(Parcel parcel) {
            InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseDataCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                innerGetSubscriptionTierInfoResponseDataCreateFromParcel = null;
            } else {
                innerGetSubscriptionTierInfoResponseDataCreateFromParcel = InnerGetSubscriptionTierInfoResponseData.CREATOR.createFromParcel(parcel);
            }
            InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseData = innerGetSubscriptionTierInfoResponseDataCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TiktokMinisUtilityGetSubscriptionTierInfoResponse(innerGetSubscriptionTierInfoResponseData, string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisUtilityGetSubscriptionTierInfoResponse[] newArray(int i) {
            return new TiktokMinisUtilityGetSubscriptionTierInfoResponse[i];
        }
    };

    @C09CT("data")
    public final InnerGetSubscriptionTierInfoResponseData data;

    @C09CT("starling_msg")
    public final String starlingMsg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public TiktokMinisUtilityGetSubscriptionTierInfoResponse() {
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
        if (!(obj instanceof TiktokMinisUtilityGetSubscriptionTierInfoResponse)) {
            return false;
        }
        TiktokMinisUtilityGetSubscriptionTierInfoResponse tiktokMinisUtilityGetSubscriptionTierInfoResponse = (TiktokMinisUtilityGetSubscriptionTierInfoResponse) obj;
        return Intrinsics.LJFF(this.data, tiktokMinisUtilityGetSubscriptionTierInfoResponse.data) && Intrinsics.LJFF(this.starlingMsg, tiktokMinisUtilityGetSubscriptionTierInfoResponse.starlingMsg) && Intrinsics.LJFF(this.statusCode, tiktokMinisUtilityGetSubscriptionTierInfoResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, tiktokMinisUtilityGetSubscriptionTierInfoResponse.statusMsg);
    }

    public final int hashCode() {
        InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseData = this.data;
        int iHashCode = (innerGetSubscriptionTierInfoResponseData == null ? 0 : innerGetSubscriptionTierInfoResponseData.hashCode()) * 31;
        String str = this.starlingMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisUtilityGetSubscriptionTierInfoResponse(data=");
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
        InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseData = this.data;
        if (innerGetSubscriptionTierInfoResponseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            innerGetSubscriptionTierInfoResponseData.writeToParcel(parcel, i);
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

    public TiktokMinisUtilityGetSubscriptionTierInfoResponse(InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseData, String str, Integer num, String str2) {
        this.data = innerGetSubscriptionTierInfoResponseData;
        this.starlingMsg = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
