package com.ss.android.ugc.aweme.search.result;

import X.C09CT;
import X.C0QOD;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.model.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandSkin extends C0QOD {

    @C09CT("image_dark")
    public final Image imageDark;

    @C09CT("image_light")
    public final Image imageLight;

    public BrandSkin() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandSkin)) {
            return false;
        }
        BrandSkin brandSkin = (BrandSkin) obj;
        return Intrinsics.LJFF(this.imageLight, brandSkin.imageLight) && Intrinsics.LJFF(this.imageDark, brandSkin.imageDark);
    }

    public final int hashCode() {
        Image image = this.imageLight;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.imageDark;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrandSkin(imageLight=");
        sbLIZ.append(this.imageLight);
        sbLIZ.append(", imageDark=");
        sbLIZ.append(this.imageDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BrandSkin(Image image, Image image2) {
        this.imageLight = image;
        this.imageDark = image2;
    }
}
