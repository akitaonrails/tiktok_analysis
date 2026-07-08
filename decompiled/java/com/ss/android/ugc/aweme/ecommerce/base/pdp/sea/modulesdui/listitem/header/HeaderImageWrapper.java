package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HeaderImageWrapper {
    public static final int $stable = 8;
    public final String category;
    public final String extra;
    public final Image image;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderImageWrapper)) {
            return false;
        }
        HeaderImageWrapper headerImageWrapper = (HeaderImageWrapper) obj;
        return Intrinsics.LJFF(this.image, headerImageWrapper.image) && Intrinsics.LJFF(this.extra, headerImageWrapper.extra) && Intrinsics.LJFF(this.category, headerImageWrapper.category);
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        String str = this.extra;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderImageWrapper(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", category=");
        sbLIZ.append(this.category);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HeaderImageWrapper(Image image, String str, String str2) {
        this.image = image;
        this.extra = str;
        this.category = str2;
    }
}
