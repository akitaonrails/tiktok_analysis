package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetUIConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselWidgetUIConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CarouselWidgetUIConfig> CREATOR = new Parcelable.Creator<CarouselWidgetUIConfig>() { // from class: X.0vxK
        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetUIConfig createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new CarouselWidgetUIConfig(commonColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselWidgetUIConfig[] newArray(int i) {
            return new CarouselWidgetUIConfig[i];
        }
    };

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CarouselWidgetUIConfig) && Intrinsics.LJFF(this.backgroundColor, ((CarouselWidgetUIConfig) obj).backgroundColor);
    }

    public final int hashCode() {
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            return 0;
        }
        return commonColor.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselWidgetUIConfig(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
    }

    public CarouselWidgetUIConfig(CommonColor commonColor) {
        this.backgroundColor = commonColor;
    }
}
