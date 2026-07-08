package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationDialog {

    @C09CT("confirm_button")
    public String confirmButton;

    @C09CT("description")
    public String description;

    @C09CT("reject_button_text")
    public String rejectButtonText;

    @C09CT("title")
    public String title;

    public AuthorizationDialog() {
    }

    public AuthorizationDialog(String str, String str2, String str3, String str4) {
        this.title = str;
        this.description = str2;
        this.confirmButton = str3;
        this.rejectButtonText = str4;
    }
}
