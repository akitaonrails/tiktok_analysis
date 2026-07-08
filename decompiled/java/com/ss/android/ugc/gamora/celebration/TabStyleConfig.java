package com.ss.android.ugc.gamora.celebration;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TabStyleConfig {

    @C09CT("exit_strategy")
    public final Integer exit_strategy;

    @C09CT("gradient_color")
    public final String gradient_color;

    @C09CT("image")
    public final String image;

    @C09CT("lottie")
    public final String lottie;

    public TabStyleConfig() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabStyleConfig)) {
            return false;
        }
        TabStyleConfig tabStyleConfig = (TabStyleConfig) obj;
        return Intrinsics.LJFF(this.gradient_color, tabStyleConfig.gradient_color) && Intrinsics.LJFF(this.image, tabStyleConfig.image) && Intrinsics.LJFF(this.lottie, tabStyleConfig.lottie) && Intrinsics.LJFF(this.exit_strategy, tabStyleConfig.exit_strategy);
    }

    public final int hashCode() {
        String str = this.gradient_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lottie;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.exit_strategy;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabStyleConfig(gradient_color=");
        sbLIZ.append(this.gradient_color);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", lottie=");
        sbLIZ.append(this.lottie);
        sbLIZ.append(", exit_strategy=");
        sbLIZ.append(this.exit_strategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TabStyleConfig(String str, String str2, String str3, Integer num) {
        this.gradient_color = str;
        this.image = str2;
        this.lottie = str3;
        this.exit_strategy = num;
    }
}
