package com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LabelIcon implements Serializable {

    @C09CT("dark_icon")
    public Image darkIcon;

    @C09CT("light_icon")
    public Image lightIcon;

    @C09CT("rtl")
    public boolean rtl;

    public LabelIcon() {
        this(null, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelIcon)) {
            return false;
        }
        LabelIcon labelIcon = (LabelIcon) obj;
        return Intrinsics.LJFF(this.lightIcon, labelIcon.lightIcon) && Intrinsics.LJFF(this.darkIcon, labelIcon.darkIcon) && this.rtl == labelIcon.rtl;
    }

    public int hashCode() {
        Image image = this.lightIcon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkIcon;
        return ((iHashCode + (image2 != null ? image2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.rtl);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelIcon(lightIcon=");
        sbLIZ.append(this.lightIcon);
        sbLIZ.append(", darkIcon=");
        sbLIZ.append(this.darkIcon);
        sbLIZ.append(", rtl=");
        sbLIZ.append(this.rtl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LabelIcon(Image image, Image image2, boolean z) {
        this.lightIcon = image;
        this.darkIcon = image2;
        this.rtl = z;
    }
}
