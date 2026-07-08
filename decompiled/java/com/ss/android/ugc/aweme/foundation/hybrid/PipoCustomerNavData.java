package com.ss.android.ugc.aweme.foundation.hybrid;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoCustomerNavData implements Serializable {

    @C09CT("customer_service_url")
    public final String csUrl;

    @C09CT("retain_dialog_primary_button_text")
    public final String dialigPrimaryButton;

    @C09CT("retain_dialog_secondary_button_text")
    public final String dialigSecondaryButton;

    @C09CT("retain_dialog_content")
    public final String dialogContent;

    @C09CT("retain_dialog_header_image")
    public final String dialogHeaderImage;

    @C09CT("retain_dialog_title")
    public final String dialogTitle;

    @C09CT("header_image")
    public final Image headerImage;

    public PipoCustomerNavData() {
        this(null, null, null, null, null, null, null);
    }

    public PipoCustomerNavData(Image image, String str, String str2, String str3, String str4, String str5, String str6) {
        this.headerImage = image;
        this.csUrl = str;
        this.dialogHeaderImage = str2;
        this.dialogTitle = str3;
        this.dialogContent = str4;
        this.dialigPrimaryButton = str5;
        this.dialigSecondaryButton = str6;
    }
}
