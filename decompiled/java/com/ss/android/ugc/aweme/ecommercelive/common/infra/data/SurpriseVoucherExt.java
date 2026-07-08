package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SurpriseVoucherExt {

    @C09CT("animation")
    public final ClaimAnimation animation;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("label_color")
    public final String labelColor;

    @C09CT("label_text")
    public final String labelText;

    @C09CT("term_schema")
    public final String termSchema;

    @C09CT("title")
    public final String title;

    @C09CT("voucher_max_face_value")
    public final String voucherMaxFaceValue;

    public SurpriseVoucherExt() {
        this(null, null, null, null, null, null, null, null);
    }

    public SurpriseVoucherExt(String str, Icon icon, String str2, String str3, String str4, String str5, String str6, ClaimAnimation claimAnimation) {
        this.voucherMaxFaceValue = str;
        this.icon = icon;
        this.title = str2;
        this.desc = str3;
        this.labelText = str4;
        this.labelColor = str5;
        this.termSchema = str6;
        this.animation = claimAnimation;
    }
}
