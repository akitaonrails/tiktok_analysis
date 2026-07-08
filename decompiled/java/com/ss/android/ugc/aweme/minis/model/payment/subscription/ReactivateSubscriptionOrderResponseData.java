package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ReactivateSubscriptionOrderResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ReactivateSubscriptionOrderResponseData implements Parcelable {

    @C09CT("already_succeeded")
    public final Boolean alreadySucceeded;

    @C09CT("iap_payload")
    public final String iapPayload;

    @C09CT("is_sandbox")
    public final Boolean isSandbox;

    @C09CT("pay_type")
    public final String payType;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("web_payload")
    public final String webPayLoad;

    @C09CT("web_redirect_url")
    public final String webRedirectUrl;
    public static final Parcelable.Creator<ReactivateSubscriptionOrderResponseData> CREATOR = new Parcelable.Creator<ReactivateSubscriptionOrderResponseData>() { // from class: X.0iBr
        @Override // android.os.Parcelable.Creator
        public final ReactivateSubscriptionOrderResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new ReactivateSubscriptionOrderResponseData(string, string2, boolValueOf, string3, boolValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReactivateSubscriptionOrderResponseData[] newArray(int i) {
            return new ReactivateSubscriptionOrderResponseData[i];
        }
    };
    public static final int $stable = 8;

    public ReactivateSubscriptionOrderResponseData() {
        this(null, null, null, null, null, "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactivateSubscriptionOrderResponseData)) {
            return false;
        }
        ReactivateSubscriptionOrderResponseData reactivateSubscriptionOrderResponseData = (ReactivateSubscriptionOrderResponseData) obj;
        return Intrinsics.LJFF(this.iapPayload, reactivateSubscriptionOrderResponseData.iapPayload) && Intrinsics.LJFF(this.subscriptionId, reactivateSubscriptionOrderResponseData.subscriptionId) && Intrinsics.LJFF(this.alreadySucceeded, reactivateSubscriptionOrderResponseData.alreadySucceeded) && Intrinsics.LJFF(this.payType, reactivateSubscriptionOrderResponseData.payType) && Intrinsics.LJFF(this.isSandbox, reactivateSubscriptionOrderResponseData.isSandbox) && Intrinsics.LJFF(this.webPayLoad, reactivateSubscriptionOrderResponseData.webPayLoad) && Intrinsics.LJFF(this.webRedirectUrl, reactivateSubscriptionOrderResponseData.webRedirectUrl);
    }

    public final int hashCode() {
        String str = this.iapPayload;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriptionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.alreadySucceeded;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.payType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isSandbox;
        int iHashCode5 = (((iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.webPayLoad.hashCode()) * 31;
        String str4 = this.webRedirectUrl;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactivateSubscriptionOrderResponseData(iapPayload=");
        sbLIZ.append(this.iapPayload);
        sbLIZ.append(", subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(", alreadySucceeded=");
        sbLIZ.append(this.alreadySucceeded);
        sbLIZ.append(", payType=");
        sbLIZ.append(this.payType);
        sbLIZ.append(", isSandbox=");
        sbLIZ.append(this.isSandbox);
        sbLIZ.append(", webPayLoad=");
        sbLIZ.append(this.webPayLoad);
        sbLIZ.append(", webRedirectUrl=");
        sbLIZ.append(this.webRedirectUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iapPayload);
        parcel.writeString(this.subscriptionId);
        Boolean bool = this.alreadySucceeded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.payType);
        Boolean bool2 = this.isSandbox;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.webPayLoad);
        parcel.writeString(this.webRedirectUrl);
    }

    public ReactivateSubscriptionOrderResponseData(String str, String str2, Boolean bool, String str3, Boolean bool2, String str4, String str5) {
        this.iapPayload = str;
        this.subscriptionId = str2;
        this.alreadySucceeded = bool;
        this.payType = str3;
        this.isSandbox = bool2;
        this.webPayLoad = str4;
        this.webRedirectUrl = str5;
    }
}
