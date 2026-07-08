package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.SubscriptionTradeOrderObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SubscriptionTradeOrderObject implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("subscription_begin_at")
    public final Long subscriptionBeginAt;

    @C09CT("subscription_end_at")
    public final Long subscriptionEndAt;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("trade_order_id")
    public final String tradeOrderId;

    @C09CT("trade_order_status")
    public final Integer tradeOrderStatus;
    public static final Parcelable.Creator<SubscriptionTradeOrderObject> CREATOR = new Parcelable.Creator<SubscriptionTradeOrderObject>() { // from class: X.0iBw
        @Override // android.os.Parcelable.Creator
        public final SubscriptionTradeOrderObject createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new SubscriptionTradeOrderObject(string, string2, numValueOf, lValueOf, lValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SubscriptionTradeOrderObject[] newArray(int i) {
            return new SubscriptionTradeOrderObject[i];
        }
    };
    public static final int $stable = 8;

    public SubscriptionTradeOrderObject() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionTradeOrderObject)) {
            return false;
        }
        SubscriptionTradeOrderObject subscriptionTradeOrderObject = (SubscriptionTradeOrderObject) obj;
        return Intrinsics.LJFF(this.clientKey, subscriptionTradeOrderObject.clientKey) && Intrinsics.LJFF(this.tradeOrderId, subscriptionTradeOrderObject.tradeOrderId) && Intrinsics.LJFF(this.tradeOrderStatus, subscriptionTradeOrderObject.tradeOrderStatus) && Intrinsics.LJFF(this.subscriptionBeginAt, subscriptionTradeOrderObject.subscriptionBeginAt) && Intrinsics.LJFF(this.subscriptionEndAt, subscriptionTradeOrderObject.subscriptionEndAt) && Intrinsics.LJFF(this.subscriptionId, subscriptionTradeOrderObject.subscriptionId);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tradeOrderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.tradeOrderStatus;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.subscriptionBeginAt;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.subscriptionEndAt;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.subscriptionId;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionTradeOrderObject(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", tradeOrderStatus=");
        sbLIZ.append(this.tradeOrderStatus);
        sbLIZ.append(", subscriptionBeginAt=");
        sbLIZ.append(this.subscriptionBeginAt);
        sbLIZ.append(", subscriptionEndAt=");
        sbLIZ.append(this.subscriptionEndAt);
        sbLIZ.append(", subscriptionId=");
        sbLIZ.append(this.subscriptionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.tradeOrderId);
        Integer num = this.tradeOrderStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.subscriptionBeginAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.subscriptionEndAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.subscriptionId);
    }

    public SubscriptionTradeOrderObject(String str, String str2, Integer num, Long l, Long l2, String str3) {
        this.clientKey = str;
        this.tradeOrderId = str2;
        this.tradeOrderStatus = num;
        this.subscriptionBeginAt = l;
        this.subscriptionEndAt = l2;
        this.subscriptionId = str3;
    }
}
