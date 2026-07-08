package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import X.C960203pA;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ThemeImage implements Parcelable {
    public static final Parcelable.Creator<ThemeImage> CREATOR = new Parcelable.Creator<ThemeImage>() { // from class: X.02fB
        @Override // android.os.Parcelable.Creator
        public final ThemeImage createFromParcel(Parcel parcel) {
            return new ThemeImage((Image) parcel.readParcelable(ThemeImage.class.getClassLoader()), (Image) parcel.readParcelable(ThemeImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ThemeImage[] newArray(int i) {
            return new ThemeImage[i];
        }
    };

    @C09CT("dark")
    public Image dark;

    @C09CT("light")
    public Image light;

    public ThemeImage() {
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
        if (!(obj instanceof ThemeImage)) {
            return false;
        }
        ThemeImage themeImage = (ThemeImage) obj;
        return Intrinsics.LJFF(this.light, themeImage.light) && Intrinsics.LJFF(this.dark, themeImage.dark);
    }

    public final int hashCode() {
        Image image = this.light;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.dark;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThemeImage(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.light, i);
        parcel.writeParcelable(this.dark, i);
    }

    public final Image LIZ(Context context) {
        if (C960203pA.LIZIZ(context)) {
            return this.dark;
        }
        return this.light;
    }

    public ThemeImage(Image image, Image image2) {
        this.light = image;
        this.dark = image2;
    }
}
