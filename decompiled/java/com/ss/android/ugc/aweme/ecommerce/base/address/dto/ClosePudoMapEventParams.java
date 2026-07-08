package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ClosePudoMapEventParams {

    @C09CT("hasSearch")
    public final Boolean hasSearch;

    @C09CT("isSelectPudo")
    public final Boolean isSelectPudo;

    @C09CT("source")
    public final String source;

    @C09CT("toast_message")
    public final String toastMessage;

    public ClosePudoMapEventParams() {
        this(null, null, null, null);
    }

    public ClosePudoMapEventParams(Boolean bool, Boolean bool2, String str, String str2) {
        this.isSelectPudo = bool;
        this.hasSearch = bool2;
        this.source = str;
        this.toastMessage = str2;
    }
}
