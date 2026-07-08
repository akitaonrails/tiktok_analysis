package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes33.dex */
public final class AddToCartButton {

    @C09CT("click_hint")
    public final String clickHint;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public AddToCartButton() {
        this(null, 0);
    }

    public AddToCartButton(String str, int i) {
        this.clickHint = str;
        this.status = i;
    }
}
