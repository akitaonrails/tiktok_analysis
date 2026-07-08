package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EmptyRefundOptionsContent {

    @C09CT("action_link")
    public final String actionLink;

    @C09CT("action_text")
    public final String actionText;

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    public EmptyRefundOptionsContent() {
        this(null, null, null, null);
    }

    public EmptyRefundOptionsContent(String str, String str2, String str3, String str4) {
        this.title = str;
        this.desc = str2;
        this.actionText = str3;
        this.actionLink = str4;
    }
}
