package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class AddToCartButtonInfo {

    @C09CT("click_hint")
    public final String clickHint;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public AddToCartButtonInfo(Integer num, String str) {
        this.status = num;
        this.clickHint = str;
    }
}
