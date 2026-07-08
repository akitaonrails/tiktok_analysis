package com.ss.android.ugc.aweme.minis.payment.subscription.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoResponse;
import com.ss.android.ugc.aweme.minis.payment.subscription.data.MinisSubscriptionSheetParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisSubscriptionSheetParams implements Parcelable {
    public final String basePlanId;
    public final boolean needWebpay;
    public final String offerId;
    public final MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> resp;
    public final String skuId;
    public final String tierId;
    public final String tradeOrderId;
    public static final Parcelable.Creator<MinisSubscriptionSheetParams> CREATOR = new Parcelable.Creator<MinisSubscriptionSheetParams>() { // from class: X.0y0y
        @Override // android.os.Parcelable.Creator
        public final MinisSubscriptionSheetParams createFromParcel(Parcel parcel) {
            boolean z;
            MinisPaymentNetworkResponse<?> minisPaymentNetworkResponseCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                minisPaymentNetworkResponseCreateFromParcel = null;
            } else {
                minisPaymentNetworkResponseCreateFromParcel = MinisPaymentNetworkResponse.CREATOR.createFromParcel(parcel);
            }
            return new MinisSubscriptionSheetParams(string, string2, string3, string4, string5, z, minisPaymentNetworkResponseCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisSubscriptionSheetParams[] newArray(int i) {
            return new MinisSubscriptionSheetParams[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisSubscriptionSheetParams)) {
            return false;
        }
        MinisSubscriptionSheetParams minisSubscriptionSheetParams = (MinisSubscriptionSheetParams) obj;
        return Intrinsics.LJFF(this.tradeOrderId, minisSubscriptionSheetParams.tradeOrderId) && Intrinsics.LJFF(this.tierId, minisSubscriptionSheetParams.tierId) && Intrinsics.LJFF(this.skuId, minisSubscriptionSheetParams.skuId) && Intrinsics.LJFF(this.basePlanId, minisSubscriptionSheetParams.basePlanId) && Intrinsics.LJFF(this.offerId, minisSubscriptionSheetParams.offerId) && this.needWebpay == minisSubscriptionSheetParams.needWebpay && Intrinsics.LJFF(this.resp, minisSubscriptionSheetParams.resp);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.tradeOrderId.hashCode() * 31) + this.tierId.hashCode()) * 31) + this.skuId.hashCode()) * 31) + this.basePlanId.hashCode()) * 31) + this.offerId.hashCode()) * 31) + C786410Ut5.Z2(this.needWebpay)) * 31;
        MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> minisPaymentNetworkResponse = this.resp;
        return iHashCode + (minisPaymentNetworkResponse == null ? 0 : minisPaymentNetworkResponse.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisSubscriptionSheetParams(tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", tierId=");
        sbLIZ.append(this.tierId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.basePlanId);
        sbLIZ.append(", offerId=");
        sbLIZ.append(this.offerId);
        sbLIZ.append(", needWebpay=");
        sbLIZ.append(this.needWebpay);
        sbLIZ.append(", resp=");
        sbLIZ.append(this.resp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeOrderId);
        parcel.writeString(this.tierId);
        parcel.writeString(this.skuId);
        parcel.writeString(this.basePlanId);
        parcel.writeString(this.offerId);
        parcel.writeInt(this.needWebpay ? 1 : 0);
        MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> minisPaymentNetworkResponse = this.resp;
        if (minisPaymentNetworkResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minisPaymentNetworkResponse.writeToParcel(parcel, i);
        }
    }

    public MinisSubscriptionSheetParams(String str, String str2, String str3, String str4, String str5, boolean z, MinisPaymentNetworkResponse<TiktokMinisUtilityGetSubscriptionTierInfoResponse> minisPaymentNetworkResponse) {
        this.tradeOrderId = str;
        this.tierId = str2;
        this.skuId = str3;
        this.basePlanId = str4;
        this.offerId = str5;
        this.needWebpay = z;
        this.resp = minisPaymentNetworkResponse;
    }
}
