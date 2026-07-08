package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentLabel {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("dark_background_color")
    public String darkBackgroundColor;

    @C09CT("dark_font_color")
    public String darkFontColor;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("label_name")
    public String labelName;

    public PaymentLabel() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentLabel)) {
            return false;
        }
        PaymentLabel paymentLabel = (PaymentLabel) obj;
        return Intrinsics.LJFF(this.labelName, paymentLabel.labelName) && Intrinsics.LJFF(this.backgroundColor, paymentLabel.backgroundColor) && Intrinsics.LJFF(this.fontColor, paymentLabel.fontColor) && Intrinsics.LJFF(this.darkBackgroundColor, paymentLabel.darkBackgroundColor) && Intrinsics.LJFF(this.darkFontColor, paymentLabel.darkFontColor);
    }

    public final int hashCode() {
        String str = this.labelName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkBackgroundColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkFontColor;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public PaymentLabel(String str, String str2, String str3, String str4, String str5) {
        this.labelName = str;
        this.backgroundColor = str2;
        this.fontColor = str3;
        this.darkBackgroundColor = str4;
        this.darkFontColor = str5;
    }
}
