package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreBrandInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreBrandInfo implements Parcelable {
    public static final Parcelable.Creator<StoreBrandInfo> CREATOR = new Parcelable.Creator<StoreBrandInfo>() { // from class: X.02fC
        @Override // android.os.Parcelable.Creator
        public final StoreBrandInfo createFromParcel(Parcel parcel) {
            ThemeImage themeImageCreateFromParcel;
            if (parcel.readInt() == 0) {
                themeImageCreateFromParcel = null;
            } else {
                themeImageCreateFromParcel = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            return new StoreBrandInfo(themeImageCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreBrandInfo[] newArray(int i) {
            return new StoreBrandInfo[i];
        }
    };

    @C09CT("brand_logo")
    public ThemeImage brandLogo;

    public StoreBrandInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreBrandInfo) && Intrinsics.LJFF(this.brandLogo, ((StoreBrandInfo) obj).brandLogo);
    }

    public final int hashCode() {
        ThemeImage themeImage = this.brandLogo;
        if (themeImage == null) {
            return 0;
        }
        return themeImage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreBrandInfo(brandLogo=");
        sbLIZ.append(this.brandLogo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ThemeImage themeImage = this.brandLogo;
        if (themeImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeImage.writeToParcel(parcel, i);
        }
    }

    public StoreBrandInfo(ThemeImage themeImage) {
        this.brandLogo = themeImage;
    }
}
