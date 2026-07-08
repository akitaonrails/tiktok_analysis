package com.ss.android.ugc.gamora.celebration;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateTabStyleConfig {

    @C09CT("category_key")
    public final String category_key;

    @C09CT("gradient_color")
    public final String gradient_color;

    @C09CT("image")
    public final String image;

    @C09CT("lottie")
    public final String lottie;

    public TemplateTabStyleConfig() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateTabStyleConfig)) {
            return false;
        }
        TemplateTabStyleConfig templateTabStyleConfig = (TemplateTabStyleConfig) obj;
        return Intrinsics.LJFF(this.category_key, templateTabStyleConfig.category_key) && Intrinsics.LJFF(this.gradient_color, templateTabStyleConfig.gradient_color) && Intrinsics.LJFF(this.image, templateTabStyleConfig.image) && Intrinsics.LJFF(this.lottie, templateTabStyleConfig.lottie);
    }

    public final int hashCode() {
        String str = this.category_key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gradient_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lottie;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabStyleConfig(category_key=");
        sbLIZ.append(this.category_key);
        sbLIZ.append(", gradient_color=");
        sbLIZ.append(this.gradient_color);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", lottie=");
        sbLIZ.append(this.lottie);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateTabStyleConfig(String str, String str2, String str3, String str4) {
        this.category_key = str;
        this.gradient_color = str2;
        this.image = str3;
        this.lottie = str4;
    }
}
