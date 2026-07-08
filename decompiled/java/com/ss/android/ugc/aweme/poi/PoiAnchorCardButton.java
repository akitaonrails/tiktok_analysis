package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorCardButton implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("corner_radius")
    public final Integer cornerRadius;

    @C09CT("font")
    public final String font;

    @C09CT("height")
    public final Integer height;

    @C09CT("max_width")
    public final Integer maxWidth;

    @C09CT("min_width")
    public final Integer minWidth;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("title")
    public final String title;

    public PoiAnchorCardButton() {
        this(null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.font;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.minWidth;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxWidth;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.cornerRadius;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public PoiAnchorCardButton(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4) {
        this.title = str;
        this.textColor = str2;
        this.font = str3;
        this.backgroundColor = str4;
        this.minWidth = num;
        this.maxWidth = num2;
        this.height = num3;
        this.cornerRadius = num4;
    }
}
