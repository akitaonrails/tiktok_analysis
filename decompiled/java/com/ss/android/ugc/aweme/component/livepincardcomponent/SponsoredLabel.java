package com.ss.android.ugc.aweme.component.livepincardcomponent;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SponsoredLabel implements Serializable {
    public static final int $stable = 0;

    @C09CT("color")
    public final String color;

    @C09CT("color_text")
    public final String colorText;

    @C09CT("text")
    public final String text;

    public SponsoredLabel() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredLabel)) {
            return false;
        }
        SponsoredLabel sponsoredLabel = (SponsoredLabel) obj;
        return Intrinsics.LJFF(this.color, sponsoredLabel.color) && Intrinsics.LJFF(this.colorText, sponsoredLabel.colorText) && Intrinsics.LJFF(this.text, sponsoredLabel.text);
    }

    public int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.colorText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SponsoredLabel(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", colorText=");
        sbLIZ.append(this.colorText);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SponsoredLabel(String str, String str2, String str3) {
        this.color = str;
        this.colorText = str2;
        this.text = str3;
    }
}
