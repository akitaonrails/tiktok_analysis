package com.ss.android.ugc.aweme.ui.standard.tag;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicIcon implements Serializable {
    public static final int $stable = 0;

    @C09CT("dark_mode_url")
    public final String darkModeUrl;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("tux_token")
    public final String tuxToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicIcon)) {
            return false;
        }
        DynamicIcon dynamicIcon = (DynamicIcon) obj;
        return Intrinsics.LJFF(this.tuxToken, dynamicIcon.tuxToken) && Intrinsics.LJFF(this.imageUrl, dynamicIcon.imageUrl) && Intrinsics.LJFF(this.darkModeUrl, dynamicIcon.darkModeUrl);
    }

    public int hashCode() {
        String str = this.tuxToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkModeUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicIcon(tuxToken=");
        sbLIZ.append(this.tuxToken);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", darkModeUrl=");
        sbLIZ.append(this.darkModeUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicIcon(String str, String str2, String str3) {
        this.tuxToken = str;
        this.imageUrl = str2;
        this.darkModeUrl = str3;
    }
}
