package com.ss.android.ugc.gamora.celebration;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TooltipConfig {

    @C09CT("content")
    public final String content;

    @C09CT("image")
    public final String image;

    public TooltipConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipConfig)) {
            return false;
        }
        TooltipConfig tooltipConfig = (TooltipConfig) obj;
        return Intrinsics.LJFF(this.content, tooltipConfig.content) && Intrinsics.LJFF(this.image, tooltipConfig.image);
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TooltipConfig(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TooltipConfig(String str, String str2) {
        this.content = str;
        this.image = str2;
    }
}
