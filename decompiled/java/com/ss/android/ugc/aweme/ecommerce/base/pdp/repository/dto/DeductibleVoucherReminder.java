package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherCountdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DeductibleVoucherReminder implements Parcelable {

    @C09CT("schema")
    public String schema;

    @C09CT("spu_deduction_text")
    public String spuDeductionText;

    @C09CT("title")
    public String title;

    @C09CT("voucher_countdown")
    public VoucherCountdown voucher_countdown;
    public static final Parcelable.Creator<DeductibleVoucherReminder> CREATOR = new Parcelable.Creator<DeductibleVoucherReminder>() { // from class: X.02ll
        @Override // android.os.Parcelable.Creator
        public final DeductibleVoucherReminder createFromParcel(Parcel parcel) {
            VoucherCountdown voucherCountdownCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                voucherCountdownCreateFromParcel = null;
            } else {
                voucherCountdownCreateFromParcel = VoucherCountdown.CREATOR.createFromParcel(parcel);
            }
            return new DeductibleVoucherReminder(string, string2, string3, voucherCountdownCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeductibleVoucherReminder[] newArray(int i) {
            return new DeductibleVoucherReminder[i];
        }
    };
    public static final int $stable = 8;

    public DeductibleVoucherReminder() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeductibleVoucherReminder)) {
            return false;
        }
        DeductibleVoucherReminder deductibleVoucherReminder = (DeductibleVoucherReminder) obj;
        return Intrinsics.LJFF(this.title, deductibleVoucherReminder.title) && Intrinsics.LJFF(this.spuDeductionText, deductibleVoucherReminder.spuDeductionText) && Intrinsics.LJFF(this.schema, deductibleVoucherReminder.schema) && Intrinsics.LJFF(this.voucher_countdown, deductibleVoucherReminder.voucher_countdown);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spuDeductionText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VoucherCountdown voucherCountdown = this.voucher_countdown;
        return iHashCode3 + (voucherCountdown != null ? voucherCountdown.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeductibleVoucherReminder(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", spuDeductionText=");
        sbLIZ.append(this.spuDeductionText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", voucher_countdown=");
        sbLIZ.append(this.voucher_countdown);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.spuDeductionText);
        parcel.writeString(this.schema);
        VoucherCountdown voucherCountdown = this.voucher_countdown;
        if (voucherCountdown == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherCountdown.writeToParcel(parcel, i);
        }
    }

    public DeductibleVoucherReminder(String str, String str2, String str3, VoucherCountdown voucherCountdown) {
        this.title = str;
        this.spuDeductionText = str2;
        this.schema = str3;
        this.voucher_countdown = voucherCountdown;
    }
}
