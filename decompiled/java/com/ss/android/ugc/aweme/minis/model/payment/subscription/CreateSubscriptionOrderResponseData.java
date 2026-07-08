package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.CreateSubscriptionOrderResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateSubscriptionOrderResponseData implements Parcelable {

    @C09CT("iap_payload")
    public final String iapPayload;

    @C09CT("is_sandbox")
    public final Boolean isSandbox;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("web_payload")
    public final String webPayLoad;

    @C09CT("web_redirect_url")
    public final String webRedirectUrl;
    public static final Parcelable.Creator<CreateSubscriptionOrderResponseData> CREATOR = new Parcelable.Creator<CreateSubscriptionOrderResponseData>() { // from class: X.0iBs
        @Override // android.os.Parcelable.Creator
        public final CreateSubscriptionOrderResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            return new CreateSubscriptionOrderResponseData(string, string2, string3, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateSubscriptionOrderResponseData[] newArray(int i) {
            return new CreateSubscriptionOrderResponseData[i];
        }
    };
    public static final int $stable = 8;

    public CreateSubscriptionOrderResponseData() {
        this(null, "", null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSubscriptionOrderResponseData)) {
            return false;
        }
        CreateSubscriptionOrderResponseData createSubscriptionOrderResponseData = (CreateSubscriptionOrderResponseData) obj;
        return Intrinsics.LJFF(this.iapPayload, createSubscriptionOrderResponseData.iapPayload) && Intrinsics.LJFF(this.webPayLoad, createSubscriptionOrderResponseData.webPayLoad) && Intrinsics.LJFF(this.subscriptionId, createSubscriptionOrderResponseData.subscriptionId) && Intrinsics.LJFF(this.isSandbox, createSubscriptionOrderResponseData.isSandbox) && Intrinsics.LJFF(this.webRedirectUrl, createSubscriptionOrderResponseData.webRedirectUrl);
    }

    public final int hashCode() {
        String str = this.iapPayload;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.webPayLoad.hashCode()) * 31;
        String str2 = this.subscriptionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSandbox;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.webRedirectUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateSubscriptionOrderResponseData(iapPayload=");
        sbLIZ.append(this.iapPayload);
        sbLIZ.append(", webPayLoad=");
        sbLIZ.append(this.webPayLoad);
        sbLIZ.append(", subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(", isSandbox=");
        sbLIZ.append(this.isSandbox);
        sbLIZ.append(", webRedirectUrl=");
        sbLIZ.append(this.webRedirectUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.iapPayload);
        parcel.writeString(this.webPayLoad);
        parcel.writeString(this.subscriptionId);
        Boolean bool = this.isSandbox;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.webRedirectUrl);
    }

    public CreateSubscriptionOrderResponseData(String str, String str2, String str3, Boolean bool, String str4) {
        this.iapPayload = str;
        this.webPayLoad = str2;
        this.subscriptionId = str3;
        this.isSandbox = bool;
        this.webRedirectUrl = str4;
    }
}
