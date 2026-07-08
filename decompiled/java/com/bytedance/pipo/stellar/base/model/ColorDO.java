package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ColorDO {

    @C09CT("alpha")
    public final Float alpha;

    @C09CT("dark")
    public final String darkColor;

    @C09CT("dark_mode")
    public final String darkMode;

    @C09CT("light")
    public final String lightColor;

    @C09CT("light_mode")
    public final String lightMode;

    @C09CT("token")
    public final String token;

    @C09CT("tux")
    public final String tux;

    public ColorDO() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDO)) {
            return false;
        }
        ColorDO colorDO = (ColorDO) obj;
        return Intrinsics.LJFF(this.darkMode, colorDO.darkMode) && Intrinsics.LJFF(this.lightMode, colorDO.lightMode) && Intrinsics.LJFF(this.darkColor, colorDO.darkColor) && Intrinsics.LJFF(this.lightColor, colorDO.lightColor) && Intrinsics.LJFF(this.tux, colorDO.tux) && Intrinsics.LJFF(this.token, colorDO.token) && Intrinsics.LJFF(this.alpha, colorDO.alpha);
    }

    public final int hashCode() {
        String str = this.darkMode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lightMode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lightColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tux;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.token;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.alpha;
        return iHashCode6 + (f != null ? f.hashCode() : 0);
    }

    public ColorDO(String str, String str2, String str3, String str4, String str5, String str6, Float f) {
        this.darkMode = str;
        this.lightMode = str2;
        this.darkColor = str3;
        this.lightColor = str4;
        this.tux = str5;
        this.token = str6;
        this.alpha = f;
    }
}
