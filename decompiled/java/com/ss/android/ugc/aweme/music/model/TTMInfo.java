package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("brand")
    public TTMBrand brand;

    @C09CT("next_schema")
    public String nextSchema;

    @C09CT("product")
    public Integer product;

    @C09CT("vip_verification_schema")
    public String vipVerificationSchema;

    public static final class Companion {
    }

    public TTMInfo() {
        this(0, null, null, null);
    }

    public final boolean isTtm() {
        Integer num = this.product;
        return num != null && num.intValue() == 2;
    }

    public TTMInfo(Integer num, TTMBrand tTMBrand, String str, String str2) {
        this.product = num;
        this.brand = tTMBrand;
        this.vipVerificationSchema = str;
        this.nextSchema = str2;
    }
}
