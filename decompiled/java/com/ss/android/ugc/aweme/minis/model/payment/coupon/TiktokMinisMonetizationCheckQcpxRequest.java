package com.ss.android.ugc.aweme.minis.model.payment.coupon;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TiktokMinisMonetizationCheckQcpxRequest extends BaseResponse implements Parcelable {

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

    @C09CT("ttoclid")
    public final String ttoclid;
    public static final Parcelable.Creator<TiktokMinisMonetizationCheckQcpxRequest> CREATOR = new Parcelable.Creator<TiktokMinisMonetizationCheckQcpxRequest>() { // from class: X.0iC0
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckQcpxRequest createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            return new TiktokMinisMonetizationCheckQcpxRequest(string, string2, string3, string4, string5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckQcpxRequest[] newArray(int i) {
            return new TiktokMinisMonetizationCheckQcpxRequest[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisMonetizationCheckQcpxRequest() {
        this("", "", null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisMonetizationCheckQcpxRequest)) {
            return false;
        }
        TiktokMinisMonetizationCheckQcpxRequest tiktokMinisMonetizationCheckQcpxRequest = (TiktokMinisMonetizationCheckQcpxRequest) obj;
        return Intrinsics.LJFF(this.clientKey, tiktokMinisMonetizationCheckQcpxRequest.clientKey) && Intrinsics.LJFF(this.ttoclid, tiktokMinisMonetizationCheckQcpxRequest.ttoclid) && Intrinsics.LJFF(this.reqId, tiktokMinisMonetizationCheckQcpxRequest.reqId) && Intrinsics.LJFF(this.creativeId, tiktokMinisMonetizationCheckQcpxRequest.creativeId) && Intrinsics.LJFF(this.discountRate, tiktokMinisMonetizationCheckQcpxRequest.discountRate) && Intrinsics.LJFF(this.isDebugMode, tiktokMinisMonetizationCheckQcpxRequest.isDebugMode);
    }

    public final int hashCode() {
        int iHashCode = ((this.clientKey.hashCode() * 31) + this.ttoclid.hashCode()) * 31;
        String str = this.reqId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creativeId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountRate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDebugMode;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisMonetizationCheckQcpxRequest(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", ttoclid=");
        sbLIZ.append(this.ttoclid);
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
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.clientKey);
        parcel.writeString(this.ttoclid);
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

    public TiktokMinisMonetizationCheckQcpxRequest(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.clientKey = str;
        this.ttoclid = str2;
        this.reqId = str3;
        this.creativeId = str4;
        this.discountRate = str5;
        this.isDebugMode = bool;
    }
}
