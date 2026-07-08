package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivacyDialog {

    @C09CT("action_button")
    public PrivacyButton actionButton;

    @C09CT("close_button")
    public PrivacyButton closeButton;

    @C09CT("text")
    public ECRichText text;

    @C09CT("title")
    public String title;

    public PrivacyDialog() {
    }

    public PrivacyDialog(String str, ECRichText eCRichText, PrivacyButton privacyButton, PrivacyButton privacyButton2) {
        this.title = str;
        this.text = eCRichText;
        this.closeButton = privacyButton;
        this.actionButton = privacyButton2;
    }
}
