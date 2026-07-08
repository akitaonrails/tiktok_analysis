package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class NoticeDialogMessage {

    @C09CT("confirm_button_text")
    public final String confirmButtonText;

    @C09CT("content_text")
    public final String contentText;

    @C09CT("title_text")
    public final String titleText;

    public NoticeDialogMessage(String str, String str2, String str3) {
        this.titleText = str;
        this.contentText = str2;
        this.confirmButtonText = str3;
    }
}
