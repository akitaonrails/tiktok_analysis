package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonInfo {

    @C09CT("authorization_statement")
    public ECRichText authorizationStatement;

    @C09CT("global_button_style")
    public ButtonStyle globalButtonStyle;

    public ButtonInfo() {
    }

    public ButtonInfo(ButtonStyle buttonStyle, ECRichText eCRichText) {
        this.globalButtonStyle = buttonStyle;
        this.authorizationStatement = eCRichText;
    }
}
