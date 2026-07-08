package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECWatcherWaterMark {

    @C09CT("c_schema")
    public final String cSchema;

    @C09CT("icon")
    public final Image icon;

    @C09CT("title")
    public final String title;

    public ECWatcherWaterMark() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECWatcherWaterMark)) {
            return false;
        }
        ECWatcherWaterMark eCWatcherWaterMark = (ECWatcherWaterMark) obj;
        return Intrinsics.LJFF(this.title, eCWatcherWaterMark.title) && Intrinsics.LJFF(this.icon, eCWatcherWaterMark.icon) && Intrinsics.LJFF(this.cSchema, eCWatcherWaterMark.cSchema);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.icon;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.cSchema;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECWatcherWaterMark(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", cSchema=");
        sbLIZ.append(this.cSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECWatcherWaterMark(String str, Image image, String str2) {
        this.title = str;
        this.icon = image;
        this.cSchema = str2;
    }
}
