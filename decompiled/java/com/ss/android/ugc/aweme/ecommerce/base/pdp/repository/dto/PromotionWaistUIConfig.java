package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider.RadiusConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistUIConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionWaistUIConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PromotionWaistUIConfig> CREATOR = new Parcelable.Creator<PromotionWaistUIConfig>() { // from class: X.0vyN
        @Override // android.os.Parcelable.Creator
        public final PromotionWaistUIConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            RadiusConfig radiusConfigCreateFromParcel;
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                radiusConfigCreateFromParcel = null;
            } else {
                radiusConfigCreateFromParcel = RadiusConfig.CREATOR.createFromParcel(parcel);
            }
            RadiusConfig radiusConfig = radiusConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new PromotionWaistUIConfig(numValueOf, numValueOf2, numValueOf3, radiusConfig, numValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionWaistUIConfig[] newArray(int i) {
            return new PromotionWaistUIConfig[i];
        }
    };

    @C09CT("bottom_margin")
    public final Integer bottomMargin;

    @C09CT("height")
    public final Integer height;

    @C09CT("horizontal_margin")
    public final Integer horizontalMargin;

    @C09CT("radius_config")
    public final RadiusConfig radiusConfig;

    @C09CT("top_margin")
    public final Integer topMargin;

    public PromotionWaistUIConfig() {
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
        if (!(obj instanceof PromotionWaistUIConfig)) {
            return false;
        }
        PromotionWaistUIConfig promotionWaistUIConfig = (PromotionWaistUIConfig) obj;
        return Intrinsics.LJFF(this.height, promotionWaistUIConfig.height) && Intrinsics.LJFF(this.topMargin, promotionWaistUIConfig.topMargin) && Intrinsics.LJFF(this.bottomMargin, promotionWaistUIConfig.bottomMargin) && Intrinsics.LJFF(this.radiusConfig, promotionWaistUIConfig.radiusConfig) && Intrinsics.LJFF(this.horizontalMargin, promotionWaistUIConfig.horizontalMargin);
    }

    public final int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.topMargin;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottomMargin;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        RadiusConfig radiusConfig = this.radiusConfig;
        int iHashCode4 = (iHashCode3 + (radiusConfig == null ? 0 : radiusConfig.hashCode())) * 31;
        Integer num4 = this.horizontalMargin;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionWaistUIConfig(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", topMargin=");
        sbLIZ.append(this.topMargin);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.bottomMargin);
        sbLIZ.append(", radiusConfig=");
        sbLIZ.append(this.radiusConfig);
        sbLIZ.append(", horizontalMargin=");
        sbLIZ.append(this.horizontalMargin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.topMargin;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.bottomMargin;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        RadiusConfig radiusConfig = this.radiusConfig;
        if (radiusConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radiusConfig.writeToParcel(parcel, i);
        }
        Integer num4 = this.horizontalMargin;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public PromotionWaistUIConfig(Integer num, Integer num2, Integer num3, RadiusConfig radiusConfig, Integer num4) {
        this.height = num;
        this.topMargin = num2;
        this.bottomMargin = num3;
        this.radiusConfig = radiusConfig;
        this.horizontalMargin = num4;
    }
}
