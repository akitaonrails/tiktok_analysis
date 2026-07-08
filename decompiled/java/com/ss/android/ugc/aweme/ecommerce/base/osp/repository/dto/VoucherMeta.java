package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherMeta implements Parcelable {

    @C09CT("instance_key")
    public String instanceKey;

    @C09CT("voucher_id")
    public String voucherId;

    @C09CT("voucher_type_id")
    public String voucherTypeId;
    public static final Parcelable.Creator<VoucherMeta> CREATOR = new Parcelable.Creator<VoucherMeta>() { // from class: X.02lf
        @Override // android.os.Parcelable.Creator
        public final VoucherMeta createFromParcel(Parcel parcel) {
            return new VoucherMeta(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherMeta[] newArray(int i) {
            return new VoucherMeta[i];
        }
    };
    public static final int $stable = 8;

    public VoucherMeta() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherMeta)) {
            return false;
        }
        VoucherMeta voucherMeta = (VoucherMeta) obj;
        return Intrinsics.LJFF(this.voucherTypeId, voucherMeta.voucherTypeId) && Intrinsics.LJFF(this.voucherId, voucherMeta.voucherId) && Intrinsics.LJFF(this.instanceKey, voucherMeta.instanceKey);
    }

    public final int hashCode() {
        String str = this.voucherTypeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.instanceKey;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherMeta(voucherTypeId=");
        sbLIZ.append(this.voucherTypeId);
        sbLIZ.append(", voucherId=");
        sbLIZ.append(this.voucherId);
        sbLIZ.append(", instanceKey=");
        sbLIZ.append(this.instanceKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.voucherTypeId);
        parcel.writeString(this.voucherId);
        parcel.writeString(this.instanceKey);
    }

    public VoucherMeta(String str, String str2, String str3) {
        this.voucherTypeId = str;
        this.voucherId = str2;
        this.instanceKey = str3;
    }
}
