package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CompatibleParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CompatibleParams implements Parcelable {

    @C09CT("flash_sale_id")
    public final String flashSaleId;
    public static final Parcelable.Creator<CompatibleParams> CREATOR = new Parcelable.Creator<CompatibleParams>() { // from class: X.0vxf
        @Override // android.os.Parcelable.Creator
        public final CompatibleParams createFromParcel(Parcel parcel) {
            return new CompatibleParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CompatibleParams[] newArray(int i) {
            return new CompatibleParams[i];
        }
    };
    public static final int $stable = 8;

    public CompatibleParams() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompatibleParams) && Intrinsics.LJFF(this.flashSaleId, ((CompatibleParams) obj).flashSaleId);
    }

    public final int hashCode() {
        String str = this.flashSaleId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompatibleParams(flashSaleId=");
        sbLIZ.append(this.flashSaleId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.flashSaleId);
    }

    public CompatibleParams(String str) {
        this.flashSaleId = str;
    }
}
