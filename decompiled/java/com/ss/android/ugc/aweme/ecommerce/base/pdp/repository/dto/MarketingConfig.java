package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MarketingConfig implements Parcelable {

    @C09CT("remove_price_str")
    public final Boolean removePriceStr;

    @C09CT("show_deduction_text")
    public final Boolean showDeductionText;
    public static final Parcelable.Creator<MarketingConfig> CREATOR = new Parcelable.Creator<MarketingConfig>() { // from class: X.03wi
        @Override // android.os.Parcelable.Creator
        public final MarketingConfig createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new MarketingConfig(boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketingConfig[] newArray(int i) {
            return new MarketingConfig[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingConfig)) {
            return false;
        }
        MarketingConfig marketingConfig = (MarketingConfig) obj;
        return Intrinsics.LJFF(this.removePriceStr, marketingConfig.removePriceStr) && Intrinsics.LJFF(this.showDeductionText, marketingConfig.showDeductionText);
    }

    public final int hashCode() {
        Boolean bool = this.removePriceStr;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.showDeductionText;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarketingConfig(removePriceStr=");
        sbLIZ.append(this.removePriceStr);
        sbLIZ.append(", showDeductionText=");
        sbLIZ.append(this.showDeductionText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.removePriceStr;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showDeductionText;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public MarketingConfig() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public MarketingConfig(Boolean bool, Boolean bool2) {
        this.removePriceStr = bool;
        this.showDeductionText = bool2;
    }
}
