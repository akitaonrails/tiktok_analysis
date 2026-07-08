package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PriceAfterCouponConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceAfterCouponConfig implements Parcelable {

    @C09CT("schema")
    public String schema;

    @C09CT("template")
    public String template;
    public static final Parcelable.Creator<PriceAfterCouponConfig> CREATOR = new Parcelable.Creator<PriceAfterCouponConfig>() { // from class: X.02md
        @Override // android.os.Parcelable.Creator
        public final PriceAfterCouponConfig createFromParcel(Parcel parcel) {
            return new PriceAfterCouponConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceAfterCouponConfig[] newArray(int i) {
            return new PriceAfterCouponConfig[i];
        }
    };
    public static final int $stable = 8;

    public PriceAfterCouponConfig() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceAfterCouponConfig)) {
            return false;
        }
        PriceAfterCouponConfig priceAfterCouponConfig = (PriceAfterCouponConfig) obj;
        return Intrinsics.LJFF(this.template, priceAfterCouponConfig.template) && Intrinsics.LJFF(this.schema, priceAfterCouponConfig.schema);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceAfterCouponConfig(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        parcel.writeString(this.schema);
    }

    public PriceAfterCouponConfig(String str, String str2) {
        this.template = str;
        this.schema = str2;
    }
}
