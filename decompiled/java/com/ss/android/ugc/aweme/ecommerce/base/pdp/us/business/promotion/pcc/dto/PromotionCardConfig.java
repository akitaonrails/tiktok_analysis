package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.BorderStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PromotionCardConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionCardConfig implements Parcelable {

    @C09CT("background_color")
    public final CustomColor backgroundColor;

    @C09CT("border_style")
    public final BorderStyle borderStyle;
    public static final Parcelable.Creator<PromotionCardConfig> CREATOR = new Parcelable.Creator<PromotionCardConfig>() { // from class: X.0vtU
        @Override // android.os.Parcelable.Creator
        public final PromotionCardConfig createFromParcel(Parcel parcel) {
            BorderStyle borderStyleCreateFromParcel;
            CustomColor customColor = (CustomColor) parcel.readParcelable(PromotionCardConfig.class.getClassLoader());
            if (parcel.readInt() == 0) {
                borderStyleCreateFromParcel = null;
            } else {
                borderStyleCreateFromParcel = BorderStyle.CREATOR.createFromParcel(parcel);
            }
            return new PromotionCardConfig(customColor, borderStyleCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionCardConfig[] newArray(int i) {
            return new PromotionCardConfig[i];
        }
    };
    public static final int $stable = 8;

    public PromotionCardConfig() {
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
        if (!(obj instanceof PromotionCardConfig)) {
            return false;
        }
        PromotionCardConfig promotionCardConfig = (PromotionCardConfig) obj;
        return Intrinsics.LJFF(this.backgroundColor, promotionCardConfig.backgroundColor) && Intrinsics.LJFF(this.borderStyle, promotionCardConfig.borderStyle);
    }

    public final int hashCode() {
        CustomColor customColor = this.backgroundColor;
        int iHashCode = (customColor == null ? 0 : customColor.hashCode()) * 31;
        BorderStyle borderStyle = this.borderStyle;
        return iHashCode + (borderStyle != null ? borderStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionCardConfig(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", borderStyle=");
        sbLIZ.append(this.borderStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.backgroundColor, i);
        BorderStyle borderStyle = this.borderStyle;
        if (borderStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            borderStyle.writeToParcel(parcel, i);
        }
    }

    public PromotionCardConfig(CustomColor customColor, BorderStyle borderStyle) {
        this.backgroundColor = customColor;
        this.borderStyle = borderStyle;
    }
}
