package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherCountdown;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherCountdown implements Parcelable, Serializable {

    @C09CT("end_time")
    public Long endTime;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<VoucherCountdown> CREATOR = new Parcelable.Creator<VoucherCountdown>() { // from class: X.02lc
        @Override // android.os.Parcelable.Creator
        public final VoucherCountdown createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new VoucherCountdown(string, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherCountdown[] newArray(int i) {
            return new VoucherCountdown[i];
        }
    };
    public static final int $stable = 8;

    public VoucherCountdown() {
        this(null, null);
    }

    public final VoucherCountdown copy(String str, Long l) {
        return new VoucherCountdown(str, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherCountdown)) {
            return false;
        }
        VoucherCountdown voucherCountdown = (VoucherCountdown) obj;
        return Intrinsics.LJFF(this.text, voucherCountdown.text) && Intrinsics.LJFF(this.endTime, voucherCountdown.endTime);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.endTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherCountdown(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Long l = this.endTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getText() {
        return this.text;
    }

    public VoucherCountdown(String str, Long l) {
        this.text = str;
        this.endTime = l;
    }
}
