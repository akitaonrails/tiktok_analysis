package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CouponCache implements Parcelable, Serializable {

    @C09CT("claim_status")
    public int claimStatus;

    @C09CT("update_millis")
    public long updateMillis;

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_type_id")
    public final String voucherTypeID;
    public static final Parcelable.Creator<CouponCache> CREATOR = new Parcelable.Creator<CouponCache>() { // from class: X.02tZ
        @Override // android.os.Parcelable.Creator
        public final CouponCache createFromParcel(Parcel parcel) {
            return new CouponCache(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CouponCache[] newArray(int i) {
            return new CouponCache[i];
        }
    };
    public static final int $stable = 8;

    public final CouponCache copy(String str, String str2, int i, long j) {
        return new CouponCache(str, str2, i, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCache)) {
            return false;
        }
        CouponCache couponCache = (CouponCache) obj;
        return Intrinsics.LJFF(this.voucherId, couponCache.voucherId) && Intrinsics.LJFF(this.voucherTypeID, couponCache.voucherTypeID) && this.claimStatus == couponCache.claimStatus && this.updateMillis == couponCache.updateMillis;
    }

    public int hashCode() {
        String str = this.voucherId;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.voucherTypeID.hashCode()) * 31) + this.claimStatus) * 31) + C786410Ut5.Y2(this.updateMillis);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponCache(voucherId=");
        sbLIZ.append(this.voucherId);
        sbLIZ.append(", voucherTypeID=");
        sbLIZ.append(this.voucherTypeID);
        sbLIZ.append(", claimStatus=");
        sbLIZ.append(this.claimStatus);
        sbLIZ.append(", updateMillis=");
        sbLIZ.append(this.updateMillis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.voucherId);
        parcel.writeString(this.voucherTypeID);
        parcel.writeInt(this.claimStatus);
        parcel.writeLong(this.updateMillis);
    }

    public final int getClaimStatus() {
        return this.claimStatus;
    }

    public final long getUpdateMillis() {
        return this.updateMillis;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public final void setClaimStatus(int i) {
        this.claimStatus = i;
    }

    public final void setUpdateMillis(long j) {
        this.updateMillis = j;
    }

    public CouponCache(String str, String str2, int i, long j) {
        this.voucherId = str;
        this.voucherTypeID = str2;
        this.claimStatus = i;
        this.updateMillis = j;
    }
}
