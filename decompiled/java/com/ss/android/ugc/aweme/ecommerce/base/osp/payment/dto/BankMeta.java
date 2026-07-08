package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BankMeta implements Parcelable {

    @C09CT("bank_code")
    public String bankCode;

    @C09CT("bank_name")
    public String bankName;

    @C09CT("icon_url")
    public String iconUrl;
    public static final Parcelable.Creator<BankMeta> CREATOR = new Parcelable.Creator<BankMeta>() { // from class: X.02iA
        @Override // android.os.Parcelable.Creator
        public final BankMeta createFromParcel(Parcel parcel) {
            return new BankMeta(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BankMeta[] newArray(int i) {
            return new BankMeta[i];
        }
    };
    public static final int $stable = 8;

    public BankMeta() {
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
        if (!(obj instanceof BankMeta)) {
            return false;
        }
        BankMeta bankMeta = (BankMeta) obj;
        return Intrinsics.LJFF(this.bankCode, bankMeta.bankCode) && Intrinsics.LJFF(this.bankName, bankMeta.bankName) && Intrinsics.LJFF(this.iconUrl, bankMeta.iconUrl);
    }

    public final int hashCode() {
        String str = this.bankCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BankMeta(bankCode=");
        sbLIZ.append(this.bankCode);
        sbLIZ.append(", bankName=");
        sbLIZ.append(this.bankName);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bankCode);
        parcel.writeString(this.bankName);
        parcel.writeString(this.iconUrl);
    }

    public BankMeta(String str, String str2, String str3) {
        this.bankCode = str;
        this.bankName = str2;
        this.iconUrl = str3;
    }
}
