package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherInfo implements Parcelable {

    @C09CT("basic_voucher_id")
    public final String basicVoucherId;

    @C09CT("basic_voucher_type_id")
    public final String basicVoucherTypeId;

    @C09CT("bcm_standard_track")
    public final BCMStandardTrack bcmStandardTrack;

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new Parcelable.Creator<VoucherInfo>() { // from class: X.02wE
        @Override // android.os.Parcelable.Creator
        public final VoucherInfo createFromParcel(Parcel parcel) {
            BCMStandardTrack bCMStandardTrackCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                bCMStandardTrackCreateFromParcel = null;
            } else {
                bCMStandardTrackCreateFromParcel = BCMStandardTrack.CREATOR.createFromParcel(parcel);
            }
            return new VoucherInfo(string, string2, string3, string4, bCMStandardTrackCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherInfo[] newArray(int i) {
            return new VoucherInfo[i];
        }
    };
    public static final int $stable = 8;

    public VoucherInfo() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return Intrinsics.LJFF(this.voucherTypeId, voucherInfo.voucherTypeId) && Intrinsics.LJFF(this.basicVoucherTypeId, voucherInfo.basicVoucherTypeId) && Intrinsics.LJFF(this.basicVoucherId, voucherInfo.basicVoucherId) && Intrinsics.LJFF(this.instanceKey, voucherInfo.instanceKey) && Intrinsics.LJFF(this.bcmStandardTrack, voucherInfo.bcmStandardTrack);
    }

    public final int hashCode() {
        String str = this.voucherTypeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.basicVoucherTypeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.basicVoucherId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.instanceKey;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        return iHashCode4 + (bCMStandardTrack != null ? bCMStandardTrack.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherInfo(voucherTypeId=");
        sbLIZ.append(this.voucherTypeId);
        sbLIZ.append(", basicVoucherTypeId=");
        sbLIZ.append(this.basicVoucherTypeId);
        sbLIZ.append(", basicVoucherId=");
        sbLIZ.append(this.basicVoucherId);
        sbLIZ.append(", instanceKey=");
        sbLIZ.append(this.instanceKey);
        sbLIZ.append(", bcmStandardTrack=");
        sbLIZ.append(this.bcmStandardTrack);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.voucherTypeId);
        parcel.writeString(this.basicVoucherTypeId);
        parcel.writeString(this.basicVoucherId);
        parcel.writeString(this.instanceKey);
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        if (bCMStandardTrack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bCMStandardTrack.writeToParcel(parcel, i);
        }
    }

    public VoucherInfo(String str, String str2, String str3, String str4, BCMStandardTrack bCMStandardTrack) {
        this.voucherTypeId = str;
        this.basicVoucherTypeId = str2;
        this.basicVoucherId = str3;
        this.instanceKey = str4;
        this.bcmStandardTrack = bCMStandardTrack;
    }
}
