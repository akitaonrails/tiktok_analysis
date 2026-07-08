package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class SellingPointStyle {

    @C09CT("count_down_background_color")
    public String countDownBackgroundColor;

    @C09CT("count_down_background_dark_color")
    public String countDownBackgroundDarkColor;

    @C09CT("count_down_color")
    public String countDownColor;

    @C09CT("count_down_dark_color")
    public String countDownDarkColor;

    @C09CT("count_down_precision_type")
    public Integer countDownPrecisionType;

    @C09CT("style_type")
    public Integer styleType;

    @C09CT("text_background_color")
    public String textBackgroundColor;

    @C09CT("text_background_dark_color")
    public String textBackgroundDarkColor;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_dark_color")
    public String textDarkColor;

    public SellingPointStyle() {
    }

    public final int hashCode() {
        Integer num = this.styleType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.textColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textBackgroundColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countDownColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countDownBackgroundColor;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textDarkColor;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.textBackgroundDarkColor;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countDownDarkColor;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countDownBackgroundDarkColor;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.countDownPrecisionType;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellingPointStyle(styleType=");
        sbLIZ.append(this.styleType);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textBackgroundColor=");
        sbLIZ.append(this.textBackgroundColor);
        sbLIZ.append(", countDownColor=");
        sbLIZ.append(this.countDownColor);
        sbLIZ.append(", countDownBackgroundColor=");
        sbLIZ.append(this.countDownBackgroundColor);
        sbLIZ.append(", textDarkColor=");
        sbLIZ.append(this.textDarkColor);
        sbLIZ.append(", textBackgroundDarkColor=");
        sbLIZ.append(this.textBackgroundDarkColor);
        sbLIZ.append(", countDownDarkColor=");
        sbLIZ.append(this.countDownDarkColor);
        sbLIZ.append(", countDownBackgroundDarkColor=");
        sbLIZ.append(this.countDownBackgroundDarkColor);
        sbLIZ.append(", countDownPrecisionType=");
        sbLIZ.append(this.countDownPrecisionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SellingPointStyle(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num2) {
        this.styleType = num;
        this.textColor = str;
        this.textBackgroundColor = str2;
        this.countDownColor = str3;
        this.countDownBackgroundColor = str4;
        this.textDarkColor = str5;
        this.textBackgroundDarkColor = str6;
        this.countDownDarkColor = str7;
        this.countDownBackgroundDarkColor = str8;
        this.countDownPrecisionType = num2;
    }
}
