package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcommerceStickerBg implements Serializable {

    @C09CT("url")
    public final String url;

    public EcommerceStickerBg() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcommerceStickerBg) && Intrinsics.LJFF(this.url, ((EcommerceStickerBg) obj).url);
    }

    public int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcommerceStickerBg(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcommerceStickerBg(String str) {
        this.url = str;
    }
}
