package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class TitleTips {

    @C09CT("explanation_url")
    public String explanationUrl;

    @C09CT("tips")
    public String tips;

    public TitleTips() {
        this(null, null);
    }

    public TitleTips(String str, String str2) {
        this.tips = str;
        this.explanationUrl = str2;
    }
}
