package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonTextInfo {

    @C09CT("text")
    public String text;

    @C09CT("type")
    public Integer type;

    public ButtonTextInfo() {
        this(null, null);
    }

    public ButtonTextInfo(Integer num, String str) {
        this.type = num;
        this.text = str;
    }
}
