package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.ChangeSubscriptionOrderResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ChangeSubscriptionOrderResponseData implements Parcelable {

    @C09CT("change_order_status")
    public final Long changeOrderStatus;

    @C09CT("iap_payload")
    public final String iapPayload;

    @C09CT("is_sandbox")
    public final Boolean isSandbox;

    @C09CT("next_retry_at_ms")
    public final Long nextRetryAtMs;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("web_payload")
    public final String webPayLoad;

    @C09CT("web_redirect_url")
    public final String webRedirectUrl;
    public static final Parcelable.Creator<ChangeSubscriptionOrderResponseData> CREATOR = new Parcelable.Creator<ChangeSubscriptionOrderResponseData>() { // from class: X.0iBq
        @Override // android.os.Parcelable.Creator
        public final ChangeSubscriptionOrderResponseData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf2 = null;
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
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new ChangeSubscriptionOrderResponseData(string, string2, boolValueOf, lValueOf, lValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeSubscriptionOrderResponseData[] newArray(int i) {
            return new ChangeSubscriptionOrderResponseData[i];
        }
    };
    public static final int $stable = 8;

    public ChangeSubscriptionOrderResponseData() {
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
        if (!(obj instanceof ChangeSubscriptionOrderResponseData)) {
            return false;
        }
        ChangeSubscriptionOrderResponseData changeSubscriptionOrderResponseData = (ChangeSubscriptionOrderResponseData) obj;
        return Intrinsics.LJFF(this.iapPayload, changeSubscriptionOrderResponseData.iapPayload) && Intrinsics.LJFF(this.subscriptionId, changeSubscriptionOrderResponseData.subscriptionId) && Intrinsics.LJFF(this.isSandbox, changeSubscriptionOrderResponseData.isSandbox) && Intrinsics.LJFF(this.nextRetryAtMs, changeSubscriptionOrderResponseData.nextRetryAtMs) && Intrinsics.LJFF(this.changeOrderStatus, changeSubscriptionOrderResponseData.changeOrderStatus) && Intrinsics.LJFF(this.webPayLoad, changeSubscriptionOrderResponseData.webPayLoad) && Intrinsics.LJFF(this.webRedirectUrl, changeSubscriptionOrderResponseData.webRedirectUrl);
    }

    public final int hashCode() {
        String str = this.iapPayload;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriptionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSandbox;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.nextRetryAtMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.changeOrderStatus;
        int iHashCode5 = (((iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.webPayLoad.hashCode()) * 31;
        String str3 = this.webRedirectUrl;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeSubscriptionOrderResponseData(iapPayload=");
        sbLIZ.append(this.iapPayload);
        sbLIZ.append(", subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(", isSandbox=");
        sbLIZ.append(this.isSandbox);
        sbLIZ.append(", nextRetryAtMs=");
        sbLIZ.append(this.nextRetryAtMs);
        sbLIZ.append(", changeOrderStatus=");
        sbLIZ.append(this.changeOrderStatus);
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
        Boolean bool = this.isSandbox;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.nextRetryAtMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.changeOrderStatus;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.webPayLoad);
        parcel.writeString(this.webRedirectUrl);
    }

    public ChangeSubscriptionOrderResponseData(String str, String str2, Boolean bool, Long l, Long l2, String str3, String str4) {
        this.iapPayload = str;
        this.subscriptionId = str2;
        this.isSandbox = bool;
        this.nextRetryAtMs = l;
        this.changeOrderStatus = l2;
        this.webPayLoad = str3;
        this.webRedirectUrl = str4;
    }
}
