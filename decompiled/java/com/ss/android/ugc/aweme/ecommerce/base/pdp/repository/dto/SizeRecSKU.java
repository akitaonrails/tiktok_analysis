package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeRecSKU;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SizeRecSKU implements Parcelable {

    @C09CT("lynx_data")
    public String lynxData;

    @C09CT("schema")
    public String schema;
    public static final Parcelable.Creator<SizeRecSKU> CREATOR = new Parcelable.Creator<SizeRecSKU>() { // from class: X.02oF
        @Override // android.os.Parcelable.Creator
        public final SizeRecSKU createFromParcel(Parcel parcel) {
            return new SizeRecSKU(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeRecSKU[] newArray(int i) {
            return new SizeRecSKU[i];
        }
    };
    public static final int $stable = 8;

    public SizeRecSKU() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeRecSKU)) {
            return false;
        }
        SizeRecSKU sizeRecSKU = (SizeRecSKU) obj;
        return Intrinsics.LJFF(this.schema, sizeRecSKU.schema) && Intrinsics.LJFF(this.lynxData, sizeRecSKU.lynxData);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lynxData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SizeRecSKU(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", lynxData=");
        sbLIZ.append(this.lynxData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeString(this.lynxData);
    }

    public SizeRecSKU(String str, String str2) {
        this.schema = str;
        this.lynxData = str2;
    }
}
