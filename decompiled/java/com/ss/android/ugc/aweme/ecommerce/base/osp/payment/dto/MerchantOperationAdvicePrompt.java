package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class MerchantOperationAdvicePrompt {

    @C09CT("pipo_action_type")
    public final String actionType;

    @C09CT("message")
    public final String message;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public MerchantOperationAdvicePrompt() {
        this(null, null, null, null);
    }

    public MerchantOperationAdvicePrompt(String str, String str2, String str3, String str4) {
        this.title = str;
        this.message = str2;
        this.type = str3;
        this.actionType = str4;
    }
}
