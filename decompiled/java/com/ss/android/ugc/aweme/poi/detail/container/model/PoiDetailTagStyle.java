package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailTagStyle implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("end_icon")
    public final String endIcon;

    @C09CT("start_icon")
    public final String startIcon;

    @C09CT("text_color")
    public final String textColor;

    public PoiDetailTagStyle() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailTagStyle)) {
            return false;
        }
        PoiDetailTagStyle poiDetailTagStyle = (PoiDetailTagStyle) obj;
        return Intrinsics.LJFF(this.startIcon, poiDetailTagStyle.startIcon) && Intrinsics.LJFF(this.endIcon, poiDetailTagStyle.endIcon) && Intrinsics.LJFF(this.backgroundColor, poiDetailTagStyle.backgroundColor) && Intrinsics.LJFF(this.textColor, poiDetailTagStyle.textColor);
    }

    public int hashCode() {
        String str = this.startIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailTagStyle(startIcon=");
        sbLIZ.append(this.startIcon);
        sbLIZ.append(", endIcon=");
        sbLIZ.append(this.endIcon);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiDetailTagStyle(String str, String str2, String str3, String str4) {
        this.startIcon = str;
        this.endIcon = str2;
        this.backgroundColor = str3;
        this.textColor = str4;
    }
}
