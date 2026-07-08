package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoStickerUiConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PromoStickerUiConfig implements Parcelable {

    @C09CT("background_color")
    public final String backgroundColor;
    public static final Parcelable.Creator<PromoStickerUiConfig> CREATOR = new Parcelable.Creator<PromoStickerUiConfig>() { // from class: X.0vxI
        @Override // android.os.Parcelable.Creator
        public final PromoStickerUiConfig createFromParcel(Parcel parcel) {
            return new PromoStickerUiConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoStickerUiConfig[] newArray(int i) {
            return new PromoStickerUiConfig[i];
        }
    };
    public static final int $stable = 8;

    public PromoStickerUiConfig() {
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
        return (obj instanceof PromoStickerUiConfig) && Intrinsics.LJFF(this.backgroundColor, ((PromoStickerUiConfig) obj).backgroundColor);
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromoStickerUiConfig(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.backgroundColor);
    }

    public PromoStickerUiConfig(String str) {
        this.backgroundColor = str;
    }
}
