package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C18MU;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class AddToCartButton implements Serializable {
    public static final C18MU AddToCartButtonStatus = new Object() { // from class: X.18MU
    };

    @C09CT("available_count")
    public final Integer availableCount;

    @C09CT("click_hint")
    public final String clickHint;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public AddToCartButton() {
        this(null, null, null);
    }

    public AddToCartButton(Integer num, String str, Integer num2) {
        this.status = num;
        this.clickHint = str;
        this.availableCount = num2;
    }
}
