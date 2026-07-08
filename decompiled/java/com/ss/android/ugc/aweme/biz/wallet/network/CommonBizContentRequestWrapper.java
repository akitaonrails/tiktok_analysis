package com.ss.android.ugc.aweme.biz.wallet.network;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CommonBizContentRequestWrapper {

    @C09CT("biz_content")
    public final String bizContent;

    @C09CT("merchant_id")
    public final String merchantId;

    public CommonBizContentRequestWrapper() {
        this(null, null);
    }

    public CommonBizContentRequestWrapper(String str, String str2) {
        this.merchantId = str;
        this.bizContent = str2;
    }
}
