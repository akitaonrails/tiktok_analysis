package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBanner {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("dark_background_color")
    public String darkBackgroundColor;

    @C09CT("dark_font_color")
    public String darkFontColor;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("font_size")
    public Integer fontSize;

    @C09CT("label_name")
    public String labelName;

    @C09CT("redirect_info")
    public RedirectInfo redirectInfo;

    public PaymentBanner() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentBanner)) {
            return false;
        }
        PaymentBanner paymentBanner = (PaymentBanner) obj;
        return Intrinsics.LJFF(this.labelName, paymentBanner.labelName) && Intrinsics.LJFF(this.backgroundColor, paymentBanner.backgroundColor) && Intrinsics.LJFF(this.fontColor, paymentBanner.fontColor) && Intrinsics.LJFF(this.fontSize, paymentBanner.fontSize) && Intrinsics.LJFF(this.darkBackgroundColor, paymentBanner.darkBackgroundColor) && Intrinsics.LJFF(this.darkFontColor, paymentBanner.darkFontColor) && Intrinsics.LJFF(this.redirectInfo, paymentBanner.redirectInfo);
    }

    public final int hashCode() {
        String str = this.labelName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.fontSize;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.darkBackgroundColor;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkFontColor;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RedirectInfo redirectInfo = this.redirectInfo;
        return iHashCode6 + (redirectInfo != null ? redirectInfo.hashCode() : 0);
    }

    public static final class RedirectInfo {

        @C09CT("display_name")
        public String displayName;

        @C09CT("redirect_link")
        public String redirectLink;

        public RedirectInfo() {
            this(null, null);
        }

        public RedirectInfo(String str, String str2) {
            this.displayName = str;
            this.redirectLink = str2;
        }
    }

    public PaymentBanner(String str, String str2, String str3, Integer num, String str4, String str5, RedirectInfo redirectInfo) {
        this.labelName = str;
        this.backgroundColor = str2;
        this.fontColor = str3;
        this.fontSize = num;
        this.darkBackgroundColor = str4;
        this.darkFontColor = str5;
        this.redirectInfo = redirectInfo;
    }
}
