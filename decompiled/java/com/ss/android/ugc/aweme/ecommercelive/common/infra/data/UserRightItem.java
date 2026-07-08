package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class UserRightItem {

    @C09CT("da_info")
    public final UserRightDaInfo daInfo;

    @C09CT("show_text")
    public final String showText;

    public UserRightItem() {
        this(null, null);
    }

    public UserRightItem(String str, UserRightDaInfo userRightDaInfo) {
        this.showText = str;
        this.daInfo = userRightDaInfo;
    }
}
