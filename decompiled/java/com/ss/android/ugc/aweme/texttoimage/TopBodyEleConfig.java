package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TopBodyEleConfig {
    public transient String LIZ;
    public transient String LIZIZ;

    @C09CT("desc_font_color")
    public String descFontColor;

    @C09CT("desc_font_id")
    public String descFontId;

    @C09CT("desc_font_size")
    public Float descFontSize;

    @C09CT("user_font_color")
    public String userFontColor;

    @C09CT("user_font_id")
    public String userFontId;

    @C09CT("user_font_size")
    public Float userFontSize;

    /* JADX WARN: Multi-variable type inference failed */
    public TopBodyEleConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopBodyEleConfig)) {
            return false;
        }
        TopBodyEleConfig topBodyEleConfig = (TopBodyEleConfig) obj;
        return Intrinsics.LJFF(this.descFontId, topBodyEleConfig.descFontId) && Intrinsics.LJFF(this.descFontSize, topBodyEleConfig.descFontSize) && Intrinsics.LJFF(this.descFontColor, topBodyEleConfig.descFontColor) && Intrinsics.LJFF(this.userFontId, topBodyEleConfig.userFontId) && Intrinsics.LJFF(this.userFontSize, topBodyEleConfig.userFontSize) && Intrinsics.LJFF(this.userFontColor, topBodyEleConfig.userFontColor) && Intrinsics.LJFF(this.LIZ, topBodyEleConfig.LIZ) && Intrinsics.LJFF(this.LIZIZ, topBodyEleConfig.LIZIZ);
    }

    public final int hashCode() {
        String str = this.descFontId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.descFontSize;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.descFontColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFontId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f2 = this.userFontSize;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str4 = this.userFontColor;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LIZ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LIZIZ;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopBodyEleConfig(descFontId=");
        sbLIZ.append(this.descFontId);
        sbLIZ.append(", descFontSize=");
        sbLIZ.append(this.descFontSize);
        sbLIZ.append(", descFontColor=");
        sbLIZ.append(this.descFontColor);
        sbLIZ.append(", userFontId=");
        sbLIZ.append(this.userFontId);
        sbLIZ.append(", userFontSize=");
        sbLIZ.append(this.userFontSize);
        sbLIZ.append(", userFontColor=");
        sbLIZ.append(this.userFontColor);
        sbLIZ.append(", descFontPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userFontPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TopBodyEleConfig(String str, Float f, String str2, String str3, Float f2, String str4, String str5, String str6) {
        this.descFontId = str;
        this.descFontSize = f;
        this.descFontColor = str2;
        this.userFontId = str3;
        this.userFontSize = f2;
        this.userFontColor = str4;
        this.LIZ = str5;
        this.LIZIZ = str6;
    }

    public /* synthetic */ TopBodyEleConfig(String str, Float f, String str2, String str3, Float f2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
    }
}
