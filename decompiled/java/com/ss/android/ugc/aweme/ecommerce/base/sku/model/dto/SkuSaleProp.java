package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuSaleProp implements Parcelable {

    @C09CT("prop_id")
    public String propId;

    @C09CT("prop_name")
    public String propName;

    @C09CT("prop_value")
    public String propValue;

    @C09CT("prop_value_id")
    public String propValueId;
    public static final Parcelable.Creator<SkuSaleProp> CREATOR = new Parcelable.Creator<SkuSaleProp>() { // from class: X.02lV
        @Override // android.os.Parcelable.Creator
        public final SkuSaleProp createFromParcel(Parcel parcel) {
            return new SkuSaleProp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuSaleProp[] newArray(int i) {
            return new SkuSaleProp[i];
        }
    };
    public static final int $stable = 8;

    public SkuSaleProp() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSaleProp)) {
            return false;
        }
        SkuSaleProp skuSaleProp = (SkuSaleProp) obj;
        return Intrinsics.LJFF(this.propId, skuSaleProp.propId) && Intrinsics.LJFF(this.propName, skuSaleProp.propName) && Intrinsics.LJFF(this.propValueId, skuSaleProp.propValueId) && Intrinsics.LJFF(this.propValue, skuSaleProp.propValue);
    }

    public final int hashCode() {
        String str = this.propId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propValueId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propValue;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuSaleProp(propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", propName=");
        sbLIZ.append(this.propName);
        sbLIZ.append(", propValueId=");
        sbLIZ.append(this.propValueId);
        sbLIZ.append(", propValue=");
        sbLIZ.append(this.propValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propId);
        parcel.writeString(this.propName);
        parcel.writeString(this.propValueId);
        parcel.writeString(this.propValue);
    }

    public SkuSaleProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propName = str2;
        this.propValueId = str3;
        this.propValue = str4;
    }
}
