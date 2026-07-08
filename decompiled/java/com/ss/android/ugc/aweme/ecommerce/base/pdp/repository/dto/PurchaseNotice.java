package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseNotice implements Parcelable {

    @C09CT("desc")
    public String desc;
    public static final Parcelable.Creator<PurchaseNotice> CREATOR = new Parcelable.Creator<PurchaseNotice>() { // from class: X.02me
        @Override // android.os.Parcelable.Creator
        public final PurchaseNotice createFromParcel(Parcel parcel) {
            return new PurchaseNotice(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PurchaseNotice[] newArray(int i) {
            return new PurchaseNotice[i];
        }
    };
    public static final int $stable = 8;

    public PurchaseNotice() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseNotice) && Intrinsics.LJFF(this.desc, ((PurchaseNotice) obj).desc);
    }

    public final int hashCode() {
        String str = this.desc;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseNotice(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.desc);
    }

    public PurchaseNotice(String str) {
        this.desc = str;
    }
}
