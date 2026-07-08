package com.ss.android.ugc.aweme.minis.model.payment.coupon;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisMonetizationCheckEnablementListRequest implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("discount_rate")
    public final String discountRate;

    @C09CT("is_debug_mode")
    public final Boolean isDebugMode;

    @C09CT("req_id")
    public final String reqId;
    public static final Parcelable.Creator<TiktokMinisMonetizationCheckEnablementListRequest> CREATOR = new Parcelable.Creator<TiktokMinisMonetizationCheckEnablementListRequest>() { // from class: X.0iBz
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckEnablementListRequest createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
            return new TiktokMinisMonetizationCheckEnablementListRequest(string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckEnablementListRequest[] newArray(int i) {
            return new TiktokMinisMonetizationCheckEnablementListRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisMonetizationCheckEnablementListRequest() {
        this("", null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisMonetizationCheckEnablementListRequest)) {
            return false;
        }
        TiktokMinisMonetizationCheckEnablementListRequest tiktokMinisMonetizationCheckEnablementListRequest = (TiktokMinisMonetizationCheckEnablementListRequest) obj;
        return Intrinsics.LJFF(this.clientKey, tiktokMinisMonetizationCheckEnablementListRequest.clientKey) && Intrinsics.LJFF(this.reqId, tiktokMinisMonetizationCheckEnablementListRequest.reqId) && Intrinsics.LJFF(this.creativeId, tiktokMinisMonetizationCheckEnablementListRequest.creativeId) && Intrinsics.LJFF(this.discountRate, tiktokMinisMonetizationCheckEnablementListRequest.discountRate) && Intrinsics.LJFF(this.isDebugMode, tiktokMinisMonetizationCheckEnablementListRequest.isDebugMode);
    }

    public final int hashCode() {
        int iHashCode = this.clientKey.hashCode() * 31;
        String str = this.reqId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creativeId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountRate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDebugMode;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisMonetizationCheckEnablementListRequest(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", reqId=");
        sbLIZ.append(this.reqId);
        sbLIZ.append(", creativeId=");
        sbLIZ.append(this.creativeId);
        sbLIZ.append(", discountRate=");
        sbLIZ.append(this.discountRate);
        sbLIZ.append(", isDebugMode=");
        sbLIZ.append(this.isDebugMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.clientKey);
        parcel.writeString(this.reqId);
        parcel.writeString(this.creativeId);
        parcel.writeString(this.discountRate);
        Boolean bool = this.isDebugMode;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public TiktokMinisMonetizationCheckEnablementListRequest(String str, String str2, String str3, String str4, Boolean bool) {
        this.clientKey = str;
        this.reqId = str2;
        this.creativeId = str3;
        this.discountRate = str4;
        this.isDebugMode = bool;
    }
}
