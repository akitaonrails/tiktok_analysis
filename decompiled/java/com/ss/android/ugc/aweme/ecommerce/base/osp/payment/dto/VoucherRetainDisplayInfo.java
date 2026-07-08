package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherRetainDisplayInfo {

    @C09CT("voucher_retain_display_icon_url")
    public String iconUrl;

    @C09CT("voucher_retain_display_primary_button_text")
    public String primaryButton;

    @C09CT("voucher_retain_display_secondary_button_text")
    public String secondaryButton;

    @C09CT("voucher_retain_display_text")
    public String text;

    @C09CT("voucher_retain_display_title")
    public String title;

    public VoucherRetainDisplayInfo() {
        this(null, null, null, null, null);
    }

    public VoucherRetainDisplayInfo(String str, String str2, String str3, String str4, String str5) {
        this.iconUrl = str;
        this.title = str2;
        this.primaryButton = str3;
        this.secondaryButton = str4;
        this.text = str5;
    }
}
